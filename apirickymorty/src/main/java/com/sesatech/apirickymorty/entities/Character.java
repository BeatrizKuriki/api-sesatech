package com.sesatech.apirickymorty.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "tb_character1")
public class Character implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@Enumerated(EnumType.STRING)
	private StatusEnum status;
	private String species;	
	@Enumerated(EnumType.STRING)
	private GenderEnum gender;
	
	
	
	@ManyToMany
	@JoinTable(name= "tb_character1_local",
    joinColumns = @JoinColumn(name= "character1_id"),
    inverseJoinColumns = @JoinColumn(name = "local_id")			
		)	
     Set<Local> local = new HashSet<>();
	
	
	
	
	
	@ManyToMany
	@JoinTable(name= "tb_character1_origin",
    joinColumns = @JoinColumn(name= "character1_id"),
    inverseJoinColumns = @JoinColumn(name = "origin_id")			
		)	
     Set<Origin> origin = new HashSet<>();
	
	
	private String imgUrl;	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant created;	
	
	
	public Character() {		
	}




	public Character(Long id, String name, StatusEnum status, String species, GenderEnum gender,
			 String imgUrl, Instant created) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.species = species;
		this.gender = gender;		
		this.imgUrl = imgUrl;
		this.created = created;
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

	

	public Set<Origin> getOrigin() {
		return origin;
	}
	
	public Set<Local> getLocal() {
		return local;
	}	

	public void setLocation(Set<Local> local) {
		this.local = local;
	}




	public void setOrigin(Set<Origin> origin) {
		this.origin = origin;
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


	public void setDate(Instant created) {
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
