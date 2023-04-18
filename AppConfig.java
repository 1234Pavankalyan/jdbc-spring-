package springbook;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class AppConfig {
@Bean
public DataSource dataSource() {
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/libray");
	dataSource.setUsername("your-username");
	dataSource.setPassword("your-password");
	return dataSource;
	
}
}
