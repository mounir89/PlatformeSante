package org.platforme.sante.entities;

import java.io.Serializable;
import java.util.*;


public class Image implements Serializable{
	
	
	private Long idImage;
	private String titreImage;
	private String nomImage;
	private String lienImage;
	private Date dateImage;
	private Contenu contenu;
	private User user;
	public Long getIdImage() {
		return idImage;
	}
	public void setIdImage(Long idImage) {
		this.idImage = idImage;
	}
	public String getTitreImage() {
		return titreImage;
	}
	public void setTitreImage(String titreImage) {
		this.titreImage = titreImage;
	}
	public String getNomImage() {
		return nomImage;
	}
	public void setNomImage(String nomImage) {
		this.nomImage = nomImage;
	}
	public String getLienImage() {
		return lienImage;
	}
	public void setLienImage(String lienImage) {
		this.lienImage = lienImage;
	}
	public Date getDateImage() {
		return dateImage;
	}
	public void setDateImage(Date dateImage) {
		this.dateImage = dateImage;
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
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(String titreImage, String nomImage, String lienImage) {
		super();
		this.titreImage = titreImage;
		this.nomImage = nomImage;
		this.lienImage = lienImage;
	}
	

}
