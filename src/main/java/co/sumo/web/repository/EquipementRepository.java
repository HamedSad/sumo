package co.sumo.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.sumo.web.model.Equipement;

@Repository

public interface EquipementRepository extends JpaRepository <Equipement, Long>{

}
