package helloworld;

import org.springframework.beans.factory.annotation.Autowired;

public class MyService {
@Autowired
private MyRepository myRepository;
public void setMyRepository(MyRepository myRepository) {
	this.myRepository=myRepository;
}
public void doService() {
	myRepository.doSomething();
}
}
