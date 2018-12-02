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
import org.springframework.web.bind.annotation.RestController;

import co.sumo.web.model.Sport;
import co.sumo.web.model.Terrain;
import co.sumo.web.service.TerrainService;

@RestController
@RequestMapping("/api")

public class TerrainController {

	@Autowired
	
	TerrainService terrainServ;
	
	TerrainController (TerrainService terrainServ){
		this.terrainServ = terrainServ;
	}
	
	@CrossOrigin
	@GetMapping("/terrain/all")
	public List<Terrain> findTerrain() {
		return terrainServ.findAllTerrain();
	}
	
	@CrossOrigin
	@GetMapping("/terrain/{id}")
	public Terrain getTerrainById(@PathVariable(value = "id") long id) {
		return terrainServ.findById(id);
	}
	
	@CrossOrigin
	@PostMapping("/terrain")
	Terrain saveTerrain(@Valid @RequestBody Terrain terrain) {
		return terrainServ.saveTerrain(terrain);
	}
	
	@CrossOrigin
	@PutMapping("/terrain/{id}")
	ResponseEntity<Terrain> updateTerrain(@PathVariable(value = "id") long id, @Valid @RequestBody Terrain terrain){
	
	Terrain terrainToUpdate = terrainServ.findById(id);
	
	if(terrainToUpdate == null) 
		return ResponseEntity.notFound().build();
	
	if(terrain.getNomTerrain() !=null)
		terrainToUpdate.setNomTerrain(terrain.getNomTerrain());	
	
	if(terrain.getDimensionsTerrain() !=null)
		terrainToUpdate.setDimensionsTerrain(terrain.getDimensionsTerrain());
	
	if(terrain.getUrlPhotoTerrain() !=null)
		terrainToUpdate.setUrlPhotoTerrain(terrain.getUrlPhotoTerrain());
	
	Terrain updatedTerrain = terrainServ.saveTerrain(terrainToUpdate);
		return ResponseEntity.ok(updatedTerrain);
	
	}
	
	@CrossOrigin
	@DeleteMapping("/terrain/{id}")

	ResponseEntity<Terrain> deleteTerrain(@PathVariable(value = "id") long id) {
		Terrain terrain = terrainServ.findById(id);

		if (terrain == null)
			return ResponseEntity.notFound().build();
		terrainServ.removeById(id);
		return ResponseEntity.ok().build();
	}
	
}
