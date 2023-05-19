package com.rafaeldeluca.camadasRESTdto.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaeldeluca.camadasRESTdto.dto.EmployeeDTO;
import com.rafaeldeluca.camadasRESTdto.dto.LocalityDTO;
import com.rafaeldeluca.camadasRESTdto.entitities.Employee;
import com.rafaeldeluca.camadasRESTdto.entitities.Locality;
import com.rafaeldeluca.camadasRESTdto.repositories.LocalityRepository;

@Service
public class LocalityService {
	
	@Autowired
	private LocalityRepository repository;
	
	@Transactional(readOnly = true)
	//public List<LocalityDTO> findAllEmployees() {
	public Page<LocalityDTO> findAllEmployees(PageRequest pageRequest) {
		Page<Locality> paginatedListLocality = repository.findAll(pageRequest);		
		//return listLocality.stream().map(x -> new LocalityDTO(x, x.getEmployess())).collect(Collectors.toList());
		return paginatedListLocality.map(x -> new LocalityDTO(x, x.getEmployess()));
	}
	
	public List<EmployeeDTO> findEmployeesFromLocality (Long id) {
		Locality entity = repository.getReferenceById(id);
		List<Employee> listEmployee = entity.getEmployess();
		// convertendo de para list de EmployeeDTO
		List<EmployeeDTO> listEmployeeDTO = listEmployee.stream().map(emp -> new EmployeeDTO(emp)).collect(Collectors.toList());
		return listEmployeeDTO;	
	}

}
