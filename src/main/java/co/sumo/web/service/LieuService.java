package co.sumo.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.sumo.web.model.Activite;
import co.sumo.web.model.Lieu;
import co.sumo.web.model.User;
import co.sumo.web.repository.LieuRepository;

@Service

public class LieuService {

	//injection de dependance grace à l'annotation Autowired et l'utilisation d'un constructeur
	@Autowired
	
	//On passe un objet de type UserRepository en attribut de notre classe LieuService
	private LieuRepository lieuRepo;

	//On utilise un constructeur pour set l'attribut en variable de classe
	public LieuService(LieuRepository lieuRepo) {
		this.lieuRepo = lieuRepo;
	}
	
	// Méthode findAllLieu en liste pour obtenir tous les lieux
	public List<Lieu> findAllLieu() {
		return lieuRepo.findAll();
	}
	
	//Méthode findById pour récupérer un lieu
	public Lieu findById(Long lieu) {
		return lieuRepo.findOne(lieu);
	}
	
	//Méthode saveLieu pour enregistrer un lieu dans la BDD
	public Lieu saveLieu (Lieu lieu) {
		return lieuRepo.save(lieu);
	}
	
	//Méthode delete pour supprimer un lieu	
	public void removeById(Long id) {
		Lieu lieu = lieuRepo.findOne(id);
		lieuRepo.delete(lieu);	
	}
	
}
