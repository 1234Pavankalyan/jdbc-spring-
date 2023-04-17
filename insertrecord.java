package bitlabs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class insertrecord
{
 public static void main(String[] args)
{
int eno;
Scanner sc=new Scanner(System.in);
 System.out.println("Enter Employee Number:");
eno=sc.nextInt();
try {
//1. loading Driver class
Class.forName("com.mysql.cj.jdbc.Driver");
// 2. Establish the connection
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
PreparedStatement pstmt=con.prepareStatement("DELETE FROM EMP WHERE eno="+eno+"");
int i=pstmt.executeUpdate();
if(i==1)
{
System.out.println("Employee Record Deleted Successfully");
}
else
{
System.out.println("ERROR OCCUR WHILE Deleting");
}con.close();
 }
catch(Exception e) {
System.out.println(e);
 }
    
}
    
}
