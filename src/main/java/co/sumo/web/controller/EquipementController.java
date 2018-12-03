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
@RequestMapping("/api")

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
	
	@CrossOrigin
	@GetMapping("/equipement/all")
	public List<Equipement> findEquipement() {
		return equipementServ.findAllEquipement();
	}
	
	@CrossOrigin
	@GetMapping("/equipement/{id}")
	public Equipement getEquipementById(@PathVariable(value = "id") long id) {
		return equipementServ.findById(id);
	}
	
	//pour obtenir les equipements en fonction de l'id du sport
	@CrossOrigin
	@GetMapping("/sport/{id}/equipement")
	public Equipement getEquipementByIdSport(@PathVariable(value = "id") long id) {
		return equipementServ.findById(id);
	}
	
	@CrossOrigin
	@PostMapping("/equipement")
	Equipement saveEquipement(@Valid @RequestBody Equipement equipement) {
		return equipementServ.saveEquipement(equipement);
	}
	
	@CrossOrigin
	@PutMapping("/equipement/{id}")
	ResponseEntity <Equipement> updateEquipement(@PathVariable(value = "id") long id, @Valid @RequestBody Equipement equipement){
	
	Equipement equipementToUpdate = equipementServ.findById(id);
	
	if(equipementToUpdate == null) 
	return ResponseEntity.notFound().build();
	
	if(equipement.getNomEquipement1() !=null)
		equipementToUpdate.setNomEquipement1(equipement.getNomEquipement1());
		
	if(equipement.getUrlPhotoEquipement1() !=null)
		equipementToUpdate.setUrlPhotoEquipement1(equipement.getUrlPhotoEquipement1());
	
	if(equipement.getNomEquipement2() !=null)
		equipementToUpdate.setNomEquipement2(equipement.getNomEquipement2());
		
	if(equipement.getUrlPhotoEquipement2() !=null)
		equipementToUpdate.setUrlPhotoEquipement2(equipement.getUrlPhotoEquipement2());
	
	if(equipement.getNomEquipement3() !=null)
		equipementToUpdate.setNomEquipement3(equipement.getNomEquipement3());
		
	if(equipement.getUrlPhotoEquipement3() !=null)
		equipementToUpdate.setUrlPhotoEquipement3(equipement.getUrlPhotoEquipement3());
	
	if(equipement.getNomEquipement4() !=null)
		equipementToUpdate.setNomEquipement4(equipement.getNomEquipement4());
		
	if(equipement.getUrlPhotoEquipement4() !=null)
		equipementToUpdate.setUrlPhotoEquipement4(equipement.getUrlPhotoEquipement4());
	
	if(equipement.getNomEquipement5() !=null)
		equipementToUpdate.setNomEquipement5(equipement.getNomEquipement5());
		
	if(equipement.getUrlPhotoEquipement5() !=null)
		equipementToUpdate.setUrlPhotoEquipement5(equipement.getUrlPhotoEquipement5());
		
	Equipement updatedEquipement = equipementServ.saveEquipement(equipementToUpdate);
	return ResponseEntity.ok(updatedEquipement);
	
	}
	
	@CrossOrigin
	@DeleteMapping("/equipement/{id}")

	ResponseEntity<Equipement> deleteEquipement(@PathVariable(value = "id") long id) {
		Equipement equipement = equipementServ.findById(id);

		if (equipement == null)
			return ResponseEntity.notFound().build();
		equipementServ.removeById(id);
		return ResponseEntity.ok().build();
	}

}
