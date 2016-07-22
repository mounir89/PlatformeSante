package org.platforme.sante.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Categorie implements Serializable{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategorie;
	
	@Column(name="nom_categorie")
	private String nomCategorie;
	
    @OneToMany
    @JoinColumn(name="id_contenu")
	private Collection<Contenu> contenus;

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
