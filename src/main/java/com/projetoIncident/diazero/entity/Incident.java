package com.projetoIncident.diazero.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.projetoIncident.diazero.resources.IncidentResource;

@Entity
public class Incident {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idIndent;
	private String name;
	private String description;
	
	public Incident() {
		super();
	}

	public Incident(Long idIndent, String name, String description) {
		super();
		this.idIndent = idIndent;
		this.name = name;
		this.description = description;
	}

	public Long getIdIndent() {
		return idIndent;
	}

	public void setIdIndent(Long idIndent) {
		this.idIndent = idIndent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idIndent == null) ? 0 : idIndent.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incident other = (Incident) obj;
		if (idIndent == null) {
			if (other.idIndent != null)
				return false;
		} else if (!idIndent.equals(other.idIndent))
			return false;
		return true;
	}
	
	public Incident createdAt(Incident incident) {
		IncidentResource incidentResource = new IncidentResource();
		incidentResource.Add(incident);
		return incident;
	}
	
	public void updatedAt() {
		
	}
	
	public void closedAt() {
		
	}

}
