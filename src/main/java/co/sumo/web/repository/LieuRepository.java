package co.sumo.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.sumo.web.model.Lieu;

@Repository
public interface LieuRepository extends JpaRepository <Lieu, Long> {

}
