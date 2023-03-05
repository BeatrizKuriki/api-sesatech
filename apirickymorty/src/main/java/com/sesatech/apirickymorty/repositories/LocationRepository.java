package com.sesatech.apirickymorty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesatech.apirickymorty.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long>{
	

}


