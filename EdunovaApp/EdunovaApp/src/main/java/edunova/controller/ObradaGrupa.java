/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Grupa;
import edunova.util.EdunovaException;
import java.util.List;

/**
 *
 * @author X
 */
public class ObradaGrupa extends Obrada<Grupa>{

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
    
}
