package org.platforme.sante.entities;

import java.io.Serializable;
import java.util.Date;

public class Video implements Serializable{
	
	private Long idVideo;
	private String titreVideo;
	private String nomVideo;
	private String lienVideo;
	private Date dateVideo;
	private Contenu contenu;
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
	public String getNomVideo() {
		return nomVideo;
	}
	public void setNomVideo(String nomVideo) {
		this.nomVideo = nomVideo;
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
	public Contenu getContenu() {
		return contenu;
	}
	public void setContenu(Contenu contenu) {
		this.contenu = contenu;
	}
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Video(String titreVideo, String nomVideo, String lienVideo) {
		super();
		this.titreVideo = titreVideo;
		this.nomVideo = nomVideo;
		this.lienVideo = lienVideo;
	}
	

}
