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
	
	private String nomEquipement1;
		
	private String urlPhotoEquipement1;
	
	private String nomEquipement2;
	
	private String urlPhotoEquipement2;
	
	private String nomEquipement3;
	
	private String urlPhotoEquipement3;
	
	private String nomEquipement4;
	
	private String urlPhotoEquipement4;
	
	private String nomEquipement5;
	
	private String urlPhotoEquipement5;
	

	public String getNomEquipement1() {
		return nomEquipement1;
	}

	public void setNomEquipement1(String nomEquipement1) {
		this.nomEquipement1 = nomEquipement1;
	}

	public String getUrlPhotoEquipement1() {
		return urlPhotoEquipement1;
	}

	public void setUrlPhotoEquipement1(String urlPhotoEquipement1) {
		this.urlPhotoEquipement1 = urlPhotoEquipement1;
	}

	public String getNomEquipement2() {
		return nomEquipement2;
	}

	public void setNomEquipement2(String nomEquipement2) {
		this.nomEquipement2 = nomEquipement2;
	}

	public String getUrlPhotoEquipement2() {
		return urlPhotoEquipement2;
	}

	public void setUrlPhotoEquipement2(String urlPhotoEquipement2) {
		this.urlPhotoEquipement2 = urlPhotoEquipement2;
	}

	public String getNomEquipement3() {
		return nomEquipement3;
	}

	public void setNomEquipement3(String nomEquipement3) {
		this.nomEquipement3 = nomEquipement3;
	}

	public String getUrlPhotoEquipement3() {
		return urlPhotoEquipement3;
	}

	public void setUrlPhotoEquipement3(String urlPhotoEquipement3) {
		this.urlPhotoEquipement3 = urlPhotoEquipement3;
	}

	public String getNomEquipement4() {
		return nomEquipement4;
	}

	public void setNomEquipement4(String nomEquipement4) {
		this.nomEquipement4 = nomEquipement4;
	}

	public String getUrlPhotoEquipement4() {
		return urlPhotoEquipement4;
	}

	public void setUrlPhotoEquipement4(String urlPhotoEquipement4) {
		this.urlPhotoEquipement4 = urlPhotoEquipement4;
	}

	public String getNomEquipement5() {
		return nomEquipement5;
	}

	public void setNomEquipement5(String nomEquipement5) {
		this.nomEquipement5 = nomEquipement5;
	}

	public String getUrlPhotoEquipement5() {
		return urlPhotoEquipement5;
	}

	public void setUrlPhotoEquipement5(String urlPhotoEquipement5) {
		this.urlPhotoEquipement5 = urlPhotoEquipement5;
	}

	public long getIdEquipement() {
		return idEquipement;
	}

	public void setIdEquipement(long idEquipement) {
		this.idEquipement = idEquipement;
	}

	

	

}