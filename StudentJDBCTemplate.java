package project;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO{
private DataSource dataSource;
private Student Stud;
private JdbcTemplate jdbcTemplateObject;
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	}
	public void create(String name, Integer age) {
		// TODO Auto-generated method stub
		String SQL= "insert into students1(name,age) values(?,?)";
		jdbcTemplateObject.update(SQL,name,age);
		System.out.println("created record name=" +name +" Age= " +age);
	}
  public  List<Student>listStudents(){
	  String SQL="select * from students1";
	  List<Student>students=jdbcTemplateObject.query(SQL, new BeanPropertyRowMapper<Student>(Student.class));
	return students;
	  
  }
  public Student getStudentByID(int ID) {
	 	String SQL = "SELECT * FROM students WHERE ID = ?";
	     @SuppressWarnings("deprecation")
			Student student = jdbcTemplateObject.queryForObject(SQL, new Object[]{ID}, new BeanPropertyRowMapper<Student>(Student.class));
	     return student;
	 }

	
	 public int deleteStudentByID(int ID) {
		 String SQL = "DELETE FROM students WHERE ID = ?";
	     jdbcTemplateObject.update(SQL, ID);
	     System.out.println("Deleted Record with ID = "+ID);;
	     return ID;
	}
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		 String SQL = "UPDATE students SET NAME = ?, AGE = ? WHERE ID = ?";
	     jdbcTemplateObject.update(SQL, Stud.getName(), Stud.getAge(), Stud.getId());
	     System.out.println("Updated Record with ID = " + Stud.getId());
		
	}
	
	
}
