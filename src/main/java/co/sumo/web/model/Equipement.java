package co.sumo.web.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table (name = "equipement")

public class Equipement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idEquipement;
	
	private String nomEquipement1;
	
	private String nomEquipement2;
	
	private String nomEquipement3;
	
	private String nomEquipement4;
	
	private String nomEquipement5;
	
	private String urlEquipement1;
	
	private String urlEquipement2;
	
	private String urlEquipement3;
	
	private String urlEquipement4;
	
	private String urlEquipement5;

	public String getUrlEquipement1() {
		return urlEquipement1;
	}

	public void setUrlEquipement1(String urlEquipement1) {
		this.urlEquipement1 = urlEquipement1;
	}

	public String getUrlEquipement2() {
		return urlEquipement2;
	}

	public void setUrlEquipement2(String urlEquipement2) {
		this.urlEquipement2 = urlEquipement2;
	}

	public String getUrlEquipement3() {
		return urlEquipement3;
	}

	public void setUrlEquipement3(String urlEquipement3) {
		this.urlEquipement3 = urlEquipement3;
	}

	public String getUrlEquipement4() {
		return urlEquipement4;
	}

	public void setUrlEquipement4(String urlEquipement4) {
		this.urlEquipement4 = urlEquipement4;
	}

	public String getUrlEquipement5() {
		return urlEquipement5;
	}

	public void setUrlEquipement5(String urlEquipement5) {
		this.urlEquipement5 = urlEquipement5;
	}

	public long getIdEquipement() {
		return idEquipement;
	}

	public void setIdEquipement(long idEquipement) {
		this.idEquipement = idEquipement;
	}

	public String getNomEquipement1() {
		return nomEquipement1;
	}

	public void setNomEquipement1(String nomEquipement1) {
		this.nomEquipement1 = nomEquipement1;
	}

	public String getNomEquipement2() {
		return nomEquipement2;
	}

	public void setNomEquipement2(String nomEquipement2) {
		this.nomEquipement2 = nomEquipement2;
	}

	public String getNomEquipement3() {
		return nomEquipement3;
	}

	public void setNomEquipement3(String nomEquipement3) {
		this.nomEquipement3 = nomEquipement3;
	}

	public String getNomEquipement4() {
		return nomEquipement4;
	}

	public void setNomEquipement4(String nomEquipement4) {
		this.nomEquipement4 = nomEquipement4;
	}

	public String getNomEquipement5() {
		return nomEquipement5;
	}

	public void setNomEquipement5(String nomEquipement5) {
		this.nomEquipement5 = nomEquipement5;
	}
	
	

}
