package suppliers2;
import java.sql.*;
import java.util.Scanner;
public class daoimpl implements DaoInterface{
Connection con;
daoimpl(){
try {
Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arogyapatients","root","");   
}
catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();   
}   
}
public void patientRegistartion(patient p) {
	// TODO Auto-generated method stub
	 try {
	    	PreparedStatement pstmt=con.prepareStatement("insert into patients(name,gender,city,address,dateOfAdmission,guardianName,guardianAddress,aadharNumber,contactNumber,guardianContactNumber,age,status)values(?,?,?,?,?,?,?,?,?,?,?,?)");
	    	pstmt.setString(1,p.getName());
	    	pstmt.setString(2,p.getGender());
	    	 pstmt.setString(3,p.getCity());
	    	 pstmt.setString(4,p.getAddress());
	    	 pstmt.setString(5,p.getDateOfAdmission());
	    	 pstmt.setString(6,p.getGuardianName());
	    	 pstmt.setString(7,p.getGuardianAddress());
	    	 pstmt.setString(8,p.getAadharNumber());
	    	 pstmt.setString(9,p.getContactNumber()); 
	    	 pstmt.setString(10,p.getGuardianContactNumber());
	    	 pstmt.setInt(11,p.getAge());
	    	 pstmt.setString(12,p.getstatus());
	    	int i=pstmt.executeUpdate();
	    	 if(i!=0) {
	    	System.out.println("data saved successfully");
	    	}
	    	 else {
	    	 System.out.println("data is not saved successfully");
	    	 }
	    	 } 
	    catch (SQLException e) {
	    	// TODO Auto-generated catch block
	    	e.printStackTrace();
	    	 }
}
public void showAllPatient() {
	// TODO Auto-generated method stub
	try {
		
		Statement st=con.createStatement();
		 ResultSet rs=st.executeQuery("SELECT * FROM patients");
		ResultSetMetaData rsmd=rs.getMetaData();
		     int colscount=rsmd.getColumnCount();
		    for(int i=1;i<=colscount;i++)
		{
		 System.out.print(rsmd.getColumnName(i)+"\t");
		 }
		System.out.println("===============================");
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
public void searchPatientById(int id) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter patient ID to search: ");
	String id1=sc.next();
	try {
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM patients where id="+id1+"");
		 ResultSetMetaData rsmd=rs.getMetaData();
		 int colscount=rsmd.getColumnCount();
		 for(int i=1;i<=colscount;i++)
		 {
		 System.out.print(rsmd.getColumnName(i)+"\t ");
		 }
		 System.out.println("\n--------------------------------------------------------------------------------");
		 while(rs.next())
		 {
			
		 for(int i=1;i<=colscount;i++)
		 {
		 System.out.print(rs.getString(i)+"\t ");
		 }
		 System.out.println();
		 }
		 con.close();
		 }
		 catch(Exception e) {
		 System.out.println(e);
		 }
}
public void searchPatientByCity(String city) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter patient city to search: ");
	String city1=sc.next();
	try {
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM patients where city='"+city1+"'");
		 ResultSetMetaData rsmd=rs.getMetaData();
		 int colscount=rsmd.getColumnCount();
		 for(int i=1;i<=colscount;i++)
		 {
		 System.out.print(rsmd.getColumnName(i)+"\t ");
		 }
		 System.out.println("\n--------------------------------------------------------------------------------");
		 while(rs.next())
		 {
			
		 for(int i=1;i<=colscount;i++)
		 {
		 System.out.print(rs.getString(i)+"\t ");
		 }
		 System.out.println();
		 }
		 con.close();
		 }
		 catch(Exception e) {
		 System.out.println(e);
		 }
}
public void searchPatientByAge(int age) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter patient age to search: ");
     int age1=sc.nextInt();
	try {
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM patients where age="+age1+"");
		 ResultSetMetaData rsmd=rs.getMetaData();
		 int colscount=rsmd.getColumnCount();
		 for(int i=1;i<=colscount;i++)
		 {
		 System.out.print(rsmd.getColumnName(i)+"\t ");
		 }
		 System.out.println("\n---------------------------------------");
		 while(rs.next())
		 {
		
		 for(int i=1;i<=colscount;i++)
		 {
		 System.out.print(rs.getString(i)+"\t ");
		 }
		 System.out.println();
		 }
		 
		 con.close();
		 }
		 catch(Exception e) {
		 System.out.println(e);
		 }		
}
public void recoveryStatus(String status) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter patient status:");
	String status1=sc.next();
	 System.out.println("Enter patient id:");
		int id7=sc.nextInt();
	try {
	
	PreparedStatement pst=con.prepareStatement("update  patients set status='"+status1+"' where id="+id7+"");
	
	int i=pst.executeUpdate();
	if(i==1) {
		System.out.println("statement updated correctly");
	}
	else {
		System.out.println("statement not updated correctly");	
	}
	con.close();
	}
	catch(Exception e) {
		System.out.println(e);	
	}
}
public void deletePatientById(int id) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id");
	int id1=sc.nextInt();
	try{
		
		PreparedStatement pmt=con.prepareStatement("delete from patients where id="+id1+"");
		int i=pmt.executeUpdate();
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