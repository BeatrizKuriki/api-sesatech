package com.sesatech.apirickymorty.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesatech.apirickymorty.entities.Location;
import com.sesatech.apirickymorty.services.LocationService;

@RestController
@RequestMapping(value = "/location")
public class LocationResource {
	
	@Autowired
	private LocationService service;
	
	@GetMapping
	public ResponseEntity<List<Location>> findAll(){
		List<Location> list = service.findAll();			
		return ResponseEntity.ok().body(list);
		
	}
	
	

}
