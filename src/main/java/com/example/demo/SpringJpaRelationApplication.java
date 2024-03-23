package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.dto.StudentRepository;

@SpringBootApplication
public class SpringJpaRelationApplication implements CommandLineRunner {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	private StudentRepository rep;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaRelationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("{}","Hello");
		rep.addStudentWithPassport();
//		logger.info("oneToOne -> {}",rep.addStudentWithPassport());
		
	}

}
