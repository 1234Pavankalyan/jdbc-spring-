package helloworld;
import org.springframework.context.ApplicationContext;
import org.springframework.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

 public static void main(String[] args) {       
     ApplicationContext context = new ClassPathXmlApplicationContext("app4.xml");       
    
     
     Emp1 obj3= (Emp1)context.getBean("obj3");
     obj3.setId(168);
     obj3.setName("pavankalyan");
     obj3.setCity("vijayawada");
     
     obj3.display();
     
    
 }
}