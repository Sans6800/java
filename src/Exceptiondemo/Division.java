package Exceptiondemo;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, result;
		 Scanner input = new Scanner(System.in);
		 
		  System.out.println("Input two integers");
		  a = input.nextInt();
		  b = input.nextInt();  // enter 0
		  
		 result = a / b;  // JRE Throws Arithmetic exception
		 
		 System.out.println("Result = " + result);  
		 input.close();

	}

}
