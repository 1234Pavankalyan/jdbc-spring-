package bitlabs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class count
{
public static void main(String[] args)
 {
try {
//1. loading Driver class
Class.forName("com.mysql.cj.jdbc.Driver");
// 2. Establish the connection
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/workers","root","");
Statement st=con.createStatement();
 ResultSet rs=st.executeQuery("SELECT * FROM hetero");
ResultSetMetaData rsmd=rs.getMetaData();
     int colscount=rsmd.getColumnCount();
    for(int i=1;i<=colscount;i++)
{
 System.out.print(rsmd.getColumnName(i)+"\t");
 }
System.out.println("\n----------------------------------------");
while(rs.next())
{
for(int i=1;i<=colscount;i++)
 {
System.out.print(rs.getString(i)+"\t");
}
 System.out.println();
 }
con.close();
 }
 catch(Exception e) 
        {
 System.out.println(e);
}
}
}
