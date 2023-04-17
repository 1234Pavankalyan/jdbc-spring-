package helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dog")
public class Dog implements Animal{
 
	public void speak() {
		// TODO Auto-generated method stub
	System.out.println("bow bow");	
	}

}
