package com.in28minutes.database.databasedemo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Course;

@Repository
@Transactional
public class CourseRepository {
	@Autowired
	private EntityManager em;
	
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}
	
	public Course save(Course course) {
		return em.merge(course);
	}
	
	public void deleteById(Long id) {
		em.remove(findById(id));
	}

}
