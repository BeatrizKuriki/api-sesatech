package com.sesatech.apirickymorty.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesatech.apirickymorty.dto.LocationDTO;
import com.sesatech.apirickymorty.entities.Location;
import com.sesatech.apirickymorty.repositories.LocationRepository;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository repository;
	
	@Transactional(readOnly = true)
	public List<LocationDTO> findAll(){
		List<Location> list = repository.findAll();
		
		return list.stream().map(elemento -> new LocationDTO(elemento)).collect(Collectors.toList());
		
	

}
}