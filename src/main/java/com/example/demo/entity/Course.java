package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Course {
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@OneToMany(mappedBy="course")
	private List<Review> review=new ArrayList<>();
	
	@UpdateTimestamp
	private LocalDateTime lastUpdatedDateTime;
	
	
	@CreationTimestamp
	private LocalDateTime createdDateTime;
	
	
	public Course() {
		
	}
	
	
	
	public Course(String name, LocalDateTime lastUpdatedDate, LocalDateTime createdDateTime) {
		super();
		this.name = name;
		this.lastUpdatedDateTime = lastUpdatedDate;
		this.createdDateTime = createdDateTime;
	}



	public List<Review> getReview() {
		return review;
	}



	public void addReview(Review review) {
		this.review.add(review);
	}
	public void removeReview(Review review) {
		this.review.remove(review);
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDateTime;
	}


	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDateTime = lastUpdatedDate;
	}


	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}


	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}



	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", review=" + review + ", lastUpdatedDateTime="
				+ lastUpdatedDateTime + ", createdDateTime=" + createdDateTime + "]";
	}
	
	

	
	

}
