package co.sumo.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.sumo.web.model.Commentaire;
import co.sumo.web.model.Sport;
import co.sumo.web.repository.CommentaireRepository;

@Service

public class CommentaireService {
	
	//injection de dependance grace à l'annotation Autowired et l'utilisation d'un constructeur
	@Autowired
	
	//On passe un objet de type SportRepository en attribut de notre classe SportService
	private CommentaireRepository commentaireRepo;
	
	//On utilise un constructeur pour set l'attribut en variable de classe
	CommentaireService (CommentaireRepository commentaireRepo){
		this.commentaireRepo = commentaireRepo;
	}
	
	// Méthode findAllCommentaire en liste pour obtenir tous les commentaires
	public List<Commentaire> findAllCommentaire() {
		return commentaireRepo.findAll();
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
