package org.platforme.sante.entities;

import java.io.Serializable;
import java.util.Collection;

public class SousCategorie implements Serializable{
 
	
	private Long idSousCatgeorie;
	private String nomSousCategorie;
	
	private Categorie categorie;
	
	private Collection<Contenu> contenus;

	public Long getIdSousCatgeorie() {
		return idSousCatgeorie;
	}

	public void setIdSousCatgeorie(Long idSousCatgeorie) {
		this.idSousCatgeorie = idSousCatgeorie;
	}

	public String getNomSousCategorie() {
		return nomSousCategorie;
	}

	public void setNomSousCategorie(String nomSousCategorie) {
		this.nomSousCategorie = nomSousCategorie;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Collection<Contenu> getContenus() {
		return contenus;
	}

	public void setContenus(Collection<Contenu> contenus) {
		this.contenus = contenus;
	}

	public SousCategorie(String nomSousCategorie) {
		super();
		this.nomSousCategorie = nomSousCategorie;
	}

	public SousCategorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
