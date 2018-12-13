package co.sumo.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.sumo.web.model.Commentaire;
import co.sumo.web.model.Sport;
import co.sumo.web.repository.CommentaireRepository;
import co.sumo.web.repository.SportRepository;

@Service

public class CommentaireService {
	
	@Autowired
	private SportRepository sportRepo;
	
	
	//injection de dependance grace à l'annotation Autowired et l'utilisation d'un constructeur
	@Autowired
	//On passe un objet de type SportRepository en attribut de notre classe SportService
	private CommentaireRepository commentaireRepo;
	
	//**
	
	//On utilise un constructeur pour set l'attribut en variable de classe
	CommentaireService (CommentaireRepository commentaireRepo, SportRepository sportRepo){
		this.commentaireRepo = commentaireRepo;
		this.sportRepo = sportRepo;
	}
	
	// Méthode findAllCommentaire en liste pour obtenir tous les commentaires
	public List<Commentaire> findAllCommentaire() {
		return commentaireRepo.findAll();
	}
	
	//Méthode pour récupérer les commentaires en fonction d'un IdSport
	public List<Commentaire> findCommentaireByIdSport(Long idSport){		
		Sport sport = sportRepo.findOne(idSport);
		return sport.getCommentaires();
	}
	
	//Méthode pour poster un commentaire en fonction d'un IdSport
	public Commentaire saveCommentaireBySport(Long idSport, Commentaire commentaire) {
		Sport sport = sportRepo.findOne(idSport);
		commentaire.setSport(sport);
		return commentaireRepo.save(commentaire);
		
		}
	
	//Méthode findById pour récupérer un commentaire
	public Commentaire findById(Long commentaire) {
		return commentaireRepo.findOne(commentaire);
	}
	
	//Méthode saveCommentaire pour enregistrer un commentaire dans la BDD
	public Commentaire saveCommentaire (Commentaire commentaire) {
		// TODO Auto-generated method stub
		return commentaireRepo.save(commentaire);
	}
	
	//Méthode delete pour supprimer un commentaire	
	public void removeById(Long id) {
		Commentaire commentaire = commentaireRepo.findOne(id);
		commentaireRepo.delete(commentaire);	
	}

}