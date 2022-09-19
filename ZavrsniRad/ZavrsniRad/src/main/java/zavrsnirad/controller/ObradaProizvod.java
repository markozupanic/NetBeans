/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.math.BigDecimal;
import java.util.List;
import zavrsnirad.model.Proizvod;
import zavrsnirad.util.EdunovaException;

/**
 *
 * @author X
 */
public class ObradaProizvod extends Obrada<Proizvod>{

    @Override
    public List<Proizvod> read() {
        return session.createQuery("from Proizvod",Proizvod.class).list();
    }

    @Override
    public void kontrolaCreate() throws EdunovaException {
        if(entitet==null){
            throw new EdunovaException("Proizvod nije konstriran");
        }
        kontrolaNaziv();
        kontrolaCijena();
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

    private void kontrolaNaziv() throws EdunovaException {
        kontrolaNazivMoraBitUnesena();
        kontrolaNazivBrojZnakova(50);
        kontrolaIstiNazivUBazi();
    }

    private void kontrolaCijena() throws EdunovaException{
        if(entitet.getCijena()==null || entitet.getCijena().equals(BigDecimal.ZERO)){
            throw new EdunovaException("Cijena nije postavljena ili je 0");
        }
    }

    private void kontrolaNazivMoraBitUnesena() throws EdunovaException {
        if(entitet.getNaziv()==null || entitet.getNaziv().trim().isEmpty()){
            throw new EdunovaException("Naziv proizvoda obavezan");
        }
    }

    private void kontrolaNazivBrojZnakova(int brojZnakova) throws EdunovaException {
        if(entitet.getNaziv().length()>brojZnakova){
            throw new EdunovaException("Naziv ne smije imati višse od "
            + brojZnakova + "znakova");
        }
    }

    private void kontrolaIstiNazivUBazi() throws EdunovaException {
        Proizvod p=null;
        try {
            p =session.createQuery("from Proizvod p" + "where s.naziv=naziv",Proizvod.class
            ).setParameter("naziv", entitet.getNaziv()).getSingleResult();
        } catch (Exception e) {
        }
        if(p!=null){
            throw new EdunovaException("Isti naziv proizvoda već postoji");
        }
    }
    
}
