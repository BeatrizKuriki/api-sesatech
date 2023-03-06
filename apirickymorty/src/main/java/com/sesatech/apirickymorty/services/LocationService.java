package com.sesatech.apirickymorty.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sesatech.apirickymorty.dto.LocationDTO;
import com.sesatech.apirickymorty.entities.Location;
import com.sesatech.apirickymorty.repositories.LocationRepository;
import com.sesatech.apirickymorty.services.exceptions.ResourceNotFoundException;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository repository;
	
	@Transactional(readOnly = true)
	public List<LocationDTO> findAll(){
		List<Location> list = repository.findAll();
		
		return list.stream().map(elemento -> new LocationDTO(elemento)).collect(Collectors.toList());
		}

	@Transactional(readOnly = true)
	public LocationDTO findById(Long id) {
		Optional<Location> obj = repository.findById(id);
		Location entity = obj.orElseThrow(()-> new ResourceNotFoundException("Entity not found."));
		return new LocationDTO(entity);		
		
	}

	@Transactional
	public LocationDTO insert(LocationDTO dto) {
		Location entity = new Location();
		entity.setName(dto.getName());
		entity.setDimension(dto.getDimension());
		entity.setUrl(dto.getUrl());
		entity.setCreated(dto.getCreated());
		entity = repository.save(entity);			
		return new LocationDTO(entity);
	}

	@Transactional
	public LocationDTO update(Long id, LocationDTO dto) {
		try {
		Location entity = repository.getOne(id);
		entity.setName(dto.getName());
		entity.setDimension(dto.getDimension());
		entity.setUrl(dto.getUrl());
		entity.setCreated(dto.getCreated());
		entity = repository.save(entity);		
		return new LocationDTO(entity);
		}
		catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found" + id);
			
		}
	
	}
}