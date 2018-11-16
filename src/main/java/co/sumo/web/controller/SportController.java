package co.sumo.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.sumo.web.model.Sport;
import co.sumo.web.service.SportService;

@RestController
@RequestMapping ("/api")

public class SportController {

	@Autowired
	SportService sportServ;
	
	SportController(SportService sportServ){
		this.sportServ = sportServ;
	}
	
	@CrossOrigin
	@GetMapping("/sport/all")
	public List<Sport> findSport() {
		return sportServ.findAllSport();
	}
	
	@CrossOrigin
	@PostMapping("/sport")
	Sport saveSport(@Valid @RequestBody Sport sport) {
		return sportServ.saveSport(sport);
	}
	
}
