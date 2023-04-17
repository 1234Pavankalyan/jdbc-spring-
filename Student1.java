package helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student1 {
private int rollNo;
private String name;
private int age;

@Value("101")
public void setRollNo(int rollNo) {
	this.rollNo=rollNo;
}
@Value("pavan")
public void setName(String name) {
	this.name=name;
}
@Value("26")
public void setAge(int age) {
	this.age=age;
}

public void display() {
	System.out.println("Roll no" +rollNo);
	System.out.println("NAME " +name);
	System.out.println("Age" +age);
}


}
