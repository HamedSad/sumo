package co.sumo.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.sumo.web.model.Activite;

@Repository

//Ici la Model Class Activite est liée à ActiviteRepository grace à <Activite> et <Long> est le type de sa clé primaire 

public interface ActiviteRepository extends JpaRepository <Activite, Long> {

}