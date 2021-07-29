package com.projetoIncident.diazero.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.projetoIncident.diazero.entity.Incident;
import com.projetoIncident.diazero.repositories.IncidentRepository;

@RestController
@RequestMapping(value = "/incidents")
public class IncidentResource {
	
	
	@Autowired
	public IncidentRepository incidentRepository;
	
	@GetMapping
	public ResponseEntity<List<Incident>> findAll(){
		List<Incident> list = incidentRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Incident> findById(@PathVariable Long idIncident){
	    Incident inc = incidentRepository.findById(idIncident).get();
		return ResponseEntity.ok().body(inc);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Incident Add(@RequestBody Incident incident) {
		return incidentRepository.save(incident);
	}
	
	@DeleteMapping
	public void DeleteIncident(@RequestBody Incident incident) {
		 incidentRepository.delete(incident);
	}
	
	@PutMapping
	public Incident AtualizarIncident(@RequestBody Incident incident) {
		return incidentRepository.save(incident);
	}

}
