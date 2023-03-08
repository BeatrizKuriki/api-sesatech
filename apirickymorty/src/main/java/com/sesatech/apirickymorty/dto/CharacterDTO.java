package com.sesatech.apirickymorty.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;

import com.sesatech.apirickymorty.entities.Character;
import com.sesatech.apirickymorty.entities.Local;
import com.sesatech.apirickymorty.entities.Origin;
import com.sesatech.apirickymorty.entities.enums.GenderEnum;
import com.sesatech.apirickymorty.entities.enums.StatusEnum;

public class CharacterDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String name;
	private StatusEnum status;
	private String species;
	private GenderEnum gender;
	private List<OriginDTO> origin = new ArrayList<>();	
	private List<LocalDTO> local = new ArrayList<>();	
	private String imgUrl;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant created;	
	



	public CharacterDTO(Long id, String name, StatusEnum status, String species, GenderEnum gender, String imgUrl, Instant created) {
	
		this.id = id;
		this.name = name;
		this.status = status;
		this.species = species;
		this.gender = gender;		
		this.imgUrl = imgUrl;
		this.created = created;
	}
	
	public CharacterDTO(Character entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.status = entity.getStatus();
		this.species = entity.getSpecies();
		this.gender = entity.getGender();			
		this.imgUrl = entity.getImgUrl();
		this.created = entity.getCreated();
		
	}
	
	public CharacterDTO(Character entity, List<Origin> origin) {
		this(entity);
		origin.forEach(element -> this.origin.add(new OriginDTO(element)));				
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

	public List<OriginDTO> getOrigin() {
		return origin;
	}


	public void setOrigin(List<OriginDTO> origin) {
		this.origin = origin;
	}
	
	public List<LocalDTO> getLocal() {
		return local;
	}
	
	public void setLocal(List<LocalDTO> local) {
		this.local = local;
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
