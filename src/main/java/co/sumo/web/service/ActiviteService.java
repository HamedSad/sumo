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
	
	public List<Activite> findAllActivities(){
		return activiteRepo.findAll();
	}
	
	public Activite findById(Long activite) {
		return activiteRepo.findOne(activite);
	}


	public Activite saveActivite (Activite activite) {
		// TODO Auto-generated method stub
		return activiteRepo.save(activite);
	}

}
