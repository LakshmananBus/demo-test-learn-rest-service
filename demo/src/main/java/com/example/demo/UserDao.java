package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate template;

	public List<User> findAll() {
		return template.query("SELECT * from demo.user", BeanPropertyRowMapper.newInstance(User.class));
	}

}
