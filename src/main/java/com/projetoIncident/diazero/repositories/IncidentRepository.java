package com.projetoIncident.diazero.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoIncident.diazero.entity.Incident;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, Long>{

}
