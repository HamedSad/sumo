package co.sumo.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.sumo.web.model.Sport;
import co.sumo.web.repository.SportRepository;

@Service

public class SportService {
	
	@Autowired
	SportRepository sportRepo;
	
	SportService(SportRepository sportRepo){
		this.sportRepo = sportRepo;
	}
	
	// Méthode findAllSport en liste pour obtenir tous les sports
	public List<Sport> findAllSport() {
		return sportRepo.findAll();
	}
	
	//Méthode saveSport pour enregistrer un sport dans la BDD
	public Sport saveSport (Sport sport) {
		// TODO Auto-generated method stub
		return sportRepo.save(sport);
	}

}
