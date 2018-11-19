package co.sumo.web.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "commentaire")

public class Commentaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCommentaire;
	
	private String texteCommentaire;
	
	private Date dateCommentaire;

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
	
	

}
