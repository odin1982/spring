package org.spring.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {
	public User mapRow(ResultSet row, int rowNum) throws SQLException {
		User user = new User();
		user.setId( row.getLong("id") );
		user.setFirstName( row.getString("first_name") );
		user.setAge( row.getInt("age") );
		return user;
	}
}