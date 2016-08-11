package org.platforme.sante.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="sousCategorie")
public class SousCategorie implements Serializable{
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_sous_categorie")
	private Long idSousCatgeorie;
	
	@Column(name="nom_sous_categorie")
	@NotEmpty
	@Min(2)
	private String nomSousCategorie;
	
	@ManyToOne
	@JoinColumn(name="id_categorie")
	private Categorie categorie;
	
	@OneToMany(mappedBy="sousCategorie")
	private Collection<Contenu> contenus = new HashSet<Contenu>();

	
	public void addContenu(Contenu c){
		
		c.setSousCategorie(this);
		contenus.add(c);
	}
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
