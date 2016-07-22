package org.platforme.sante.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")

public class User implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;
	
	private String username;
	private String password;
	private String email;
	private int status;
	private String role;
	private String niveau;
	private String specialite;
	private String signature;
	
	private String profession;
	
	@Column(name="date_creation")
	private Date dateCreation;
	

	@Embedded
	private Adresse adresse;
	
	@OneToMany(mappedBy="commentaire")
	private Collection<Commentaire> commentaires;
	
	private Image image;
	
	@OneToMany(mappedBy="contenu")
	private Collection<Contenu> contenus;
	
	public User() {
		super();
		
	}
	public User(String username, String password, String email, int status,
			String role, String niveau, String specialite, String signature, String profession) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.status = status;
		this.role = role;
		this.niveau = niveau;
		this.specialite = specialite;
		this.signature = signature;

		this.profession = profession;
	}
	
	public Long getIdUser() {
		return idUser;
	}
    private void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public Collection<Commentaire> getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(Collection<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public Collection<Contenu> getContenus() {
		return contenus;
	}
	public void setContenus(Collection<Contenu> contenus) {
		this.contenus = contenus;
	}
	

}
