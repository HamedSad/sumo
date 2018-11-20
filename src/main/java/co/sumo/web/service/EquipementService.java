package co.sumo.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.sumo.web.model.Equipement;
import co.sumo.web.model.Sport;
import co.sumo.web.repository.EquipementRepository;

@Service

public class EquipementService {
	
	@Autowired
	
	private EquipementRepository equipementRepo;
	
	EquipementService(EquipementRepository equipementRepo){
		this.equipementRepo = equipementRepo;
	}

	// Méthode findAllEquipement en liste pour obtenir tous les equipements
	public List<Equipement> findAllEquipement() {
		return equipementRepo.findAll();
	}
	
	//Méthode findById pour récupérer un equipement
	public Equipement findById(Long equipement) {
		return equipementRepo.findOne(equipement);
	}
	
	//Méthode saveEquipement pour enregistrer un equipement dans la BDD
	public Equipement saveEquipement (Equipement equipement) {
		// TODO Auto-generated method stub
		return equipementRepo.save(equipement);
	}
	
	//Méthode delete pour supprimer un equipement	
	public void removeById(Long id) {
		Equipement equipement = equipementRepo.findOne(id);
		equipementRepo.delete(equipement);	
	}
	
}
