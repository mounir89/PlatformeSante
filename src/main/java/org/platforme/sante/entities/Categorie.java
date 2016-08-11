package org.platforme.sante.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="categorie")
public class Categorie implements Serializable{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_categorie")
	private Long idCategorie;
	
	@Column(name="nom_categorie")
	@NotEmpty
	@Min(4)
	private String nomCategorie;
	
    @OneToMany(mappedBy="categorie")
	private Collection<Contenu> contenus = new HashSet<Contenu>();

    
    public void addContenu(Contenu c){
    	
    	c.setCategorie(this);
    	contenus.add(c);
    }
    
	public Long getIdCategorie() {
		
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public Collection<Contenu> getContenus() {
		return contenus;
	}

	public void setContenus(Collection<Contenu> contenus) {
		this.contenus = contenus;
	}

	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorie(String nomCategorie) {
		super();
		this.nomCategorie = nomCategorie;
	}
	
}
