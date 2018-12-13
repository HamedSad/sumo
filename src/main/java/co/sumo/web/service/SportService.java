package co.sumo.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.sumo.web.model.Commentaire;
import co.sumo.web.model.Sport;
import co.sumo.web.repository.SportRepository;
import co.sumo.web.repository.TerrainRepository;

@Service

public class SportService {
	
	//injection de dependance grace à l'annotation Autowired et l'utilisation d'un constructeur
	@Autowired	
	//On passe un objet de type SportRepository en attribut de notre classe SportService
	private SportRepository sportRepo;
	
	@Autowired
	private TerrainRepository terrainRepo;
	
	//On utilise un constructeur pour set l'attribut en variable de classe
	SportService(SportRepository sportRepo, TerrainRepository terrainRepo){
		this.sportRepo = sportRepo;
		this.terrainRepo = terrainRepo;
	}
	
	// Méthode findAllSport en liste pour obtenir tous les sports
	public List<Sport> findAllSport() {
		return sportRepo.findAll();
	}
	
	//Méthode findById pour récupérer un sport
	public Sport findById(Long sport) {
		return sportRepo.findOne(sport);
	}
	
	//Méthode saveSport pour enregistrer un sport dans la BDD
	public Sport saveSport (Sport sport) {
		// TODO Auto-generated method stub
		return sportRepo.save(sport);
	}
	
	//Méthode delete pour supprimer un sport	
	public void removeById(Long id) {
		Sport sport = sportRepo.findOne(id);
		sportRepo.delete(sport);	
	}

}