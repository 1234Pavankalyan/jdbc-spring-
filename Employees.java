package helloworld;


public class Employees {
private int id;  
private String name;  
private String city;  
private Address Add;
public Address getAdd() {
	return Add;
}
public void setAdd(Address add) {
	Add = add;
}
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
void display(){ 
System.out.println(id+" "+name+" "+city+" "+Add);  
}  

}  

 