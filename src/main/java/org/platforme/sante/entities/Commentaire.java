package org.platforme.sante.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="commentaire")
public class Commentaire implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_commentaire")
	private Long idCommentaire;
	
	@Column(name="date_commentaire")
	private Date dateCommentaire;
	
	@Column(name="contenu_commentaire")
	@NotEmpty
	@Min(2)
	private String contenuCommentaire;
	
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

	public Commentaire() {
		super();
	}
	public Commentaire(String contenuCommentaire) {
		super();
		this.contenuCommentaire = contenuCommentaire;
	}
	
	
	
}
