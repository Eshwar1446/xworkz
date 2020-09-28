package com.firstproject.first_project.dto;

import java.io.Serializable;

import org.springframework.stereotype.Controller;

import java.io.Serializable;

public class LandingDTO implements Serializable{
	
	private String name;
	private String message;
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}