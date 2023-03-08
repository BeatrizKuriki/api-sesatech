package com.sesatech.apirickymorty.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;

import com.sesatech.apirickymorty.entities.Character;
import com.sesatech.apirickymorty.entities.Location;
import com.sesatech.apirickymorty.entities.enums.GenderEnum;
import com.sesatech.apirickymorty.entities.enums.StatusEnum;

public class CharacterDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String name;
	private StatusEnum status;
	private String species;
	private GenderEnum gender;
	private String origin;		
	private Object location;	
	private String imgUrl;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant created;	
	
	
	
	public CharacterDTO() {		
	}



	public CharacterDTO(Long id, String name, StatusEnum status, String species, GenderEnum gender, String origin,
			String location, String imgUrl, Instant created) {
	
		this.id = id;
		this.name = name;
		this.status = status;
		this.species = species;
		this.gender = gender;
		this.origin = origin;
		this.location = location;
		this.imgUrl = imgUrl;
		this.created = created;
	}
	
	public CharacterDTO(Character entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.status = entity.getStatus();
		this.species = entity.getSpecies();
		this.gender = entity.getGender();
		this.origin = entity.getOrigin();
		this.location = entity.getLocation();
		this.imgUrl = entity.getImgUrl();
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



	public StatusEnum getStatus() {
		return status;
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



	public String getOrigin() {
		return origin;
	}



	public void setOrigin(String origin) {
		this.origin = origin;
	}



	public Object getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
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
