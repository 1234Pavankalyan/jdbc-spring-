package helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appcal {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appcal.xml");
        CalculatorService  k = context.getBean(CalculatorService.class);
 
        int a = 10, b = 5;

        System.out.println("Addition result: " + k.add(a, b));
        System.out.println("Subtraction result: " + k.subtract(a, b));
        System.out.println("Multiplication result: " + k.multiply(a, b));
        System.out.println("Division result: " + k.divide(a, b));
    }
 
}
