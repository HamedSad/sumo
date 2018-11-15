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
import co.sumo.web.service.ActiviteService;

//Signaler que les uri sont des embranchements - Fusion de l'annotation Controller et response body
@RestController
@RequestMapping("/api")

public class ActiviteController {

	// injection de dependance grace à l'annotation Autowired et l'utilisation d'un
	// constructeur
	@Autowired

	// On passe un objet de type UserRepository en attribut de notre classe
	// UserController
	ActiviteService activiteServ;

	// On utilise un constructeur pour set l'attribut en variable de classe
	ActiviteController(ActiviteService activiteServ) {
		this.activiteServ = activiteServ;
	}

	@GetMapping("/activite/all")
	public List<Activite> findAllActivities() {
		return activiteServ.findAllActivities();
	}

	@CrossOrigin
	@GetMapping("/activite/{id}")
	public Activite getActiviteById(@PathVariable(value = "id") long id) {
		return activiteServ.findById(id);
	}

	@CrossOrigin
	@PostMapping("/activite")
	Activite saveActivite(@Valid @RequestBody Activite activite) {
		return activiteServ.saveActivite(activite);
	}
	
	@CrossOrigin
	@DeleteMapping("/activite/{id}")

	ResponseEntity<Activite> deleteUser(@PathVariable(value = "id") long id) {
		Activite activite = activiteServ.findById(id);

		if (activite == null)
			return ResponseEntity.notFound().build();
		activiteServ.removeById(id);
		return ResponseEntity.ok().build();
	}
}
