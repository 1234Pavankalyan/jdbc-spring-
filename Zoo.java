package helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
@Autowired
@Qualifier("dog")
private Animal dog;
@Autowired
@Qualifier("cat")
private Animal cat;
public void play() {
	System.out.println("Dog");
	dog.speak();
	System.out.println("cat");
	cat.speak();
}
}
