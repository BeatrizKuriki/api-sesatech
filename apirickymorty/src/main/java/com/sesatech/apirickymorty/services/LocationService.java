package com.sesatech.apirickymorty.services;



import java.util.Optional;


import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sesatech.apirickymorty.dto.LocationDTO;
import com.sesatech.apirickymorty.entities.Location;

import com.sesatech.apirickymorty.repositories.LocationRepository;
import com.sesatech.apirickymorty.services.exceptions.DataBaseException;
import com.sesatech.apirickymorty.services.exceptions.ResourceNotFoundException;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository repository;
	
	@Transactional(readOnly = true)
	public Page<LocationDTO> findAllPaged(PageRequest pageRequest){
		Page<Location> list = repository.findAll(pageRequest);		
		return list.map(elemento -> new LocationDTO(elemento));
		}

	@Transactional(readOnly = true)
	public LocationDTO findById(Long id) {
		Optional<Location> obj = repository.findById(id);
		Location entity = obj.orElseThrow(()-> new ResourceNotFoundException("Entity not found."));
		return new LocationDTO(entity,entity.getResidents());		
		
	}

	@Transactional
	public LocationDTO insert(LocationDTO dto) {
		Location entity = new Location();
		entity.setName(dto.getName());
		entity.setDimension(dto.getDimension());
		entity.setUrl(dto.getUrl());		
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
		entity = repository.save(entity);		
		return new LocationDTO(entity);
		}
		catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found" + id);
			
		}
	
	}

	public void delete(Long id) {
		try {
		repository.deleteById(id);
		}
		catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found" + id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataBaseException("Integrity violation");			
		}
		
		
	}
}