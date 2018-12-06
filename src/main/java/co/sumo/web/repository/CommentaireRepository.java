package co.sumo.web.repository;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.sumo.web.model.Commentaire;
import co.sumo.web.model.Sport;

@Repository

public interface CommentaireRepository extends JpaRepository <Commentaire, Long> {
	


}
