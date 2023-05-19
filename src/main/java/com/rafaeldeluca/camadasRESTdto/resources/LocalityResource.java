package com.rafaeldeluca.camadasRESTdto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaeldeluca.camadasRESTdto.dto.EmployeeDTO;
import com.rafaeldeluca.camadasRESTdto.service.LocalityService;

@RestController
@RequestMapping(value = "/localities")
public class LocalityResource {
	
	@Autowired
	private LocalityService service;
	
	@GetMapping(value = "/{id}/employees")
	public ResponseEntity<List<EmployeeDTO>> findEmployeesFromLocality(@PathVariable Long id) {
	
		List<EmployeeDTO> listEmployeeDTO = service.findEmployeesFromLocality(id);
		return ResponseEntity.ok().body(listEmployeeDTO);
	}

}
