package com.rafaeldeluca.camadasRESTdto.dto;

import java.io.Serializable;

import com.rafaeldeluca.camadasRESTdto.entitities.Employee;
import com.rafaeldeluca.camadasRESTdto.entitities.Locality;

// dto do funcionário não vai expor o password dele da resposta da requisição
public class EmployeeDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private LocalityDTO localityDTO;
	
	
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

	public LocalityDTO getLocalityDTO() {
		return localityDTO;
	}

	public void setLocalityDTO(LocalityDTO localityDTO) {
		this.localityDTO = localityDTO;
	}		
		

}
