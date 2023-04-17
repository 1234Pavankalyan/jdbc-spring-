package bitlabs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;


public class update {
public static void main(String args[]) {
	int id;
	String name,address;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter name");
	name=sc.next();
	System.out.println("enter address");
	address=sc.next();
	System.out.println("enter id");
	id=sc.nextInt();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/workers","root","");
		 PreparedStatement pmt=con.prepareStatement("Update hetero set name=?,address=? where id=?");
		 
		 pmt.setString(1,name);
		 pmt.setString(2,address);
		 pmt.setInt(3,id);
		 int i=pmt.executeUpdate();
		 if(i==1) {
			 System.out.println("Record Updated Successfully");	 
		 }
		 else {
			 System.out.println("ERROR OCCUR WHILE Updating");	 
		 }
	}
	catch(Exception r) {
		System.out.println(r);
	}
}
}
