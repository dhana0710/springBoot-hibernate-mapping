package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Passport {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String passportnum;

	
	public Passport() {
		
	}

	public Passport( String passportNum) {

		this.passportnum = passportNum;

	}
	
	

	public Passport(int id, String passportNum) {
		super();
		this.id = id;
		this.passportnum = passportNum;
	}

	public String getPassPortNum() {
		return passportnum;
	}

	public void setPassPortNum(String passPortNum) {
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", passPortNum=" + passportnum + "]";
	}






}
