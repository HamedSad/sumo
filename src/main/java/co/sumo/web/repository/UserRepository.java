
package co.sumo.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.sumo.web.model.User;

@Repository
//Ici la classe User auquelle le repository est lié et le type de sa clé primaire
//contient les signatures des methodes du JpaRepository on peut les lire grace à ctrl + espace
//on peut y lire les types d'argument des methodes et ce qu'elle retourne apres les " : "
//du moment qu'on ne change pas les arguments d'une methode (customisation) on a pas besoin d'y laisser la signature
public interface UserRepository extends JpaRepository <User, Long> {

	


//public boolean existBiteEtBurne(String nom);
//ce qui compte ici c'est le mot clef 'exist' le type de la methode boolean seul l'argument et le reste du nom de la methode peuvent etre custom
//nous pourrions tres bien utiliser 'findBy' ou autre mot clef
	
	
}