package com.rafaeldeluca.camadasRESTdto.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaeldeluca.camadasRESTdto.dto.EmployeeDTO;
import com.rafaeldeluca.camadasRESTdto.entitities.Employee;
import com.rafaeldeluca.camadasRESTdto.entitities.Locality;
import com.rafaeldeluca.camadasRESTdto.repositories.LocalityRepository;

@Service
public class LocalityService {
	
	@Autowired
	private LocalityRepository repository;
	
	public List<EmployeeDTO> findEmployeesFromLocality (Long id) {
		Locality entity = repository.getReferenceById(id);
		List<Employee> listEmployee = entity.getEmployess();
		// convertendo de para list de EmployeeDTO
		List<EmployeeDTO> listEmployeeDTO = listEmployee.stream().map(emp -> new EmployeeDTO(emp)).collect(Collectors.toList());
		return listEmployeeDTO;	
	}

}
