package helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@PropertySources({@PropertySource("classpath:application.properties")})
public class MyComponent {
@Value("${my.property}")
private String myProperty;
public void doSomething() {
	System.out.println("My property value is  " +myProperty);
}
}
