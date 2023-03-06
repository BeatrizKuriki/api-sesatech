package com.sesatech.apirickymorty.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	    
	    @PostMapping
	    public ResponseEntity<LocationDTO> insert(@RequestBody LocationDTO dto){
	    	dto = service.insert(dto);
	    	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
	    			.buildAndExpand(dto.getId()).toUri();
	    	return ResponseEntity.created(uri).body(dto);
	    	
	    }
	    
	    @PutMapping(value = "/{id}")
	    public ResponseEntity<LocationDTO> update(@PathVariable Long id,@RequestBody LocationDTO dto){
	    	dto = service.update(id, dto);
	    	 return ResponseEntity.ok().body(dto);	    	
	    	
	    }
	     
	    
	    
	    
	
	

}
