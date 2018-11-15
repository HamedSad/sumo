package co.sumo.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.sumo.web.model.Activite;
import co.sumo.web.model.User;
import co.sumo.web.repository.ActiviteRepository;

@Service

public class ActiviteService {
	
	//injection de dependance grace à l'annotation Autowired et l'utilisation d'un constructeur
	@Autowired
	
	//On passe un objet de type UserRepository en attribut de notre classe UserService
	private ActiviteRepository activiteRepo; 
	
	//On utilise un constructeur pour set l'attribut en variable de classe
	public ActiviteService (ActiviteRepository activiteRepo) {
		this.activiteRepo = activiteRepo;
	}
	
	//Méthode findAllActivities en liste pour obtenir toutes les activités
	public List<Activite> findAllActivities(){
		return activiteRepo.findAll();
	}
	
	//Méthode findById pour récupérer une activite
	public Activite findById(Long activite) {
		return activiteRepo.findOne(activite);
	}

	//Méthode saveActivite pour enregistrer une nouvelle activite dans la BDD
	public Activite saveActivite (Activite activite) {
		return activiteRepo.save(activite);
	}

	//Méthode delete pour supprimer une activite	
	public void removeById(Long id) {
		Activite activite = activiteRepo.findOne(id);
		activiteRepo.delete(activite);	
	}

}
