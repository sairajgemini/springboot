package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;

//@SpringBootApplication
public class SpringJpaDatabaseDemoApplication implements CommandLineRunner {
	@Autowired
	private PersonJpaRepository personJpaRepository;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Retrieving Person details through Spring Jpa");
		logger.info("All Person -> {}", personJpaRepository.findAllPerson());
		logger.info("Person 10003 -> {}", personJpaRepository.findById(10002));
	    logger.info("Person created -> {}", personJpaRepository.insert(new Person("Pankaj Kumar", "Bangalore", new Date())));
	    logger.info("Person updated -> {}", personJpaRepository.insert(new Person(1, "Pankaj Roy", "Bangalore", new Date())));
	    
	    personJpaRepository.deleteById(10001);
	}
}