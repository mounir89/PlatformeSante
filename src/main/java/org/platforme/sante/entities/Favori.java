package org.platforme.sante.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="favori")
public class Favori {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_favori")
	private Long idFavori;
	
	@Column(name="date_favori")
	private Date dateFavori;
	
	@OneToOne(mappedBy="favori")
	private Contenu contenu;
	
	
	public Favori() {
		super();
		
	}

	public Long getIdFavori() {
		return idFavori;
	}

	public void setIdFavori(Long idFavori) {
		this.idFavori = idFavori;
	}

	public Date getDateFavori() {
		return dateFavori;
	}

	public void setDateFavori(Date dateFavori) {
		this.dateFavori = dateFavori;
	}

	public Contenu getContenu() {
		return contenu;
	}

	public void setContenu(Contenu contenu) {
		this.contenu = contenu;
	}

	
}
