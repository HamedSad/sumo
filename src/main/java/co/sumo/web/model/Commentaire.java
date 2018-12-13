package co.sumo.web.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name= "commentaire")

public class Commentaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCommentaire;
	
	private String texteCommentaire;
	
	@OrderBy("dateCommentaire desc")
	private Date dateCommentaire;
	
	//Jointure avec la table sport
	@ManyToOne
	@JoinColumn(name= "sport_id")
	@JsonIgnore
	private Sport sport;
	
	public long getIdCommentaire() {
		return idCommentaire;
	}

	public void setIdCommentaire(long idCommentaire) {
		this.idCommentaire = idCommentaire;
	}

	public String getTexteCommentaire() {
		return texteCommentaire;
	}

	public void setTexteCommentaire(String texteCommentaire) {
		this.texteCommentaire = texteCommentaire;
	}

	public Date getDateCommentaire() {
		return dateCommentaire;
	}

	public void setDateCommentaire(Date dateCommentaire) {
		this.dateCommentaire = dateCommentaire;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}	
}