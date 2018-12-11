package co.sumo.web.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "terrain")

public class Terrain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idTerrain;
	
	private String nomTerrain;
	
	private String dimensionsTerrain;
	
	private String urlPhotoTerrain;
	
	
	@OneToMany(mappedBy = "terrain")
	private List <Sport> sports;
	
	public List<Sport> getSports() {
		return sports;
	}

	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}

	public String getDimensionsTerrain() {
		return dimensionsTerrain;
	}

	public void setDimensionsTerrain(String dimensionsTerrain) {
		this.dimensionsTerrain = dimensionsTerrain;
	}

	public String getUrlPhotoTerrain() {
		return urlPhotoTerrain;
	}

	public void setUrlPhotoTerrain(String urlPhotoTerrain) {
		this.urlPhotoTerrain = urlPhotoTerrain;
	}

	public long getIdTerrain() {
		return idTerrain;
	}

	public void setIdTerrain(long idTerrain) {
		this.idTerrain = idTerrain;
	}

	public String getNomTerrain() {
		return nomTerrain;
	}

	public void setNomTerrain(String nomTerrain) {
		this.nomTerrain = nomTerrain;
	}
	
	
}