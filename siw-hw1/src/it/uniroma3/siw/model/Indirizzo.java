package it.uniroma3.siw.model;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Indirizzo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String via;
    
    private int nCivico;
    private String comune;
    private int cap;
    private String provincia;
    
    
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getnCivico() {
		return nCivico;
	}

	public void setnCivico(int nCivico) {
		this.nCivico = nCivico;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public boolean equals(Object obj) {
        Indirizzo product = (Indirizzo)obj;
        return this.getId().equals(product.getId());
   }

    public int hashCode() {
        return this.id.hashCode();
     }

}
