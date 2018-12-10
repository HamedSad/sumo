package co.sumo.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.sumo.web.model.User;
import co.sumo.web.repository.UserRepository;



//cette classe va contenir les methodes du jpa repository custom ou non et nous allons les traiter et leur donner un corps
//à chacune avec algorytmie et conditions
@Service
public class UserService {
		
	//injection de dependance grace à l'annotation Autowired et l'utilisation d'un constructeur
	@Autowired
	
	//On passe un objet de type UserRepository en attribut de notre classe UserService
	private UserRepository userRepo; 	
	
	//On utilise un constructeur pour set l'attribut en variable de classe
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	//Méthodes
	
	//Méthode findAllUsers en liste pour obtenir tous les utilisateurs  
	public List<User> findAllUsers(){
		return userRepo.findAll();
	}
	
	//Méthode findById pour récupérer un user en fonction de son Id
	public User findById(Long id) {
		return userRepo.findOne(id);
	}

	//Méthode saveUser pour enregistrer un user dans la BDD
	public User saveUser (User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	//Méthode delete pour supprimer un user	
	public void removeById(Long id) {
		User user = userRepo.findOne(id);
		userRepo.delete(user);	
	}
	
	//Méthode pour update les données d'un user
	public User updateUserById(Long id) {
		User user = userRepo.findOne(id);
		return userRepo.save(user);
		
	}

}
