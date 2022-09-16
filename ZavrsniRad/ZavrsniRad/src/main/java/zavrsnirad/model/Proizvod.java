package zavrsnirad.model;

import jakarta.persistence.Entity;

@Entity

public class Proizvod extends Entitet {
	
	private String vrsta;
	private String naziv;
	private Integer kolicina;
	private Integer cijena;
	
	
	
	
	
	public Proizvod(Integer sifra, String vrsta, String naziv, Integer kolicina, Integer cijena) {
		super(sifra);
		this.vrsta = vrsta;
		this.naziv = naziv;
		this.kolicina = kolicina;
		this.cijena = cijena;
	}
	public Proizvod() {
		super();
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Integer getKolicina() {
		return kolicina;
	}
	public void setKolicina(Integer kolicina) {
		this.kolicina = kolicina;
	}
	public Integer getCijena() {
		return cijena;
	}
	public void setCijena(Integer cijena) {
		this.cijena = cijena;
	}
	public void setSifra(int ucitajInt) {
		
		
	}
	
	

}
