package com.sesatech.apirickymorty.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesatech.apirickymorty.dto.CharacterDTO;

import com.sesatech.apirickymorty.services.CharacterService;

@RestController
@RequestMapping(value = "/characters")
public class CharacterResource {
	
	 @Autowired
	    private CharacterService service;

	    @GetMapping
	    public ResponseEntity<List<CharacterDTO>> findAll() {
	        List<CharacterDTO> list = service.findAll();
	        return ResponseEntity.ok().body(list);
	    }
	

}