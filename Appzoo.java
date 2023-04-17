package helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appzoo {
public static void main(String args[]) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("helloworld");
	context.refresh();
	Zoo zoo=context.getBean(Zoo.class);
	zoo.play();
	context.close();
}
}
