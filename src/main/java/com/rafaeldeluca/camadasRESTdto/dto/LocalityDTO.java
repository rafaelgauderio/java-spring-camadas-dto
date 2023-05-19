package com.rafaeldeluca.camadasRESTdto.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.rafaeldeluca.camadasRESTdto.entitities.Locality;

public class LocalityDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private List<EmployeeDTOWithLocality> employees = new ArrayList<>();
	
	public LocalityDTO () {
		
	}

	public LocalityDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public LocalityDTO(Locality entity) {		
		this.id = entity.getId();
		this.name= entity.getName();		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<EmployeeDTOWithLocality> getEmployees() {
		return employees;
	}

	/*
	public void setEmployees(List<EmployeeDTO> employees) {
		this.employees = employees;
	}
	*/	

}
