package com.sesatech.apirickymorty.dto;

import java.io.Serializable;

import com.sesatech.apirickymorty.entities.Origin;

public class OriginDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String name;
	private String url;
	
	
	OriginDTO(){
		
	}
	
	public OriginDTO(Long id, String name, String url) {
		this.id = id;
		this.name=name;
		this.url=url;
	}
	
	public OriginDTO(Origin entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.url = entity.getUrl();
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
