package new2;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentJDBCTemplate {
private JdbcTemplate jdbctemplateobject;

@Autowired
public void setDataSource(DataSource dataSource) {
	this.jdbctemplateobject=new JdbcTemplate(dataSource);
	
}
public void create(String name,int age) {
	String SQL="Insert into students1(name,age) values(?,?)";
	jdbctemplateobject.update(SQL,name,age);
	System.out.println("created record name="+name+" Age= " +age);
}
}
