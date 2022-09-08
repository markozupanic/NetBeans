/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import com.github.javafaker.Faker;

import edunova.model.Smjer;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author X
 */
public class PocetniInsert {
    
    public static void izvedi(){
        Session s =HibernateUtil.getSession();
        s.beginTransaction();
        
        Faker f=new Faker();
        Smjer smjer;
        for(int i=0;i<10;i++){
            
            smjer=new Smjer();
            smjer.setNaziv((f.beer().name()));
            s.persist(smjer);
        }     
        
        s.getTransaction().commit();
        
        
        
        
    }
    
}
