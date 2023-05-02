package new2;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args )
//    {
//AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//context.scan("new2");
//StudentDAO student=(StudentDAO) context.getBean(StudentDAO.class);
//student.create("pavankalyan",15);
//    }
//}
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
 
  public static void main(String[] args) {
 
    // create a new Spring application context using the AppConfig class as the configuration
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 
    // get any beans that you need from the application context
    StudentDAO myDAO = context.getBean(StudentDAO.class);
 
    // use the beans as needed
    myDAO.create("pavan",12);
 
    // close the application context when you're done with it
    context.close();
  }
}
 