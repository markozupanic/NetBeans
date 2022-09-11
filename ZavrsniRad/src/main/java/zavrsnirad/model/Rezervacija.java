package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Rezervacija extends Entitet{
	
	private Integer brojLjudi;
	private Date terminDolaska;
	private String kontakt;
        @ManyToOne
	private Zaposlenik zaposlenik;
	
	
	
	
	
	public Rezervacija(Integer sifra, Integer brojLjudi, Date terminDolaska, String kontakt, Zaposlenik zaposlenik) {
		super(sifra);
		this.brojLjudi = brojLjudi;
		this.terminDolaska = terminDolaska;
		this.kontakt = kontakt;
		this.zaposlenik = zaposlenik;
	}
	public Rezervacija() {
		super();
	}
	public Integer getBrojLjudi() {
		return brojLjudi;
	}
	public void setBrojLjudi(Integer brojLjudi) {
		this.brojLjudi = brojLjudi;
	}
	public Date getTerminDolaska() {
		return terminDolaska;
	}
	public void setTerminDolaska(Date terminDolaska) {
		this.terminDolaska = terminDolaska;
	}
	public String getKontakt() {
		return kontakt;
	}
	public void setKontakt(String kontakt) {
		this.kontakt = kontakt;
	}
	public Zaposlenik getZaposlenik() {
		return zaposlenik;
	}
	public void setZaposlenik(Zaposlenik zaposlenik) {
		this.zaposlenik = zaposlenik;
	}
	
	
	
	

}
