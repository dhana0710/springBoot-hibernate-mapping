package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Student;
import com.example.demo.entity.dto.StudentRepository;

import jakarta.persistence.EntityManager;

@SpringBootTest(classes=SpringJpaRelationApplication.class)
class SpringJpaRelationApplicationTests {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private EntityManager em;
	
	@Autowired
	private StudentRepository sr;

//	@Test
//	void contextLoads() {
//		
//		assertEquals("hello","hello0");
//	}
	
	@Test
	void add() {
		Student s=sr.findById(10002);	
		logger.info("Student-> {}",s);
		logger.info("Student Passport-> {}",s.getPassport());
		
		
	}

}
