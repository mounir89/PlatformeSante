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
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="image")
public class Image implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_image")
	private Long idImage;
	
	@Column(name="titre_image")
	@NotEmpty
	@Size(min=2)
	private String titreImage;
	

	@Column(name="lien_image")
	@NotEmpty
	private String lienImage;
	
	@Column(name="date_image")
	private Date dateImage;
	
	
	
	
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
	
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(String titreImage, String nomImage, String lienImage) {
		super();
		this.titreImage = titreImage;
		this.lienImage = lienImage;
	}
	

}
