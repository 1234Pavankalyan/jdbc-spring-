package project;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
StudentJDBCTemplate student=(StudentJDBCTemplate)context.getBean("StudentJDBCTemplate");
student.create("aryan", 23);
student.create("vinay", 23);
student.create("babu", 22);
System.out.println(".....listing multiple Recorgs.......");
List<Student>students=student.listStudents();
for(Student record:students) {
	System.out.print("ID => " +record.getId());
	System.out.print(",name => " +record.getName());
	System.out.println(",Age => " +record.getAge());
	
}
System.out.println("---------Searching record by ID--------");
Student student2 = student.getStudentByID(1);
System.out.println("ID:" + student2.getId());
System.out.println("Name:" + student2.getName());
System.out.println("Age:" + student2.getAge());


System.out.println("---------Updating record--------");
student.setName("Rajesh");
student.setAge(26);
student.updateStudent(student);
System.out.println("Record updated successfully!");
System.out.println("Updated details:");
System.out.println("ID:" + student.getId());
System.out.println("Name:" + student.getName());
System.out.println("Age:" + student.getAge());


System.out.println("---------Deleting record--------");
int deletedRecords = students.deleteStudentByID(3);
if(deletedRecords > 0) {
    System.out.println("Record with ID 3 deleted successfully!");
}
else {
    System.out.println("Record with ID 3 not found or could not be deleted.");
    }
}
    }




