package com.in28minutes.database.databasedemo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.database.databasedemo.CourseJpaDatabaseDemoApplication;
import com.in28minutes.database.databasedemo.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=CourseJpaDatabaseDemoApplication.class)
public class JpqlTests {

	@Autowired
	private EntityManager em;
	
	@Test
	public void jpql_query() {
		Query createQuery = em.createQuery("select c from Course c");
		@SuppressWarnings("rawtypes")
		List resultList = createQuery.getResultList();
		System.out.println(resultList);
	}
	
	@Test
	public void jpql_typed_query() {
		TypedQuery<Course> createQuery = em.createQuery("select c from Course c", Course.class);
		List<Course> resultList = createQuery.getResultList();
		System.out.println(resultList);
	}

	@Test
	public void jpql_conditional_where() {
		TypedQuery<Course> createQuery = em.createQuery("select c from Course c where name like '%Angular%'", Course.class);
		List<Course> resultList = createQuery.getResultList();
		System.out.println(resultList);
	}
}
