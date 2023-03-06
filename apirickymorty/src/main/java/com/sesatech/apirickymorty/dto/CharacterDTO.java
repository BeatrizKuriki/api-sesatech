package com.sesatech.apirickymorty.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;

import com.sesatech.apirickymorty.entities.Location;
import com.sesatech.apirickymorty.entities.enums.GenderEnum;
import com.sesatech.apirickymorty.entities.enums.StatusEnum;

public class CharacterDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private String id;
	private String name;
	private StatusEnum status;
	private String species;
	private GenderEnum gender;
	private String origin;
	
   
	
	private String imgUrl;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant created;	
	
	private List<LocationDTO> locations = new ArrayList<>();
	
	public CharacterDTO() {		
	}


	public CharacterDTO(String id, String name, StatusEnum status, String species, GenderEnum gender, String origin,
			String imgUrl, Instant created) {
		
		this.id = id;
		this.name = name;
		this.status = status;
		this.species = species;
		this.gender = gender;
		this.origin = origin;
		this.imgUrl = imgUrl;
		this.created = created;
	}
	





	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public StatusEnum getStatus() {
		return status;
	}


	public void setStatus(StatusEnum status) {
		this.status = status;
	}


	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public GenderEnum getGender() {
		return gender;
	}


	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}


	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public List<LocationDTO> getLocations() {
		return locations;
	}




	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public Instant getCreated() {
		return created;
	}


	public void setCreated(Instant created) {
		this.created = created;
	}
	
	
	
	
	
	

}
