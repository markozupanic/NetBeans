package edunova.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass

public abstract class Entitet {
	
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sifra;

	public Integer getSifra() {
		return sifra;
	}

	public void setSifra(Integer sifra) {
		this.sifra = sifra;
	}

	public Entitet() {
		super();
	}

	public Entitet(Integer sifra) {
		super();
		this.sifra = sifra;
	}
	
	
	
	
	

}
