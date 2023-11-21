package com.ey.training.jdbcdemo;

/**
 * JDBC program to connect to MySQL DB & fetch records
 *
 */
import java.sql.*;

public class App 
{
    public static void main( String[] args )
    {
       Connection con=null;
       Statement stmt;
       ResultSet rs;//Virtual Table - Retrieve data and store here
       
       try {
    	   //Load & register the Driver
    	   Class.forName("com.mysql.cj.jdbc.Driver");
    	   
    	   //Create connection object using getConnection()
    	   con=DriverManager.getConnection
    			   ("jdbc:mysql://localhost:3306/classicmodels","root","rps@123");
    	   //Create statement object
    	   stmt=con.createStatement();
    	   
    	   //Execute Query & store data in ResultSet
    	   rs=stmt.executeQuery("select * from employees");
    	   
    	   //Traverse the resultset
    	   while(rs.next()) {
    		   System.out.println(rs.getInt(1)+" "+rs.getString(3)+" "+rs.getString("email")
    		   +" "+rs.getString(8));		   
    	   }
    	   con.close();
       }
       catch(Exception ex) {
    	   ex.printStackTrace();
       }
    }
}
