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

import co.sumo.web.model.Lieu;
import co.sumo.web.model.User;
import co.sumo.web.service.LieuService;

@RestController
@RequestMapping ("/api")

public class LieuController {

	@Autowired
	private LieuService lieuServ;
	
	public LieuController (LieuService lieuServ) {
		this.lieuServ = lieuServ;
	}
	
	@CrossOrigin
	@GetMapping("/lieu/all")
	public List<Lieu> findLieu() {
		return lieuServ.findAllLieu();
	}
	
	@CrossOrigin
	@PostMapping("/lieu")
	Lieu saveLieu(@Valid @RequestBody Lieu lieu) {
		return lieuServ.saveLieu(lieu);
	}
	
}
