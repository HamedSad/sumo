package co.sumo.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.sumo.web.model.Lieu;
import co.sumo.web.model.User;
import co.sumo.web.repository.LieuRepository;

@Service

public class LieuService {

	@Autowired
	private LieuRepository lieuRepo;

	public LieuService(LieuRepository lieuRepo) {
		this.lieuRepo = lieuRepo;
	}

	// Méthode findAllLieu en liste pour obtenir tous les lieux
	public List<Lieu> findAllLieu() {
		return lieuRepo.findAll();
	}
	
	//Méthode saveLieu pour enregistrer un lieu dans la BDD
	public Lieu saveLieu (Lieu lieu) {
		// TODO Auto-generated method stub
		return lieuRepo.save(lieu);
	}
}
