package helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class emp {
public static void main(String args[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("application1.xml");
	employee obj=(employee) context.getBean("emp1");
	System.out.println(obj.getName());
	System.out.println(obj.getAddress());
	System.out.println(obj.getMobile());
	System.out.println(obj.getRole());
}
}
