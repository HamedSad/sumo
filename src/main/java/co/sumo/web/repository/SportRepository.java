package co.sumo.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.sumo.web.model.Sport;

@Repository
public interface SportRepository extends JpaRepository <Sport, Long> {

}