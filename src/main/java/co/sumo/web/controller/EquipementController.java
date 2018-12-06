package co.sumo.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.sumo.web.model.Equipement;
import co.sumo.web.service.EquipementService;

@RestController
@RequestMapping("/api/equipement")

public class EquipementController {
	
	
	// injection de dependance grace à l'annotation Autowired et l'utilisation d'un
	// constructeur
	@Autowired
	
	// On passe un objet de type UserRepository en attribut de notre classe
	// SportController
	EquipementService equipementServ;
	
	// On utilise un constructeur pour set l'attribut en variable de classe
	EquipementController(EquipementService equipementServ){
		this.equipementServ = equipementServ;
	}
	
	//Methode pour afficher la liste des équipements en fonction d'un sport
	@CrossOrigin
	@GetMapping("sport/{idSport}")
	public List<Equipement> findEquipementBySport(@PathVariable(value = "idSport") long idSport){
		return equipementServ.findEquipementsBySport(idSport);
	}
	
	//Methode pour afficher la liste de tous les équipements
	@CrossOrigin
	@GetMapping("/all")
	public List<Equipement> findEquipement() {
		return equipementServ.findAllEquipement();
	}
	
	//Methode pour afficher équipement en fonction de son Id
	@CrossOrigin
	@GetMapping("/equipement/{id}")
	public Equipement getEquipementById(@PathVariable(value = "id") long id) {
		return equipementServ.findById(id);
	}
	
	//Methode pour ajouter un équipement
	@CrossOrigin
	@PostMapping("/equipement")
	Equipement saveEquipement(@Valid @RequestBody Equipement equipement) {
		return equipementServ.saveEquipement(equipement);
	}
	
	//Methode pour modifier le contenu d'un équipement
	@CrossOrigin
	@PutMapping("/equipement/{id}")
	ResponseEntity <Equipement> updateEquipement(@PathVariable(value = "id") long id, @Valid @RequestBody Equipement equipement){
	
	Equipement equipementToUpdate = equipementServ.findById(id);
	
	if(equipementToUpdate == null) 
	return ResponseEntity.notFound().build();
	
	if(equipement.getNomEquipement() !=null)
		equipementToUpdate.setNomEquipement(equipement.getNomEquipement());
		
	if(equipement.getUrlPhotoEquipement() !=null)
		equipementToUpdate.setUrlPhotoEquipement(equipement.getUrlPhotoEquipement());
	

		
	Equipement updatedEquipement = equipementServ.saveEquipement(equipementToUpdate);
	return ResponseEntity.ok(updatedEquipement);
	
	}
	
	//Methode pour supprimer un équipement par son Id
	@CrossOrigin
	@DeleteMapping("/{id}")

	ResponseEntity<Equipement> deleteEquipement(@PathVariable(value = "id") long id) {
		Equipement equipement = equipementServ.findById(id);

		if (equipement == null)
		return ResponseEntity.notFound().build();
		equipementServ.removeById(id);
		return ResponseEntity.ok().build();
	}

}
