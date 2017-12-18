package com.raj.bootdemo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Team {
	Long id;
	String name;
	String location;
	public Long getId() {
		return id;
	}
	@XmlElement
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	
	@XmlElement
	public void setLocation(String location) {
		this.location = location;
	}

}
