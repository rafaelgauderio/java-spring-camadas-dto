package com.rafaeldeluca.camadasRESTdto.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaeldeluca.camadasRESTdto.dto.EmployeeDTO;
import com.rafaeldeluca.camadasRESTdto.service.EmployeeService;

@RestController
@RequestMapping(value = "employees")
public class EmployeeResource {
	
	@Autowired
	private EmployeeService service;
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<EmployeeDTO> findById(@PathVariable Long id) {
		EmployeeDTO employeeDTO = service.findById(id);
		return ResponseEntity.ok().body(employeeDTO);		
	}	

}
