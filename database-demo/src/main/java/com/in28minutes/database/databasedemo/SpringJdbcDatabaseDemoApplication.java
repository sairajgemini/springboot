package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Course;
import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDAO;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;
import com.in28minutes.database.databasedemo.repository.CourseRepository;

//@SpringBootApplication
public class SpringJdbcDatabaseDemoApplication implements CommandLineRunner {

	@Autowired
	private PersonJdbcDAO personJdbcDAO;
	
	@Autowired
	private PersonJpaRepository personJpaRepository;
	
	@Autowired
	private CourseRepository courseRepository;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Retrieving Person details through Spring Jdbc API\n");
		logger.info("All users -> {}", personJdbcDAO.findAll());
		logger.info("User 10001-> {}", personJdbcDAO.findById(10001), "\n");
		logger.info("====================================================");
		logger.info("Retrieving Person details through Spring Jpa");
		logger.info("All users -> {}", personJpaRepository.findById(10003));
		logger.info("User saved-> {}", personJpaRepository.insert(new Person(10004, "Pankaj Kumar", "Bangalore", new Date())), "\n");
		logger.info("====================================================");
		logger.info("\n\nCourse 10001->{}", courseRepository.findById(10001L));
		Course course = new Course("Hibernate course with spring");
		logger.info("Course saved-> {}", courseRepository.save(course ));
	}
}
