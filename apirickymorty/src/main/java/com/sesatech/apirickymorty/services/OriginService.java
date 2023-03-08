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


import com.sesatech.apirickymorty.dto.OriginDTO;

import com.sesatech.apirickymorty.entities.Origin;
import com.sesatech.apirickymorty.repositories.OriginRepository;
import com.sesatech.apirickymorty.services.exceptions.DataBaseException;
import com.sesatech.apirickymorty.services.exceptions.ResourceNotFoundException;

@Service
public class OriginService {
	
	@Autowired
	private OriginRepository repository;
	
	
	
	@Transactional(readOnly = true)
	public Page<OriginDTO> findAllPaged(PageRequest pageRequest) {
		Page<Origin> list = repository.findAll(pageRequest);
		return list.map(x -> new OriginDTO(x));
	}

	@Transactional(readOnly = true)
	public OriginDTO findById(Long id) {
		Optional<Origin> obj = repository.findById(id);
		Origin entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found."));
		return new OriginDTO(entity);

	}
	
	@Transactional
	public OriginDTO insert(OriginDTO dto) {
		Origin entity = new Origin();
		entity.setName(dto.getName());		
		entity.setUrl(dto.getUrl());		
		entity = repository.save(entity);			
		return new OriginDTO(entity);
	}

	@Transactional
	public OriginDTO update(Long id, OriginDTO dto) {
		try {
		Origin entity = repository.getOne(id);
		entity.setName(dto.getName());		
		entity.setUrl(dto.getUrl());	
		entity = repository.save(entity);		
		return new OriginDTO(entity);
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
