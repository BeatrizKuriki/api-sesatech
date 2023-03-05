package com.sesatech.apirickymorty.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_location")
public class Location implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String dimension;
	//private List<Character> residents;
	private String url;
	//private LocalDateTime created = LocalDateTime.now();
	
	
	
	public Location() {
		
	}

	public Location(Long id, String name, String dimension, List<Character> residents, String url,
			LocalDateTime created) {
	
		this.id = id;
		this.name = name;
		this.dimension = dimension;
		//this.residents = residents;
		this.url = url;
		//this.created = created;
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



	//public List<Character> getResidents() {
		//return residents;
	//}



	//public void setResidents(List<Character> residents) {
		//this.residents = residents;
	//}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	//public LocalDateTime getCreated() {
		//return created;
	//}



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
		Location other = (Location) obj;
		return Objects.equals(id, other.id);
	}	
	


}


