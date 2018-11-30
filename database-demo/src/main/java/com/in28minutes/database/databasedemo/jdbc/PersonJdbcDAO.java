package com.in28minutes.database.databasedemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Person> findAll() {
		return jdbcTemplate.query("SELECT * FROM PERSON", new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person findById(Integer id) {
		return jdbcTemplate.queryForObject("SELECT * FROM PERSON WHERE id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class));
	}
}
