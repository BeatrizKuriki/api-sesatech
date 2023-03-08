package com.sesatech.apirickymorty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesatech.apirickymorty.entities.Origin;



@Repository
public interface OriginRepository extends JpaRepository<Origin, Long>{
	

}

