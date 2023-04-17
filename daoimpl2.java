package suppliers2;
import java.sql.*;
import java.util.Scanner;
public class daoimpl2 implements DaoInterface2{
	Connection con;
	daoimpl2(){
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arogyapatients","root","");   
	}
	catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();   
	}   
	}
	
public void EnterSupplierDetails(Suppliers s) {
 try {
PreparedStatement pstmt=con.prepareStatement("insert into suppliers(SupplierID,SupplierName,Date,time)values(?,?,?,?)");
pstmt.setInt(1,s.getSupplierID());
pstmt.setString(2,s.getSupplierName());
pstmt.setString(3,s.getDate());
pstmt.setString(4,s.getTime());
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

	public void ShowAllSupplier() {
		// TODO Auto-generated method stub
		try {
			
			Statement st=con.createStatement();
			 ResultSet rs=st.executeQuery("SELECT * FROM suppliers");
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

	public void SearchSupplierById(int id) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter suppliers id to search: ");
	     int id2=sc.nextInt();
		try {
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM suppliers where SupplierID="+id2+"");
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

	public void UpdateSupplierById(int id) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter supplier supplierID  status:");
			int SupplierID1=sc.nextInt();
			System.out.println("Enter what supplier supplierID  status:");
			int SupplierID2=sc.nextInt();
		      System.out.println("Enter supplier name  status:");
				String SupplierName1=sc.next();
				System.out.println("Enter supplier Date  status:");
				String Date1=sc.next();
				System.out.println("Enter supplier time  status:");
				String time1=sc.next();
				
PreparedStatement pmt=con.prepareStatement("Update suppliers set SupplierID="+SupplierID1+",SupplierName='"+SupplierName1+"',Date='"+Date1+"',Time='"+time1+"' where SupplierID="+SupplierID2+"");
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

	public void DeleteSupplierById(int id) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id1=sc.nextInt();
		try{
	PreparedStatement pmt=con.prepareStatement("delete from suppliers where SupplierID="+id1+"");		
	      
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
