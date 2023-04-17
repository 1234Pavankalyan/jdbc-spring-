package bitlabs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class delete
{
 public static void main(String[] args)
{
int id;
Scanner sc=new Scanner(System.in);
 System.out.println("Enter Employee Number:");
id=sc.nextInt();
try {
//1. loading Driver class
Class.forName("com.mysql.cj.jdbc.Driver");
// 2. Establish the connection
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/workers","root","");
PreparedStatement pstmt=con.prepareStatement("DELETE FROM hetero WHERE id="+id+"");
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
