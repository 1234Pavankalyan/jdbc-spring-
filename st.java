package bitlabs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.*;

public class st {
public static void main(String args[]) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/workers","root","");
	    Statement st=con.createStatement();
		ResultSet rst=st.executeQuery("select * from hetero");
		ResultSetMetaData rs=rst.getMetaData();
		int colcount=rs.getColumnCount();
		for(int i=1;i<=colcount;i++) {
			System.out.println(rs.getColumnName(i));
		}
		System.out.println("==================");
		while(rst.next()) {
			for(int i=1;i<=colcount;i++) {
		System.out.print(rst.getString(i) +"\t");	
		}
			 System.out.println();
		}
		con.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}	
}
}
