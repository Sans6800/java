package com.ey.training.jdbcdemo;

import java.sql.*;

public class SelectDemo {

	public static void main(String[] args) {
		  Connection con=null;
	       Statement stmt;
	       ResultSet rs;//Virtual Table - Retrieve data and store here
	       
	       try {
	    	   //Load & register the Driver
	    	   Class.forName("com.mysql.cj.jdbc.Driver");
	    	   
	    	   //Create connection object using getConnection()
	    	   con=DriverManager.getConnection
	    			   ("jdbc:mysql://localhost:3306/college","root","rps@123");
	    	   //Create statement object
	    	   stmt=con.createStatement();
	    	   
	    	   //Execute Query & store data in ResultSet
	    	   rs=stmt.executeQuery("select courseid,coursename, fees from course");
	    	   
	    	   //Traverse the resultset
	    	   while(rs.next()) {
	    		   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));		   
	    	   }
	    	   con.close();
	       }
	       catch(Exception ex) {
	    	   ex.printStackTrace();
	       }

	}

}
