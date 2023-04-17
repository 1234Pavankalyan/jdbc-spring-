package helloworld;
import javax.validation.constraints.NotNull; 
public class MyBean {
@NotNull
private String myProperty;
public void setMyProperty(String myProperty) {
this.myProperty=myProperty;
}
public String getMyProperty() {
	return myProperty;
}
}

