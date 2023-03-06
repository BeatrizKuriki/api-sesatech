package com.sesatech.apirickymorty.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesatech.apirickymorty.dto.LocationDTO;
import com.sesatech.apirickymorty.services.LocationService;

@RestController
@RequestMapping(value = "/locations")
public class LocationResource {
	
	 @Autowired
	    private LocationService service;

	    @GetMapping
	    public ResponseEntity<List<LocationDTO>> findAll() {
	        List<LocationDTO> list = service.findAll();
	        return ResponseEntity.ok().body(list);
	    }
	    
	    @GetMapping(value = "/{id}")
	    public ResponseEntity<LocationDTO> findById(@PathVariable Long id) {
	        LocationDTO dto = service.findById(id);
	        return ResponseEntity.ok().body(dto);
	    }
	    
	    
	    
	
	

}
