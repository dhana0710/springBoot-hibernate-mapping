package com.example.demo.entity.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Passport;
import com.example.demo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;



@Repository
@Transactional
public class StudentRepository {
	
	@Autowired
	private EntityManager entityManager;
	
	public Student findById(int id) {
		return entityManager.find(Student.class, id);
		
	}
	
	public void update(Student p) {
		entityManager.merge(p);
	}
	
	public void insert(Student p) {
		entityManager.persist(p);
	}
	
	public void deleteById(int id) {
		Student p=findById(id);
		entityManager.remove(p);
	}
	
	public List<Student> findAll(){
		TypedQuery<Student> query=entityManager.createQuery("select p from Student p", Student.class);
		List<Student> p=query.getResultList();
		return p;
//		if we try to update data in db in end use executeUpdate()
//		select p from Student p where p.location=:lName
//		query.setParameter("lNmae","Chennai" );       
//		("id",4)
	}
	
	public void addStudentWithPassport() {
		
		Passport pass=new Passport("XZS321");
		entityManager.persist(pass);
		
		Student s=new Student("ramm","Bangalore");
		s.setPassport(pass);
		entityManager.persist(s);
		
	}
	

}
