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
//il enverra des status à mes requetes
@RequestMapping("/api")
//ajouté derriere l url du serveur hote pour pouvoir acceder à ce controller
public class CommentaireController {
	
	@Autowired
	
	CommentaireService commentaireServ;
	
	CommentaireController(CommentaireService commentaireServ){
		this.commentaireServ = commentaireServ;
	}
	
	@CrossOrigin
	@GetMapping("/all-comments")
	public List<Commentaire> findCommentaire() {
		return commentaireServ.findAllCommentaire();
	}
	
	@CrossOrigin
	@GetMapping("/commentaire/{id}")
	public Commentaire getCommentaireById(@PathVariable(value = "id") long id) {
		return commentaireServ.findById(id);
	}
	
	//Méthode pour obtenir le commentaire en fonction de l'id du sport
	@CrossOrigin
	@GetMapping("sport/commentaire/{idSport}") 
	public List<Commentaire> getCommentaireByIdSport(@PathVariable(value = "idSport") long idSport) {
		return commentaireServ.findCommentaireByIdSport(idSport);
	}
	
	@CrossOrigin
	@PostMapping("/commentaire")
	Commentaire saveCommentaire(@Valid @RequestBody Commentaire commentaire) {
		return commentaireServ.saveCommentaire(commentaire);
	}
	
	//Méthode pour poster un commentaire en fonction de l'Id d'un sport
	@CrossOrigin
	@PostMapping("/sport/add-comment/{idSport}")
	public Commentaire saveCommentaireBySport(@PathVariable(value = "idSport") long idSport, @Valid @RequestBody Commentaire commentaire) {
		return commentaireServ.saveCommentaireBySport(idSport, commentaire);
	}
	
	@CrossOrigin
	@PutMapping("/commentaire/{id}")
	
	//Quand on recupere un corps complet à partir de l'url on ajoute un @RequestBody
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