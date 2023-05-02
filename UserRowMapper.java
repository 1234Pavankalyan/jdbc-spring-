package springmvc.userDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springmvc.Model.User;

public class UserRowMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setUsername(rs.getString("username"));
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		return user;
	}
}