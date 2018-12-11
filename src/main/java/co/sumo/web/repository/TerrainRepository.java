package co.sumo.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.sumo.web.model.Terrain;

@Repository

public interface TerrainRepository extends JpaRepository <Terrain, Long> {

}