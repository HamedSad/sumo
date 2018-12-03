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

import co.sumo.web.model.Commentaire;
import co.sumo.web.model.Equipement;
import co.sumo.web.service.CommentaireService;

@RestController
@RequestMapping("/api")

public class CommentaireController {
	
	@Autowired
	
	CommentaireService commentaireServ;
	
	CommentaireController(CommentaireService commentaireServ){
		this.commentaireServ = commentaireServ;
	}
	
	@CrossOrigin
	@GetMapping("/commentaire/all")
	public List<Commentaire> findCommentaire() {
		return commentaireServ.findAllCommentaire();
	}
	
	@CrossOrigin
	@GetMapping("/commentaire/{id}")
	public Commentaire getCommentaireById(@PathVariable(value = "id") long id) {
		return commentaireServ.findById(id);
	}
	
	@CrossOrigin
	//pour obtenir le commentaire en fonction de l'id du sport
	@GetMapping("sport/{id}/commentaire") 
	public Commentaire getCommentaireByIdSport(@PathVariable(value = "id") long id) {
		return commentaireServ.findById(id);
	}
	
	@CrossOrigin
	@PostMapping("/commentaire")
	Commentaire saveCommentaire(@Valid @RequestBody Commentaire commentaire) {
		return commentaireServ.saveCommentaire(commentaire);
	}
	
	@CrossOrigin
	@PutMapping("/commentaire/{id}")
	ResponseEntity<Commentaire> updateCommentaire(@PathVariable(value = "id") long id, @Valid @RequestBody Commentaire commentaire){
	
	Commentaire commentaireToUpdate = commentaireServ.findById(id);
	
	if(commentaireToUpdate == null) 
	return ResponseEntity.notFound().build();
	
	if(commentaire.getTexteCommentaire() !=null)
	commentaireToUpdate.setTexteCommentaire(commentaire.getTexteCommentaire());
		
	if(commentaire.getDateCommentaire() !=null)
	commentaireToUpdate.setDateCommentaire(commentaire.getDateCommentaire());
		
		
	Commentaire updatedCommentaire = commentaireServ.saveCommentaire(commentaireToUpdate);
	return ResponseEntity.ok(updatedCommentaire);
	
	}
	
	@CrossOrigin
	@DeleteMapping("/commentaire/{id}")

	ResponseEntity<Commentaire> deleteCommentaire(@PathVariable(value = "id") long id) {
		Commentaire commentaire = commentaireServ.findById(id);

		if (commentaire == null)
			return ResponseEntity.notFound().build();
		commentaireServ.removeById(id);
		return ResponseEntity.ok().build();
	}

}
