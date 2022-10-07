/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Clan;
import edunova.model.Grupa;
import edunova.util.EdunovaException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author X
 */
public class ObradaGrupa extends Obrada<Grupa>{

    @Override
    public void update() throws EdunovaException {
        kontrolaUpdate();
        session.beginTransaction();
        for(Clan c:entitet.getClanovi()){
            session.persist(c);
        }
        session.persist(entitet);
        session.getTransaction().commit();
        
    }

    
    
    
    @Override
    public List<Grupa> read() {
        // from Grupa označava sve entitete klase Grupa. Ne ide se na ime tablice već se ide na ime klase
        return session.createQuery("from Grupa", Grupa.class).list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
    }

    @Override
    protected String getNazivEntiteta() {
        return "Grupa";
    }

    public void pocistiClanove() {
        session.beginTransaction();
        for(Clan c:entitet.getClanovi()){
            session.remove(c);
        }
        
        session.getTransaction().commit();
        entitet.setClanovi(new ArrayList<>());


    }
    
}
