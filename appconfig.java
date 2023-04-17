package helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class appconfig {
	@Bean
public MyService myservice() {
	return new MyService();
}
	@Bean
	public MyRepository myRespository() {
		return new MyRepository();
	}
}
