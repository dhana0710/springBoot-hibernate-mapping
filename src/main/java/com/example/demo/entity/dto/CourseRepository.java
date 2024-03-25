package com.example.demo.entity.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Passport;
import com.example.demo.entity.Review;
import com.example.demo.entity.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class CourseRepository {
	@Autowired
	private EntityManager entityManager;
	
	public Course findById(long l) {
		return entityManager.find(Course.class, l);
		
	}
	
	public void update(Course p) {
		entityManager.merge(p);
	}
	
	public void insert(Course p) {
		entityManager.persist(p);
	}
	
	public void deleteById(int id) {
		Course p=findById(id);
		entityManager.remove(p);
	}
	
	public List<Course> findAll(){
		TypedQuery<Course> query=entityManager.createQuery("select p from Course p", Course.class);
		List<Course> p=query.getResultList();
		return p;
//		if we try to update data in db in end use executeUpdate()
//		select p from Course p where p.location=:lName
//		query.setParameter("lNmae","Chennai" );       
//		("id",4)
	}
	
	public void addReviewWithCourse() {
		//get
		Course course=findById(20003L);
		
		//add 2 review 
		Review r1=new Review("3","Awesome");
		Review r2=new Review("3","Lovely one");
		
		course.addReview(r1);
		r1.setCourse(course);
		
		course.addReview(r2);
		r2.setCourse(course);
		
		//as we updated the course
		//now save review
		
		entityManager.persist(r1);
		entityManager.persist(r2);
		
	
		
	}
	
	public void addReviewWithCourse1(Long courseId,List<Review> review) {
//		same as above , but move dynamic and use Ehance for loop
		
	}

}
