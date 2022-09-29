/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.util;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import static java.util.Date.from;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;
import zavrsnirad.model.Operater;
import zavrsnirad.model.Proizvod;
import zavrsnirad.model.Rezervacija;
import zavrsnirad.model.Zaposlenik;

/**
 *
 * @author X
 */
public class PocetniInsert {

    private List<Proizvod> proizvodi;
    private List<Rezervacija> rezervacije;
    private List<Zaposlenik> zaposlenici;

    private Session sess;
    private Faker faker;

    public PocetniInsert() {

        proizvodi = new ArrayList<>();
        rezervacije = new ArrayList<>();
        zaposlenici = new ArrayList<>();

        sess = HibernateUtil.getSession();
        faker = new Faker();
        sess.beginTransaction();
        kreirajProizvode(50);
        kreirajReazervacije(15);
        kreirajZaposlenike(5);
        kreirajOperatera();
        sess.getTransaction().commit();

    }

    private void kreirajProizvode(int broj) {
        for (int i = 0; i < broj; i++) {
            proizvodi.add(kreirajProizvod());
        }
    }

    private Proizvod kreirajProizvod() {
        Proizvod p = new Proizvod();
        p.setNaziv(faker.food().dish());
        sess.persist(p);
        return p;
    }

    private void kreirajReazervacije(int broj) {
        for (int i = 0; i < broj; i++) {
            rezervacije.add(kreirajRezervaciju());
        }
    }

    private Rezervacija kreirajRezervaciju() {
        Rezervacija r = new Rezervacija();
        r.setTerminDolaska(faker.date().past(30, TimeUnit.DAYS));
        sess.persist(r);
        return r;
    }

    private void kreirajZaposlenike(int broj) {
        for (int i = 0; i < broj; i++) {
            zaposlenici.add(kreirajZaposlenika());
        }
    }

    private Zaposlenik kreirajZaposlenika() {
        Zaposlenik z = new Zaposlenik();
        z.setIme(faker.name().firstName());
        sess.persist(z);
        return z;
    }

    private void kreirajOperatera() {
        
         Operater o = new Operater();
        o.setIme("Marko");
        o.setPrezime("Županić");
        o.setEmail(o.getIme().toLowerCase() + o.getPrezime().toLowerCase() + "@gmail.com");
        o.setLozinka(BCrypt.hashpw("m", BCrypt.gensalt()));
        sess.persist(o);
        
    }

}
