package co.sumo.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "terrain")

public class Terrain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idTerrain;
	
	private String nomTerrain;
	
	private String dimensionsTerrain;
	
	private String urlPhotoTerrain;
	
	
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
