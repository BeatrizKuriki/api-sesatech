package com.sesatech.apirickymorty.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sesatech.apirickymorty.dto.CharacterDTO;
import com.sesatech.apirickymorty.entities.Character;
import com.sesatech.apirickymorty.repositories.CharacterRepository;


@Service
public class CharacterService {
	@Autowired
	private CharacterRepository repository;
	
	@Transactional(readOnly = true)
	public List<CharacterDTO> findAll(){
		List<Character>list = repository.findAll();
		
		return list.stream().map(elemento -> new CharacterDTO()).collect(Collectors.toList());
		
		
	}

}
