package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Passport;
import com.example.demo.entity.Student;
import com.example.demo.entity.dto.StudentRepository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@SpringBootTest(classes=SpringJpaRelationApplication.class)
class SpringJpaRelationApplicationTests {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private EntityManager em;
	
	@Autowired
	private StudentRepository sr;

	
//	@Test
//	void checkingFetchEager() {
//		//Internally it use Transactional for whole method by StudentRepository
//		Student s=sr.findById(10002);	
//		logger.info("Student-> {}",s);
//		logger.info("Student Passport-> {}",s.getPassport());
//	}
	
//	@Test
//	@Transactional
//	void checkingFetchLazy() {
//		//Internally it use Transactional for-each not whole becoz we use EntityManager direct
//		//To get result s.getPassport() use @Transactional at Top of the method
//		
//		Student s=em.find(Student.class, 10003);
//		logger.info("Student-> {}",s);
//		logger.info("Student Passport-> {}",s.getPassport());
//	}
	
	@Test
	@Transactional
	void retrieveStudentandPassport() {
		
		Student s=em.find(Student.class, 10003);
		logger.info("Student-> {}",s);
		logger.info("Student Passport-> {}",s.getPassport());
	}
	
	@Test
	@Transactional
	void retrievePassportandStudent() {
		
		Passport p=em.find(Passport.class, 202);
		logger.info("Passport-> {}",p);
		logger.info("Passport Studentt-> {}",p.getStudent());
	}
	
	

}







