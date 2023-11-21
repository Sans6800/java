package com.ey.training.jdbcdemo;

import java.sql.*;

public class DeleteDemo {

	public static void main(String[] args) {
		Connection con=null;
	       Statement stmt;
	       ResultSet rs;//Virtual Table - Retrieve data and store here
	       int count;
	       try {
	    	   //Load & register the Driver
	    	   Class.forName("com.mysql.cj.jdbc.Driver");
	    	   
	    	   //Create connection object using getConnection()
	    	   con=DriverManager.getConnection
	    			   ("jdbc:mysql://localhost:3306/college","root","rps@123");
	    	   //Create statement object
	    	   stmt=con.createStatement();
	    	   String str="delete from course where courseid =107";
	    	   //dml operation are executed with executeUpdate() 
	    	   count=stmt.executeUpdate(str);
	    	   
	    	   if(count>0) {
	    		   System.out.println("Record Deleted Successfully");
	    	   }
	    	   
	    	   con.close();
	       }
	       catch(Exception ex) {
	    	   ex.printStackTrace();
	       }

	}

}
