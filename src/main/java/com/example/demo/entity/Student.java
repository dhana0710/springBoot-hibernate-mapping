package com.example.demo.entity;



import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String name;

	private String location;
	
	@OneToOne
	private Passport passport;
	


	public Passport getPassport() {
		return passport;
	}



	public void setPassport(Passport passport) {
		this.passport = passport;
	}



	public Student() {
		
	}



	public Student(String name, String location) {
		super();
		this.name = name;
		this.location = location;

	}

	public Student(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", location=" + location + ", passport=" + passport + "]";
	}






	



}