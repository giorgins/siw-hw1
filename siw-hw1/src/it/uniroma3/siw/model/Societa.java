package it.uniroma3.siw.model;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Societa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String RagioneSociale;
    
    private int numeroCell;
    @OneToOne
    private Indirizzo indirizzo;
    
  
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRagioneSociale() {
		return RagioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		RagioneSociale = ragioneSociale;
	}

	public int getNumeroCell() {
		return numeroCell;
	}

	public void setNumeroCell(int numeroCell) {
		this.numeroCell = numeroCell;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	 public boolean equals(Object obj) {
	        Societa product = (Societa)obj;
	        return this.getId().equals(product.getId());
	   }

	    public int hashCode() {
	        return this.id.hashCode();
	     }

  
}
