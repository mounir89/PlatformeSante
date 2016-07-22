package org.platforme.sante.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Commentaire implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCommentaire;
	
	@Column(name="date_commentaire")
	private Date dateCommentaire;
	
	@Column(name="contenu_commentaire")
	private String contenuCommentaire;
	
	@ManyToOne
	@JoinColumn(name="id_contenu")
	private Contenu contenu;
	
	
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;
	
	
	
	
	
	public Long getIdCommentaire() {
		return idCommentaire;
	}
	public void setIdCommentaire(Long idCommentaire) {
		this.idCommentaire = idCommentaire;
	}
	public Date getDateCommentaire() {
		return dateCommentaire;
	}
	public void setDateCommentaire(Date dateCommentaire) {
		this.dateCommentaire = dateCommentaire;
	}
	public String getContenuCommentaire() {
		return contenuCommentaire;
	}
	public void setContenuCommentaire(String contenuCommentaire) {
		this.contenuCommentaire = contenuCommentaire;
	}
	public Contenu getContenu() {
		return contenu;
	}
	public void setContenu(Contenu contenu) {
		this.contenu = contenu;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Commentaire() {
		super();
	}
	public Commentaire(String contenuCommentaire) {
		super();
		this.contenuCommentaire = contenuCommentaire;
	}
	
	
	
}
