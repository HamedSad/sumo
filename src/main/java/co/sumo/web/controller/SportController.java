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

import co.sumo.web.model.Sport;
import co.sumo.web.service.SportService;

//Signaler que les uri sont des embranchements - Fusion de l'annotation Controller et response body
@RestController
@RequestMapping ("/api")

public class SportController {

	// injection de dependance grace à l'annotation Autowired et l'utilisation d'un
	// constructeur
	@Autowired
	
	// On passe un objet de type UserRepository en attribut de notre classe
	// SportController
	SportService sportServ;
	
	// On utilise un constructeur pour set l'attribut en variable de classe
	SportController(SportService sportServ){
		this.sportServ = sportServ;
	}
	
	@CrossOrigin
	@GetMapping("/sport/all")
	public List<Sport> findSport() {
		return sportServ.findAllSport();
	}
	
	@CrossOrigin
	@GetMapping("/sport/{id}")
	public Sport getSportById(@PathVariable(value = "id") long id) {
		return sportServ.findById(id);
	}
	
	@CrossOrigin
	@PostMapping("/sport")
	Sport saveSport(@Valid @RequestBody Sport sport) {
		return sportServ.saveSport(sport);
	}
	
	@CrossOrigin
	@PutMapping("/sport/{id}")
	ResponseEntity<Sport> updateSport(@PathVariable(value = "id") long id, @Valid @RequestBody Sport sport){
	
		Sport sportToUpdate = sportServ.findById(id);
	
	if(sportToUpdate == null) 
		return ResponseEntity.notFound().build();
	
	if(sport.getNomSport() !=null)
		sportToUpdate.setNomSport(sport.getNomSport());
		
	if(sport.getSaisonSport() !=null)
		sportToUpdate.setSaisonSport(sport.getSaisonSport());
		
	if(sport.getReglesSport() !=null)
		sportToUpdate.setReglesSport(sport.getReglesSport());
	
	
	
	Sport updatedSport = sportServ.saveSport(sportToUpdate);
	return ResponseEntity.ok(updatedSport);
	
	}
	
	@CrossOrigin
	@DeleteMapping("/sport/{id}")

	ResponseEntity<Sport> deleteSport(@PathVariable(value = "id") long id) {
		Sport sport = sportServ.findById(id);

		if (sport == null)
			return ResponseEntity.notFound().build();
		sportServ.removeById(id);
		return ResponseEntity.ok().build();
	}

	
	
}
