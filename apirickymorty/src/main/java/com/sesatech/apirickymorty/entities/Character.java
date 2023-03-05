package com.sesatech.apirickymorty.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.sesatech.apirickymorty.entities.enums.GenderEnum;
import com.sesatech.apirickymorty.entities.enums.StatusEnum;


@Entity
@Table(name = "tb_character")
public class Character implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String name;
	private StatusEnum status;
	private String species;
	private GenderEnum gender;
	private String origin;
	
	@ManyToMany
	@JoinTable(name= "tb_character_location",
	       joinColumns = @JoinColumn(name= "character_id"),
	       inverseJoinColumns = @JoinColumn(name = "location_id")				
			)	
	Set<Location> locations = new HashSet<>();
	
	private String imgUrl;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant created;	
	
	
	public Character() {		
	}


	public Character(String id, String name, StatusEnum status, String species, GenderEnum gender, String origin,
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


	public Set<Location> getLocations() {
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


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Character other = (Character) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
	

}
