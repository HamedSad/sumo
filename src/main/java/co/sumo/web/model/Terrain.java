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
