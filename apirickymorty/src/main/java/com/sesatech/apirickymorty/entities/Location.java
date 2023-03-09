package com.sesatech.apirickymorty.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
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
	

	
	@ManyToMany
	@JoinTable(name= "tb_location_character1",
    joinColumns = @JoinColumn(name= "location_id"),
    inverseJoinColumns = @JoinColumn(name = "character1_id")			
		)	
     List<Character> residents = new ArrayList<>();
	
	private String url;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant created;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant updated;
	
	
	
	
	public Location() {
		
	}



	public Location(Long id, String name, String dimension, String url, Instant created) {
	
		this.id = id;
		this.name = name;
		this.dimension = dimension;	
		this.url = url;
		this.created = created;
	}



	public List<Character> getResidents() {
		return residents;
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


	public Instant getUpdated() {
		return updated;
	}
	
	@PrePersist
	public void prePersist() {
		created = Instant.now();
	}
	
	@PreUpdate
	public void preUpdate() {
		updated = Instant.now();
	}






	@Override
	public int hashCode() {
		return Objects.hash(created, id);
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
		return Objects.equals(created, other.created) && Objects.equals(id, other.id);
	}




	
	
	
	

}

