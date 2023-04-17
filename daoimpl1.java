package suppliers2;

import java.sql.*;
import java.util.Scanner;
public class daoimpl1 implements DaoInterface1{

Connection con;
daoimpl1(){
try {
Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arogyapatients","root","");   
}
catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();   
}   
}
public void EnterMedicineDetails(MEDICINE m) {
	// TODO Auto-generated method stub
	
	    try {
PreparedStatement pstmt=con.prepareStatement("insert into medicines(MedicineName,Unitprice,Quantity,Manufacturedate,ExpiryDate)values(?,?,?,?,?)");
pstmt.setString(1,m.getMedicineName());
pstmt.setString(2,m.getUnitprice());
 pstmt.setString(3,m.getQuantity());
 pstmt.setString(4,m.getManufacturedate());
 pstmt.setString(5,m.getExpiryDate());
 int i=pstmt.executeUpdate();
 if(i!=0) {
System.out.println("medicine data saved successfully");
}
 else {
 System.out.println("medicine data is not saved successfully");
 }
 } 
catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
 }

}
public void ShowAllMedicines() {
	// TODO Auto-generated method stub
	try {
		
		Statement st=con.createStatement();
		 ResultSet rs=st.executeQuery("SELECT * FROM medicines");
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
public void SearchMedicineById(int id) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter medicine id to search: ");
     int id2=sc.nextInt();
	try {
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM medicines where MedicineID="+id2+"");
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
public void UpdateMedicineById(int id) {
	// TODO Auto-generated method stub
	try {
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter medicine name  status:");
		String medicinename1=sc.next();
		System.out.println("Enter medicine Unitprice  status:");
		String Unitprice1=sc.next();
		System.out.println("Enter medicine Quantity  status:");
		String Quantity1=sc.next();
		System.out.println("Enter medicine Manufacturedate  status:");
		String Manufacturedate1=sc.next();
		System.out.println("Enter medicine ExpiryDate  status:");
		String ExpiryDate1=sc.next();
		System.out.println("Enter medicine MedicineID  status:");
		int MedicineID1=sc.nextInt();
		System.out.println("Enter what medicine MedicineID  status:");
		int MedicineID2=sc.nextInt();
		
	
 PreparedStatement pmt=con.prepareStatement("Update medicines set MedicineID="+MedicineID1+",MedicineName='"+medicinename1+"',Unitprice='"+Unitprice1+"',Quantity='"+Quantity1+"',Manufacturedate='"+Manufacturedate1+"',ExpiryDate='"+ExpiryDate1+"' where MedicineID="+MedicineID2+"");
		 
		 int i=pmt.executeUpdate();
		 if(i==0){
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
	 

public void DeleteMedicineById(int id) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id");
	int id1=sc.nextInt();
	try{
PreparedStatement pmt=con.prepareStatement("delete from medicines where MedicineID="+id1+"");		
      
     int i=pmt.executeUpdate();
		if(i==1)
		{
		System.out.println("medicine Record Deleted Successfully");
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

