package helloworld;

public class student {
int no;
String name;
double avg;
test t;
student (int no,String name,double avg,test t){
	super();
	this.no=no;
	this.name=name;
	this.avg=avg;
	this.t=t;
}

public String toString() {
return no +name +avg +t.toString();
}
}
