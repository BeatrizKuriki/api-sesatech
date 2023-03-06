package com.sesatech.apirickymorty.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;

import com.sesatech.apirickymorty.entities.Location;

public class LocationDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String dimension;
	
	//private List<Character> residents;
	
	private String url;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant created;
	
	
	LocationDTO(){
		
	}


	public LocationDTO(Long id, String name, String dimension, String url, Instant created) {
		
		this.id = id;
		this.name = name;
		this.dimension = dimension;
		this.url = url;
		this.created = created;
	}

	public LocationDTO(Location entity) {
		this.id = entity.getId();
		this.name =entity.getName();
		this.dimension = entity.getDimension();
		this.url = entity.getUrl();
		this.created = entity.getCreated();
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDimension() {
		return dimension;
	}


	public void setDimension(String dimension) {
		this.dimension = dimension;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public Instant getCreated() {
		return created;
	}


	public void setCreated(Instant created) {
		this.created = created;
	}
	
}
