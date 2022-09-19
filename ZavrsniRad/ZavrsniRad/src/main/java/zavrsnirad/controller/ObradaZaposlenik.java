/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Zaposlenik;
import zavrsnirad.util.EdunovaException;

/**
 *
 * @author X
 */
public class ObradaZaposlenik extends Obrada<Zaposlenik>{

    @Override
    public List<Zaposlenik> read() {
        return session.createQuery("from Zaposlenik",Zaposlenik.class).list();
    }

    @Override
    public void kontrolaCreate() throws EdunovaException {
        kontrolaNazivObavezno();
        kontrolaNazivIstiUBazi();
    }

    @Override
    public void kontrolaUpdate() throws EdunovaException {
    }

    @Override
    public void kontrolaDelete() throws EdunovaException {
    }

    @Override
    protected void getNazivEntiteta() {
    }

    private void kontrolaNazivObavezno() throws EdunovaException {
        if(entitet.getIme()==null || entitet.getIme().trim().isEmpty()){
            throw new EdunovaException("Ime zaposlenika obavezno");
        }
    }

    private void kontrolaNazivIstiUBazi() throws EdunovaException {
        Zaposlenik z=null;
        try {
            z=session.createQuery("from Zaposlenik z"+"where z.naziv=:naziv",Zaposlenik.class)
                    .setParameter("ime", entitet.getIme() ).getSingleResult();
        } catch (Exception e) {
        }
        if(z!=null)
            throw new EdunovaException("Isti zaposlenik već postoji");
    }
    
}
