package com.rafaeldeluca.camadasRESTdto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaeldeluca.camadasRESTdto.entitities.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {
	

}
