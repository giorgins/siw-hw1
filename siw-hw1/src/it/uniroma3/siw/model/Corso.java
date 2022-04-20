package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;
import java.time.Duration;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity
public class Corso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    
    private LocalDate dataInizio;
    private Duration durata;
    @ManyToMany
    private List<Allievo> allievi;
    // Lazy perche mi potrebbe interessare solo le info del corso e non del docente
    // Ho messo cascade perche senza il docente non c'e' un corso
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Docente docente;
  

    

    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}
	public Duration getDurata() {
		return durata;
	}
	public void setDurata(Duration durata) {
		this.durata = durata;
	}
	public List<Allievo> getAllievi() {
		return allievi;
	}
	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}
	public Long getId() {
        return id;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public boolean equals(Object obj) {
        Corso product = (Corso)obj;
        return this.getId().equals(product.getId());
   }

    public int hashCode() {
        return this.id.hashCode();
     }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Corso");
        sb.append("{id=").append(id);
        sb.append(", name='").append(name);
        
        sb.append("}\n");
        return sb.toString();
    }
}
