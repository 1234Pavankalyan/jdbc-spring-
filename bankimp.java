package bitlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class bankimp implements bankinterface{
	Connection con;
	bankimp(){
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts","root","");   
	}
	catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();   
	}   
	}
	public void bankdetails(Bank b) {
		// TODO Auto-generated method stub
		 try {
PreparedStatement pstmt=con.prepareStatement("insert into bankdetails(accountnum,accountbal,accountname,si)values(?,?,?,?)");
       pstmt.setInt(1,b.getAccountnum());
       pstmt.setInt(2,b.getAccountbal());
       pstmt.setString(3,b.getAccountname());
       pstmt.setFloat(4,b.getSi());
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
	

	public void deposit(int amount) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter bank ID  num:");
			int ID1=sc.nextInt();
			System.out.println("Enter banker name:");
			String name1=sc.next();
			System.out.println("Enter what to deposit into savings");
			int amount1=sc.nextInt();
		      System.out.println("Enter account balance");
				int bal1=sc.nextInt();
				bal1+=amount1;
				
				
				
PreparedStatement pmt=con.prepareStatement("Update bankdetails set accountbal="+bal1+" where accountname='"+name1+"'");
               
               int i=pmt.executeUpdate("Update from bankdetails where id="+ID1+"");
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
		
			
		
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bank ID  number to check ");
		int ID1=sc.nextInt();
		System.out.println("Enter banker   name:");
		String name1=sc.next();
		System.out.println("Enter what to withdraw from savings");
		int wamount1=sc.nextInt();
	      System.out.println("Enter account balance");
			int bal1=sc.nextInt();
			System.out.println("Enter bank minimum balance example=100:");
			int min=sc.nextInt();
			int count=0;
	if(bal1>=min) {
		if(bal1>wamount1) {
			bal1-=wamount1;
			count++;
			try {
PreparedStatement pmt=con.prepareStatement("Update bankdetails set accountbal="+bal1+" where accountname='"+name1+"'");
            
    int i=pmt.executeUpdate("Update from bankdetails where id="+ID1+"");
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
	}
	else {
		if((bal1<min)||(count>3)||(bal1<wamount1)) {
			System.out.println("Invalid to proceed ");
		}
	}

	
	}	
		
public void transfer(int amount) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter bank ID  number to check ");
	int ID1=sc.nextInt();
	System.out.println("Enter banker   name:");
	String name1=sc.next();
	System.out.println("Enter what to withdraw into savings");
	int wamount1=sc.nextInt();
      System.out.println("Enter account balance");
		int bal1=sc.nextInt();
		System.out.println("Enter bank minimum balance example=100:");
		int min=sc.nextInt();
		int count=0;
if(bal1>=min) {
	if(bal1>wamount1) {
		bal1-=wamount1;
		count++;
		try {
PreparedStatement pmt=con.prepareStatement("Update bankdetails set accountbal="+bal1+" where accountname='"+name1+"'");
        
int i=pmt.executeUpdate("Update from bankdetails where id="+ID1+"");
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
	try {
		
		System.out.println("Enter bank ID  num:");
		int ID2=sc.nextInt();
		System.out.println("Enter banker name:");
		String name2=sc.next();
	      System.out.println("Enter account balance");
			int bal2=sc.nextInt();
			bal1+=wamount1;
PreparedStatement pmt=con.prepareStatement("Update bankdetails set accountbal="+bal2+" where accountname='"+name2+"'");
           
           int i=pmt.executeUpdate("Update from bankdetails where id="+ID2+"");
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
else {
	if((bal1<min)||(count>3)||(bal1<wamount1)) {
		System.out.println("Invalid to proceed ");
}
}
}

	public void intrest(float Iamount) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter bank ID  num:");
			int ID4=sc.nextInt();
			System.out.println("Enter banker name:");
			String name4=sc.next();
			System.out.println("Enter what to deposit into savings");
			float Iamount1=sc.nextFloat();
		      System.out.println("Enter account balance");
				float bal1=sc.nextInt();
			bal1=bal1+(bal1*(Iamount1/100));
				
				
				
PreparedStatement pmt=con.prepareStatement("Update bankdetails set accountbal="+bal1+" where accountname='"+name4+"'");
               
               int i=pmt.executeUpdate("Update from bankdetails where id="+ID4+"");
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

}
