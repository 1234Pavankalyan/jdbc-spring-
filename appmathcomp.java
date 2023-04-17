
package helloworld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class appmathcomp{
public static void main(String[] args) {

AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
context.scan("helloworld" );
context. refresh() ;
mathcomponent ms = (mathcomponent)context.getBean(mathcomponent.class);
int result = ms.add1(1,2);
System.out.println("Addition of 1 and 2 =" + result);
context. close() ;
}
}