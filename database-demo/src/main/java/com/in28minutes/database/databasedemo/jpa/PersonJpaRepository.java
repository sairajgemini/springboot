package com.in28minutes.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Person> findAllPerson() {
		return entityManager.createNamedQuery("find_all_persons", Person.class).getResultList();
	}
	
	public Person findById(Integer id) {
		return entityManager.find(Person.class, id);
	}
	
	public Person insert(Person person) {
		return entityManager.merge(person);
	}
	
	public void deleteById(Integer id) {
		Person person = findById(id);
		entityManager.remove(person);
	}
}
