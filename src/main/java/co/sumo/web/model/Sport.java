package co.sumo.web.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="sport")

public class Sport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idSport;
	
	private String nomSport;
	
	private String saisonSport;
	
	private String specificitesSport;
	
	
	
	public long getIdSport() {
		return idSport;
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
