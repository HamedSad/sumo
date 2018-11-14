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
	
	
	public List<User> findAllUsers(){
		return userRepo.findAll();
	}
	
	public User findById(Long id) {
		return userRepo.findOne(id);
	}


	public User saveUser (User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}
	
	//public User createId(Long id) {
	//	return userRepo.save(id);
	//}


	
}
