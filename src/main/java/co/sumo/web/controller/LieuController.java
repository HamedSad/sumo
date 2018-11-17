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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.sumo.web.model.Activite;
import co.sumo.web.model.Lieu;
import co.sumo.web.model.User;
import co.sumo.web.service.LieuService;

//Signaler que les uri sont des embranchements - Fusion de l'annotation Controller et response body
@RestController
@RequestMapping ("/api")

public class LieuController {

	// injection de dependance grace à l'annotation Autowired et l'utilisation d'un
	// constructeur
	@Autowired
	
	// On passe un objet de type UserRepository en attribut de notre classe
	// LieuController
	private LieuService lieuServ;
	
	// On utilise un constructeur pour set l'attribut en variable de classe
	public LieuController (LieuService lieuServ) {
		this.lieuServ = lieuServ;
	}
	
	@CrossOrigin
	@GetMapping("/lieu/all")
	public List<Lieu> findLieu() {
		return lieuServ.findAllLieu();
	}
	
	@CrossOrigin
	@GetMapping("/lieu/{id}")
	public Lieu getLieuById(@PathVariable(value = "id") long id) {
		return lieuServ.findById(id);
	}

	
	@CrossOrigin
	@PostMapping("/lieu")
	Lieu saveLieu(@Valid @RequestBody Lieu lieu) {
		return lieuServ.saveLieu(lieu);
	}
	
	@CrossOrigin
	@DeleteMapping("/lieu/{id}")

	ResponseEntity<Lieu> deleteLieu(@PathVariable(value = "id") long id) {
		Lieu lieu = lieuServ.findById(id);

		if (lieu == null)
			return ResponseEntity.notFound().build();
		lieuServ.removeById(id);
		return ResponseEntity.ok().build();
	}
	
}
