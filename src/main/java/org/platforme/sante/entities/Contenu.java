package org.platforme.sante.entities;

import java.util.*;


public class Contenu {

	private Long idContenu;
	private String titre;
	private Date dateCreation;
	private String contenu;
	private double nombreVue;
	private double nombreLike;
	private double nombreDislike;
	
	private User user;
	private Collection<Image> images ;
	private Collection<Video> videos;
	
	private Collection<Commentaire> commentaires;
	
	private Categorie categorie;
	private SousCategorie sousCategorie;
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
