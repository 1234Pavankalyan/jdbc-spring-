package helloworld;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appuser {


public static void main(String args[]) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("helloworld");
	context.refresh();
	UserRepositoryImpl userRepository=context.getBean(UserRepositoryImpl.class);
	List<String>users=userRepository.getUsers();
	for(String m:users) {
		System.out.println("users =>" +m);
	}
	context.close();
}
}
