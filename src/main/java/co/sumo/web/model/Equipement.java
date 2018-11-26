package co.sumo.web.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table (name = "equipement")

public class Equipement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idEquipement;
	
	private String nomEquipement;
		
	private String urlPhotoEquipement;
	

	public long getIdEquipement() {
		return idEquipement;
	}

	public void setIdEquipement(long idEquipement) {
		this.idEquipement = idEquipement;
	}

	public String getNomEquipement() {
		return nomEquipement;
	}

	public void setNomEquipement(String nomEquipement) {
		this.nomEquipement = nomEquipement;
	}

	public String getUrlPhotoEquipement() {
		return urlPhotoEquipement;
	}

	public void setUrlPhotoEquipement(String urlPhotoEquipement) {
		this.urlPhotoEquipement = urlPhotoEquipement;
	}

	

}