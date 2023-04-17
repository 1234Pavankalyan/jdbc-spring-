package helloworld;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appstudent {
public static void main(String args[]) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("helloworld");
	context.refresh();
	 Student1 stud = context.getBean(Student1.class);
	 stud.display();
	context.close();
}
}
