package org.platforme.sante.entities;

import java.util.*;

import javax.persistence.CascadeType;
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
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="contenu")
public class Contenu {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_contenu")
	private Long idContenu;
	
	@NotEmpty
	@Size(min=4)
	private String titre;
	
	@Column(name="date_creation")
	private Date dateCreation;
	
	@NotEmpty
	@Size(min=4)
	private String contenu;
	
	@Column(name="nombre_vue")
	private double nombreVue;
	
	@Column(name="nombre_like")
	private double nombreLike;
	
	@Column(name="nombre_dislike")
	private double nombreDislike;
	
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;
	
	@OneToMany(cascade={CascadeType.REMOVE, CascadeType.PERSIST})
	@JoinColumn(name="id_contenu")
	private Collection<Image> images = new HashSet<Image>();
	
	@OneToMany(cascade={CascadeType.REMOVE, CascadeType.PERSIST})
	@JoinColumn(name="id_contenu")
	private Collection<Video> videos = new HashSet<Video>();
	
	@OneToMany(cascade=CascadeType.REMOVE)
	@JoinColumn(name="id_contenu")
	private Collection<Commentaire> commentaires = new HashSet<Commentaire>();
	
	@ManyToOne
	@JoinColumn(name="id_categorie")
	private Categorie categorie;
	
	@ManyToOne
	@JoinColumn(name="id_sous_categorie")
	private SousCategorie sousCategorie;
	
	@OneToOne
	@JoinColumn(name="id_favori")
	private Favori favori;
	
	
	public void addImage(Image i){
		
		images.add(i);			
	}
	
	public void addCommentaire(Commentaire c){
	     

	     commentaires.add(c);
	}
	
	public void addVideo(Video v){
		

		videos.add(v);
	}
	
	public Long getIdContenu() {
		return idContenu;
	}
	public void setIdContenu(Long idContenu) {
		this.idContenu = idContenu;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public double getNombreVue() {
		return nombreVue;
	}
	public void setNombreVue(double nombreVue) {
		this.nombreVue = nombreVue;
	}
	public double getNombreLike() {
		return nombreLike;
	}
	public void setNombreLike(double nombreLike) {
		this.nombreLike = nombreLike;
	}
	public double getNombreDislike() {
		return nombreDislike;
	}
	public void setNombreDislike(double nombreDislike) {
		this.nombreDislike = nombreDislike;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Collection<Image> getImages() {
		return images;
	}
	public void setImages(Collection<Image> images) {
		this.images = images;
	}
	public Collection<Video> getVideos() {
		return videos;
	}
	public void setVideos(Collection<Video> videos) {
		this.videos = videos;
	}
	public Collection<Commentaire> getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(Collection<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public SousCategorie getSousCategorie() {
		return sousCategorie;
	}
	public void setSousCategorie(SousCategorie sousCategorie) {
		this.sousCategorie = sousCategorie;
	}
	public Contenu() {
		super();
	}
	public Contenu(String titre, String contenu) {
		super();
		this.titre = titre;
		this.contenu = contenu;
	}

	
	
	
	
	
}
