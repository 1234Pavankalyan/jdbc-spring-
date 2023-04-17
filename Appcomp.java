package helloworld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Appcomp {
public static void main(String[] args){
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
context.scan("helloworld");
context.refresh();
MyComponent myComponent = context.getBean(MyComponent.class);
myComponent.doSomething();
context.close();

}
}