package helloworld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appservice{
public static void main(String[] args){
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
context.register(appconfig.class);
context.refresh();
MyService myService =context.getBean(MyService.class);
myService.doService();
context.close();
}
}