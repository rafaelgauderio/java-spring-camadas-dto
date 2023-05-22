package com.rafaeldeluca.camadasRESTdto.dto;

import java.io.Serializable;

import com.rafaeldeluca.camadasRESTdto.entitities.Employee;


public class EmployeeDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	//private Long localityId;
	
	
	public EmployeeDTO () {
		
	}

	public EmployeeDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public EmployeeDTO (Employee entity) {
		
		this.id= entity.getId();
		this.name = entity.getName();
		//this.localityId = entity.getLocality().getId();
		
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
	

}
