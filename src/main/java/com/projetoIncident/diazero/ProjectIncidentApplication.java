package com.projetoIncident.diazero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projetoIncident.diazero.entity.Incident;
import com.projetoIncident.diazero.repositories.IncidentRepository;

@SpringBootApplication
public class ProjectIncidentApplication implements CommandLineRunner{
	
	@Autowired
	public IncidentRepository incidentRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectIncidentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Incident i1 = new Incident(null, "Batida de carro", "Um HB20 bateu na trazeira de um civic no quilomentro 26 da marginal");
		
		incidentRepository.save(i1);
		
		
	}

}
