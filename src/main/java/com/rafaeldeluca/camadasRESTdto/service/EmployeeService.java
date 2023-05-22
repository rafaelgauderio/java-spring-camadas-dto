package com.rafaeldeluca.camadasRESTdto.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaeldeluca.camadasRESTdto.dto.EmployeeDTO;
import com.rafaeldeluca.camadasRESTdto.dto.EmployeeDTOWithLocality;
import com.rafaeldeluca.camadasRESTdto.entitities.Employee;
import com.rafaeldeluca.camadasRESTdto.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public EmployeeDTO findById(Long id) {
		Optional<Employee> optional = repository.findById(id);
		Employee entity = optional.get();
		return new EmployeeDTO(entity);
	}
	
	public List<EmployeeDTO> findAll () {
		List<Employee> listEmployee = repository.findAll();
		return listEmployee.stream().map(x -> new EmployeeDTO(x)).collect(Collectors.toList());
	}

}
