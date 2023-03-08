package com.sesatech.apirickymorty.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.sesatech.apirickymorty.dto.OriginDTO;
import com.sesatech.apirickymorty.services.OriginService;



@RestController
@RequestMapping(value = "/origins")
public class OriginResource {
	
	 @Autowired
	    private OriginService service;
	 
	 
	 @GetMapping
	    public ResponseEntity<Page<OriginDTO>> findAll(
	    		@RequestParam(value = "page", defaultValue = "0") Integer page,
	    		@RequestParam(value = "linesPerPage", defaultValue = "5") Integer linesPerPage,
	    		@RequestParam(value = "direction", defaultValue = "ASC") String direction,
	    		@RequestParam(value = "orderBy", defaultValue = "name") String orderBy
	    		
	    		) {
	    	PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
	        Page<OriginDTO> list = service.findAllPaged(pageRequest);
	        return ResponseEntity.ok().body(list);
	    }
	    
	    @GetMapping(value = "/{id}")
	    public ResponseEntity<OriginDTO> findById(@PathVariable Long id) {
	        OriginDTO dto = service.findById(id);
	        return ResponseEntity.ok().body(dto);
	    }
	    
	    @PostMapping
	    public ResponseEntity<OriginDTO> insert(@RequestBody OriginDTO dto){
	    	dto = service.insert(dto);
	    	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
	    			.buildAndExpand(dto.getId()).toUri();
	    	return ResponseEntity.created(uri).body(dto);
	    	
	    }
	    
	    @PutMapping(value = "/{id}")
	    public ResponseEntity<OriginDTO> update(@PathVariable Long id,@RequestBody OriginDTO dto){
	    	dto = service.update(id, dto);
	    	 return ResponseEntity.ok().body(dto);	    	
	    	
	    }
	     
	    
	    @DeleteMapping(value = "/{id}")
	    public ResponseEntity<Void> delete(@PathVariable Long id){
	    	  service.delete(id);
	    	 return ResponseEntity.noContent().build();    	
	    	
	    }
	     
	

}
