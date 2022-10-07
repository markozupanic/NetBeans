/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Polaznik;
import edunova.util.EdunovaException;
import java.util.List;

/**
 *
 * @author X
 */
public class ObradaPolaznik extends ObradaOsoba<Polaznik> {

    @Override
    public List<Polaznik> read() {
        return session.createQuery("from Polaznik", Polaznik.class).list();
    }

    public List<Polaznik> read(String uvjet) {
        return session.createQuery("from Polaznik p where "
                + " lower(concat(p.ime,' ', p.prezime)) like :uvjet",
                Polaznik.class)
                .setParameter("uvjet", "%" + uvjet.toLowerCase() + "%")
                .setMaxResults(10)
                .list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        super.kontrolaCreate();
        kontrolaBrojUgovora();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String getNazivEntiteta() {
        return "Polaznik";
    }

    private void kontrolaBrojUgovora() throws EdunovaException {
        kontrolaBrojUgovoraMoraImatiZnakPodjeljeno();

    }

    private void kontrolaBrojUgovoraMoraImatiZnakPodjeljeno() throws EdunovaException {
        if (entitet.getBrojUgovora() != null && !entitet.getBrojUgovora().trim().isEmpty()) {
            if (!entitet.getBrojUgovora().contains("/")) {
                throw new EdunovaException("Broj ugovora mora imati znak /");
            }
        }
    }

}
