/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

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
