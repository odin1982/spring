package org.spring.repository;

import java.util.List;

import org.spring.model.User;
import org.spring.model.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void add(User user) {
		String sql = "insert into user (first_name, age) values (?, ?)";
		jdbcTemplate.update(sql, user.getFirstName(), user.getAge());
	}

	public User findById(Long id) {
		String sql = "select * from user where id=?";
		User user = jdbcTemplate.queryForObject(sql, new Object[] { id }, new UserMapper());
		return user;
	}

	// If the database column names match the names of the object attributes,
	// there's no need to define a custom RowMapper interface, just use a
	// ParameterizedBeanPropertyRowMapper class:
	public User findById2(Long id) {
		String sql = "select * from user where id=?";
		User user = jdbcTemplate.queryForObject(sql, new Object[] { id }, ParameterizedBeanPropertyRowMapper.newInstance(User.class));
		return user;
	}

	public List<User> findAll() {
		String sql = "select * from user";
		List<User> userList = jdbcTemplate.query(sql, ParameterizedBeanPropertyRowMapper.newInstance(User.class));
		return userList;
	}
}
