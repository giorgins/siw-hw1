package it.uniroma3.siw.model;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

		@Entity
		public class Allievo {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private int matricola;

	    private String name;
	    private String cognome;
	    private LocalDate dataNascita;
	    private String email;
	    
	    @OneToOne(fetch = FetchType.LAZY)
	    private Societa societa;
	    @ManyToMany(mappedBy="allievi")
	    private List<Corso> corsi;
	    
		public int getMatricola() {
			return matricola;
		}
		public void setMatricola(int matricola) {
			this.matricola = matricola;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCognome() {
			return cognome;
		}
		public void setCognome(String cognome) {
			this.cognome = cognome;
		}
		public LocalDate getDataNascita() {
			return dataNascita;
		}
		public void setDataNascita(LocalDate dataNascita) {
			this.dataNascita = dataNascita;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Societa getSocieta() {
			return societa;
		}
		public void setSocieta(Societa societa) {
			this.societa = societa;
		}
		   public boolean equals(Object obj) {
		        Allievo product = (Allievo)obj;
		        return this.getId().equals(product.getId());
		   }

		    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
			public int hashCode() {
		        return this.id.hashCode();
		     }

		    public String toString() {
		        final StringBuilder sb = new StringBuilder();
		        sb.append("Allievo");
		        sb.append("{matricola=").append(matricola);
		        sb.append(", name='").append(name);
		        
		        sb.append("}\n");
		        return sb.toString();
		    }
	  
}
