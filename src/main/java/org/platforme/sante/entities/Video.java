package org.platforme.sante.entities;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="video")
public class Video implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_video")
	private Long idVideo;
	
	@Column(name="titre_video")
	@NotEmpty
	@Min(2)
	private String titreVideo;
	
	@Column(name="lien_video")
	@NotEmpty
	private String lienVideo;
	
	@Column(name="date_video")
	private Date dateVideo;
	
	public Long getIdVideo() {
		return idVideo;
	}
	public void setIdVideo(Long idVideo) {
		this.idVideo = idVideo;
	}
	public String getTitreVideo() {
		return titreVideo;
	}
	public void setTitreVideo(String titreVideo) {
		this.titreVideo = titreVideo;
	}
	public String getLienVideo() {
		return lienVideo;
	}
	public void setLienVideo(String lienVideo) {
		this.lienVideo = lienVideo;
	}
	public Date getDateVideo() {
		return dateVideo;
	}
	public void setDateVideo(Date dateVideo) {
		this.dateVideo = dateVideo;
	}

	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Video(String titreVideo, String nomVideo, String lienVideo) {
		super();
		this.titreVideo = titreVideo;
		this.lienVideo = lienVideo;
	}
	

}
