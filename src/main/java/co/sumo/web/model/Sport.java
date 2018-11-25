package co.sumo.web.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="sport")

public class Sport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idSport;
	
	private String nomSport;
	
	@ManyToOne
	private Terrain terrain;
	
	@ManyToOne
	private User user;
	
	private String descriptionSport;
	
	private String urlImageSport;
	
	private long idCommentaire;
	
	private String saisonSport;
	
	private String specificitesSport;
	
	@ManyToOne
	private Equipement equipement;
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



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

	public long getIdCommentaire() {
		return idCommentaire;
	}

	public void setIdCommentaire(long idCommentaire) {
		this.idCommentaire = idCommentaire;
	}


	public Equipement getEquipement() {
		return equipement;
	}

	public void setEquipement(Equipement equipement) {
		this.equipement = equipement;
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

	public String getSpecificitesSport() {
		return specificitesSport;
	}

	public void setSpecificitesSport(String specificitesSport) {
		this.specificitesSport = specificitesSport;
	}
	
	

}
