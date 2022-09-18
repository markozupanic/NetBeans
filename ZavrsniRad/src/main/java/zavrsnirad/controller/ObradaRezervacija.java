/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Rezervacija;
import zavrsnirad.util.EdunovaException;

/**
 *
 * @author X
 */
public class ObradaRezervacija extends Obrada<Rezervacija>{

    @Override
    public List<Rezervacija> read() {
        return session.createQuery("from Rezervacija",Rezervacija.class).list();
    }

    @Override
    public void kontrolaCreate() throws EdunovaException {
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
    
}
