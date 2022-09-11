package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity

public class ProizvodRezervacije extends Entitet{
	@ManyToOne
	private Proizvod proizvod;
        @ManyToOne
	private Rezervacija rezervacija;
	
	
	
	
	public ProizvodRezervacije(Integer sifra, Proizvod proizvod, Rezervacija rezervacija) {
		super(sifra);
		this.proizvod = proizvod;
		this.rezervacija = rezervacija;
	}
	public ProizvodRezervacije() {
		super();
	}
	public Proizvod getProizvod() {
		return proizvod;
	}
	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	public Rezervacija getRezervacija() {
		return rezervacija;
	}
	public void setRezervacija(Rezervacija rezervacija) {
		this.rezervacija = rezervacija;
	}
	
	
}
