/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.util;

import com.github.javafaker.Faker;
import org.hibernate.Session;
import zavrsnirad.model.Zaposlenik;

/**
 *
 * @author X
 */
public class PocetniInsert {
    
    public static void izvedi(){
        Session s=HibernateUtil.getSession();
        s.beginTransaction();
        
        Faker f=new Faker();
        Zaposlenik zaposlenik;
        for(int i=0;i<10;i++){
            zaposlenik=new Zaposlenik();
            zaposlenik.setIme(f.artist().name());
            s.persist(zaposlenik);
        }
    }
    
}
