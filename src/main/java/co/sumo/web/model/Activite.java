package co.sumo.web.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//Creation de la table activite
@Entity
@Table(name = "activite")
public class Activite{
	
 //Creation de l'Id en auto-increment et il va lui même s'occuper d'incrementer la valeur de la clé primaire
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long idActivite;
		
		private String nomActivite;
		
		private int idSport;

		private int descriptionActivite;
		
		private int noteActivite;
		

		public int getIdSport() {
			return idSport;
		}


		public void setIdSport(int idSport) {
			this.idSport = idSport;
		}


		public long getIdActivite() {
			return idActivite;
		}


		public void setIdActivite(long idActivite) {
			this.idActivite = idActivite;
		}
		
		public String getNomActivite() {
			return nomActivite;
		}

		public void setNomActivite(String nomActivite) {
			this.nomActivite = nomActivite;
		}


		public int getDescriptionActivite() {
			return descriptionActivite;
		}

		public void setDescriptionActivite(int descriptionActivite) {
			this.descriptionActivite = descriptionActivite;
		}

		public int getNoteActivite() {
			return noteActivite;
		}

		public void setNoteActivite(int noteActivite) {
			this.noteActivite = noteActivite;
		}
		

}