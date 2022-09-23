/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Operater;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author X
 */
public class ObradaOperater extends ObradaOsoba<Operater>{

    Operater o;
    public Operater autoriziraj(String email,char[] lozinka){
       
        try {
            
        
        o=session.createQuery("from Operater where email=:email",
                Operater.class)
                .setParameter("email", email)
                .getSingleResult();
        
         } catch (Exception e) {
             return null;
        }
        
        if(BCrypt.checkpw(new String(lozinka) , o.getLozinka())){
        
        Operater vrati=new Operater();
        vrati.setSifra(o.getSifra());
        vrati.setIme(o.getIme());
        vrati.setPrezime(o.getPrezime());
        vrati.setEmail(o.getEmail());
        return vrati;
    }
        return null;
        
    }
    
    
    @Override
    public List<Operater> read() {
        return session.createQuery("from Operater",Operater.class).list();
    }

    @Override
    protected String getNazivEntiteta() {
        return "Operater";
    }
    
}
