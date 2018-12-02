package com.in28minutes.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Course;
import com.in28minutes.database.databasedemo.repository.CourseRepository;

@SpringBootApplication
public class CourseJpaDatabaseDemoApplication implements CommandLineRunner {
	@Autowired
	private CourseRepository courseJpaRepository;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(CourseJpaDatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Retrieving Person details through Spring Jpa");
		logger.info("CourseById 10001L -> {}", courseJpaRepository.findById(10001L));
		logger.info("Course 10003 -> {}", courseJpaRepository.save(new Course("JPA with Spring and Hibernate")));
		courseJpaRepository.deleteById(10001L);
	}
}