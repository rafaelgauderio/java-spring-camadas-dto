package com.rafaeldeluca.camadasRESTdto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaeldeluca.camadasRESTdto.entitities.Locality;

public interface LocalityRepository extends JpaRepository <Locality, Long>{

}
