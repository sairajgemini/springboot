package com.in28minutes.database.databasedemo.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.database.databasedemo.CourseJpaDatabaseDemoApplication;
import com.in28minutes.database.databasedemo.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=CourseJpaDatabaseDemoApplication.class)
public class CourseRepositoryTests {

	@Autowired
	private CourseRepository courseRepository;
	
	@Test
	public void findById_test() {
		Course course = courseRepository.findById(10001L);
		
		assertEquals("JPA support in Spring", course.getName());
	}

}
