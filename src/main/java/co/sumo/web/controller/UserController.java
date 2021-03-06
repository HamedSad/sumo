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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.sumo.web.model.Sport;
import co.sumo.web.model.User;

import co.sumo.web.service.UserService;

//@CrossOrigin("http://localhost:8080")
@RestController

// toutes les requetes arrivant sur api/user viendront sur ce controller
// cette classe contient juste le traitement sur les url qu'elle recoit et
// passera en argument de methode une partie du contenu de l'url grace à
// @PathVariable
// pour parser a nouveau dans un type java
@RequestMapping("/api")

public class UserController {

	// injection de dependance grace à l'annotation Autowired et l'utilisation d'un
	// constructeur
	@Autowired

	// On passe un objet de type UserRepository en attribut de notre classe
	// UserController
	private UserService userServ;

	// On utilise un constructeur pour set l'attribut en variable de classe
	public UserController(UserService userServ) {
		this.userServ = userServ;
	}

	@CrossOrigin
	@GetMapping("/user/all")
	
	public List<User> findUsers() {
		return userServ.findAllUsers();
	}

	@CrossOrigin
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable(value = "id") long id) {
		return userServ.findById(id);
	}

	@CrossOrigin
	@PostMapping("/user")
	User saveUser(@Valid @RequestBody User user) {
		return userServ.saveUser(user);
	}

	@CrossOrigin
	@DeleteMapping("/user/{id}")
	// ResponseEntity reponse qui va etre donnée apres le delete
	ResponseEntity<User> deleteUser(@PathVariable(value = "id") long id) {
		User user = userServ.findById(id);

		if (user == null)
			return ResponseEntity.notFound().build();
		else {
			userServ.removeById(id);
			return ResponseEntity.ok().build();
		}
	}


	 //ResponseEntity reponse qui va etre donnée apres le update	
	//User updatetUserById(@PathVariable(value="id")long id, User user ) {
	//	user = userServ.findById(id);
	//	return userServ.saveUser(user);
	
	//}

	@CrossOrigin
	@PutMapping("/user/{id}")
	ResponseEntity<User> updateUser(@PathVariable(value = "id") long id, @Valid @RequestBody User user){
	
		User userToUpdate = userServ.findById(id);
	
	if(userToUpdate == null) 
		return ResponseEntity.notFound().build();
	
	if(user.getNomUser() !=null)
		userToUpdate.setNomUser(user.getNomUser());
		
	if(user.getPrenomUser() !=null)
		userToUpdate.setPrenomUser(user.getPrenomUser());
		
	if(user.getEmailUser() !=null)
		userToUpdate.setEmailUser(user.getEmailUser());
	
	User updatedUser = userServ.saveUser(userToUpdate);
	return ResponseEntity.ok(updatedUser);
	
	}
}