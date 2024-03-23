package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class Passport {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String passportnum;
	
	@OneToOne(fetch=FetchType.LAZY,mappedBy ="passport")
	private Student student;

	
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

	public String getPassportnum() {
		return passportnum;
	}

	public void setPassportnum(String passPortNum) {
	}
	
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", passPortNum=" + passportnum + "]";
	}






}
