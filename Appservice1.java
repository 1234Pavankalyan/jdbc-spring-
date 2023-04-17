package helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appservice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
     context.scan("helloworld");
     context.refresh();
     MessageService message=context.getBean(MessageService.class);
     System.out.println(message.getMessage());
     context.close();
}
}
