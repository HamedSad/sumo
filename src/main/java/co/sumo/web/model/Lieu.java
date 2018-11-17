package co.sumo.web.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//Creation de la table activite
	@Entity
	@Table(name = "lieu")

public class Lieu {
	
 //Creation de l'Id en auto-increment et il va lui même s'occuper d'incrementer la valeur de la clé primaire
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long idLieu;
		
		private String nomVille;
		
		private String nomPays;
				

		public long getIdLieu() {
			return idLieu;
		}

		public void setIdLieu(long idLieu) {
			this.idLieu = idLieu;
		}

		public String getNomVille() {
			return nomVille;
		}

		public void setNomVille(String nomVille) {
			this.nomVille = nomVille;
		}

		public String getNomPays() {
			return nomPays;
		}

		public void setNomPays(String nomPays) {
			this.nomPays = nomPays;
		}
		

}