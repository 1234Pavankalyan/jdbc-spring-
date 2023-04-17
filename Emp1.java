package helloworld;

public class Emp1 {
private int id;
private String name;
private String city;
private Address Add;
private Question qa;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Address getAdd() {
	return Add;
}
public void setAdd(Address add) {
	Add = add;
}
public Question getQa() {
	return qa;
}
public void setQa(Question qa) {
	this.qa = qa;
}
public void display() {
	System.out.println("EmployeeID : "+id);
	System.out.println("EmployeeName : "+name);
	System.out.println("EmployeeCity : "+city);
	System.out.println("Address : " +Add);
	qa.display();
}


}
