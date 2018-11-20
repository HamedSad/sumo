package co.sumo.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.sumo.web.model.Sport;
import co.sumo.web.model.Terrain;
import co.sumo.web.repository.TerrainRepository;

@Service

public class TerrainService {
	
	//injection de dependance grace à l'annotation Autowired et l'utilisation d'un constructeur
	@Autowired
	
	//On passe un objet de type TerrainRepository en attribut de notre classe TerrainService
	private TerrainRepository terrainRepo;
	
	//On utilise un constructeur pour set l'attribut en variable de classe
	TerrainService (TerrainRepository terrainRepo){
		this.terrainRepo = terrainRepo;
	}
	
	// Méthode findAllTerrain en liste pour obtenir tous les terrains
	public List<Terrain> findAllTerrain() {
		return terrainRepo.findAll();
	}
	
	//Méthode findById pour récupérer un terrain
	public Terrain findById(Long terrain) {
		return terrainRepo.findOne(terrain);
	}
	
	//Méthode saveterrain pour enregistrer un terrain dans la BDD
	public Terrain saveTerrain (Terrain terrain) {
		// TODO Auto-generated method stub
		return terrainRepo.save(terrain);
	}
	
	//Méthode delete pour supprimer un terrain	
	public void removeById(Long id) {
		Terrain terrain = terrainRepo.findOne(id);
		terrainRepo.delete(terrain);	
	}

}
