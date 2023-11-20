package Exceptiondemo;

import java.util.Scanner;

public class Divisiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, result;
		 Scanner input = new Scanner(System.in);
		 
		  System.out.println("Input two integers");
		  a = input.nextInt();
		  b = input.nextInt();  // enter 0
		  try {//statement to be monitored which may throw exceptions
			  result = a / b; 
		 
		      System.out.println("Result = " + result);  
		  }
		  catch(ArithmeticException e) {//exception thrown is handled in catch block
			  System.out.println("Divide by zero Error - Enter non-zero value");
			  System.err.println("Exception Description: "+e.getMessage());
			  System.err.println("Exception Name & description :"+e.toString());
			  e.printStackTrace();//desc,name & line no
		  }
		  finally {
		 input.close();
		  }

	}

}
