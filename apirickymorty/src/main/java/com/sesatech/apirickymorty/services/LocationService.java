package com.sesatech.apirickymorty.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesatech.apirickymorty.entities.Location;
import com.sesatech.apirickymorty.repositories.LocationRepository;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository repository;
	
	public List<Location> findAll(){
		return repository.findAll();
		
	}
	

}
