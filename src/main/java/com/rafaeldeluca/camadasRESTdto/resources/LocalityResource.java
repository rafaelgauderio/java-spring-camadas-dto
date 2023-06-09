package com.rafaeldeluca.camadasRESTdto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rafaeldeluca.camadasRESTdto.dto.EmployeeDTO;
import com.rafaeldeluca.camadasRESTdto.dto.LocalityDTO;
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
	
	@GetMapping
	public ResponseEntity<Page<LocalityDTO>> findAll(
			@RequestParam(value = "page" , defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "10") Integer linesPerPage,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction,
			@RequestParam(value = "orderBy", defaultValue = "name") String orderBy) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage,Direction.valueOf(direction), orderBy);
		Page<LocalityDTO> paginatedListLocalityDTO = service.findAllEmployees(pageRequest);		
		return ResponseEntity.ok().body(paginatedListLocalityDTO);
	}

}
