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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="user")

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7973151524278322479L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_user")
	private Long idUser;
	
	@NotEmpty
	@Size(min=6)
	@Column(unique=true)
	private String username;
	
	@NotEmpty
	@Size(min=6)
	private String password;
	
	@NotEmpty
	@Column(unique=true)
	@Email
	private String email;
	
	@Lob
	private byte[] photo;
	
	private boolean actived;
	
	private String niveau;
	
	private String specialite;
	
	private String signature;
	
	private String profession;
	
	@Column(name="date_creation")
	private Date dateCreation;
	
	@Embedded
	private Adresse adresse;
	
	@OneToMany
	@JoinColumn(name="id_user")
	private Collection<Commentaire> commentaires = new HashSet<Commentaire>();
	
	
	@ManyToOne
	@JoinColumn(name="id_role")
	private Role role;;
	
	@OneToMany(mappedBy="user")
	private Collection<Contenu> contenus = new HashSet<Contenu>();
	
	@OneToMany
	@JoinColumn(name="id_user")
	private Collection<Favori> favoris = new HashSet<Favori>();
	

	public Collection<Favori> getFavoris() {
		return favoris;
	}
	public void setFavoris(Collection<Favori> favoris) {
		this.favoris = favoris;
	}
	public void addContenu(Contenu c){
		c.setUser(this);
		contenus.add(c);
	}
	public void addCommentaire(Commentaire c){
		commentaires.add(c);
	}

	public User() {
		super();
		
	}
	public User(String username, String password, String email, boolean actived,
	String niveau, String specialite, String signature, String profession) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.actived = actived;
		this.niveau = niveau;
		this.specialite = specialite;
		this.signature = signature;
		this.profession = profession;
		
	}
	
	
	public User(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public boolean isActived() {
		return actived;
	}

	public void setActived(boolean actived) {
		this.actived = actived;
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
	public Collection<Contenu> getContenus() {
		return contenus;
	}
	public byte[] getPhoto() {
		return photo;
	}
    public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
    public void setContenus(Collection<Contenu> contenus) {
		this.contenus = contenus;
	}
	

}
