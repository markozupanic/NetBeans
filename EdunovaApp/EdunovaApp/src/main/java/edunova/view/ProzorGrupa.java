/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edunova.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import edunova.controller.ObradaGrupa;
import edunova.controller.ObradaPredavac;
import edunova.controller.ObradaSmjer;
import edunova.model.Grupa;
import edunova.model.Predavac;
import edunova.model.Smjer;
import edunova.util.Pomocno;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author X
 */
public class ProzorGrupa extends javax.swing.JFrame {

    private ObradaGrupa obrada;

    /**
     * Creates new form ProzorGrupa
     */
    public ProzorGrupa() {
        initComponents();
        obrada = new ObradaGrupa();
        postavke();
        ucitaj();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbSmjerovi = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbPredavac = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        dpDatumPocetka = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jLabel1.setText("Naziv");

        jLabel2.setText("Smjer");

        jLabel3.setText("Predavač");

        jLabel4.setText("Datum početka");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(txtNaziv)
                        .addComponent(jLabel2)
                        .addComponent(cmbSmjerovi, 0, 233, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(cmbPredavac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(dpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(0, 645, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbSmjerovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPredavac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if (evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue() == null) {
            return;
        }
        obrada.setEntitet(lstEntiteti.getSelectedValue());
        popuniView();
    }//GEN-LAST:event_lstEntitetiValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Predavac> cmbPredavac;
    private javax.swing.JComboBox<Smjer> cmbSmjerovi;
    private com.github.lgooddatepicker.components.DatePicker dpDatumPocetka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Grupa> lstEntiteti;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables

    private void postavke() {
        setTitle(Pomocno.NAZIV_APLIKACIJE + " " + " Grupe");

        ucitajSmjerove();
        ucitajPredavace();
        prilagodiDatePicker();

    }
    
    private void prilagodiDatePicker(){
        
        DatePickerSettings dps=new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra(Pomocno.FORMAT_DATUMA);
        dps.setTranslationClear("Očisti");
        dps.setTranslationToday("Danas");
        dpDatumPocetka.setSettings(dps);
    }

    private void ucitajSmjerove() {
        DefaultComboBoxModel<Smjer> s = new DefaultComboBoxModel<>();
        s.addAll(new ObradaSmjer().read());
        cmbSmjerovi.setModel(s);
    }

    private void ucitaj() {
        lstEntiteti.setModel(new EdunovaListModel<>(obrada.read()));

    }
    
    

    private void popuniView() {

        var e = obrada.getEntitet();

        txtNaziv.setText(e.getNaziv());
        cmbSmjerovi.setSelectedItem(e.getSmjer());
        cmbPredavac.setSelectedItem(e.getPredavac());
        Date input=e.getDatumPocetka();
        LocalDate date=input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        dpDatumPocetka.setDate(date);
    }

    private void ucitajPredavace() {
        DefaultComboBoxModel<Predavac> p = new DefaultComboBoxModel<>();
        p.addAll(new ObradaPredavac().read());
        cmbPredavac.setModel(p);
    }
}