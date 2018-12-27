package co.sumo.web.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name="sport")

public class Sport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idSport;
	
	private String nomSport;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "terrain_id")
	private Terrain terrain;
	
	private String descriptionSport;
	
	private String urlImageSport;
	
	@OneToMany(mappedBy = "sport")	
	@OrderBy("idCommentaire desc")
	private List <Commentaire> commentaires;
	
	private String saisonSport;
	
	private String reglesSport;
	
	@OneToMany(mappedBy = "sport")
	private List <Equipement> equipements;

	
	//@ManyToOne
	//private Equipement equipement;
	
	public Terrain getTerrain() {
		return terrain;
	}

	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}

	public String getDescriptionSport() {
		return descriptionSport;
	}

	public void setDescriptionSport(String descriptionSport) {
		this.descriptionSport = descriptionSport;
	}
	
	public long getIdSport() {
		return idSport;
	}

	public String getUrlImageSport() {
		return urlImageSport;
	}

	public void setUrlImageSport(String urlImageSport) {
		this.urlImageSport = urlImageSport;
	}

	public void setIdSport(long idSport) {
		this.idSport = idSport;
	}

	public List<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	public List<Equipement> getEquipements() {
		return equipements;
	}

	public void setEquipements(List<Equipement> equipements) {
		this.equipements = equipements; 
	}

	public String getNomSport() {
		return nomSport;
	}

	public void setNomSport(String nomSport) {
		this.nomSport = nomSport;
	}

	public String getSaisonSport() {
		return saisonSport;
	}

	public void setSaisonSport(String saisonSport) {
		this.saisonSport = saisonSport;
	}

	public String getReglesSport() {
		return reglesSport;
	}

	public void setReglesSport(String reglesSport) {
		this.reglesSport = reglesSport;
	}

}