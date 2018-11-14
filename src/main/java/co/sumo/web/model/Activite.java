package co.sumo.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Creation de la table activite
	@Entity
	@Table(name = "activite")

public class Activite {
	
 //Creation de l'Id en auto-increment et il va lui même s'occuper d'incrementer la valeur de la clé primaire
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long idActivite;
		
		private String nomActivite;
		
		private int activiteSportive;
		
		private int lieuActivite;
		
		private int descriptionActivite;
		
		private int noteActivite;

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

		public int getActiviteSportive() {
			return activiteSportive;
		}

		public void setActiviteSportive(int activiteSportive) {
			this.activiteSportive = activiteSportive;
		}

		public int getLieuActivite() {
			return lieuActivite;
		}

		public void setLieuActivite(int lieuActivite) {
			this.lieuActivite = lieuActivite;
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
