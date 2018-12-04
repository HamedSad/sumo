package co.sumo.web.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


//creation de la table

@Entity(name = "user")
@Table(name = "user")
public class User {
	
	//Id pour la clé primaire
	@Id
	//Il va générer de lui-même la valeur de la clé primaire
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUser;
	
	private String nomUser;
	
	private String prenomUser;
	
	private String emailUser;
	
	private String passwordUser;
	
	public String getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getNomUser() {
		return nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	public String getPrenomUser() {
		return prenomUser;
	}

	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nomUser=" + nomUser + ", prenomUser=" + prenomUser + ", emailUser="
				+ emailUser + "]";
	}
	
	
}
