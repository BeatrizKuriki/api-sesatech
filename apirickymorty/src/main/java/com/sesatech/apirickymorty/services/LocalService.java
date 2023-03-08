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

import com.sesatech.apirickymorty.dto.LocalDTO;
import com.sesatech.apirickymorty.dto.OriginDTO;
import com.sesatech.apirickymorty.entities.Local;
import com.sesatech.apirickymorty.entities.Origin;
import com.sesatech.apirickymorty.repositories.LocalRepository;
import com.sesatech.apirickymorty.services.exceptions.DataBaseException;
import com.sesatech.apirickymorty.services.exceptions.ResourceNotFoundException;

@Service
public class LocalService {
	
	@Autowired
	private LocalRepository repository;
	
	
	
	@Transactional(readOnly = true)
	public Page<LocalDTO> findAllPaged(PageRequest pageRequest) {
		Page<Local> list = repository.findAll(pageRequest);
		return list.map(x -> new LocalDTO(x));
	}

	@Transactional(readOnly = true)
	public LocalDTO findById(Long id) {
		Optional<Local> obj = repository.findById(id);
		Local entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found."));
		return new LocalDTO(entity);

	}
	
	@Transactional
	public LocalDTO insert(LocalDTO dto) {
		Local entity = new Local();
		entity.setName(dto.getName());		
		entity.setUrl(dto.getUrl());		
		entity = repository.save(entity);			
		return new LocalDTO(entity);
	}

	@Transactional
	public LocalDTO update(Long id, LocalDTO dto) {
		try {
		Local entity = repository.getOne(id);
		entity.setName(dto.getName());		
		entity.setUrl(dto.getUrl());	
		entity = repository.save(entity);		
		return new LocalDTO(entity);
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
