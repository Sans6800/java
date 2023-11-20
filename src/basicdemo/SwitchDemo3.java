package basicdemo;

import java.util.Scanner;

/*
 * Program to perform arithmetic operations using Switch case
 */

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,res;
	    String op;
	    Scanner   s=new Scanner(System.in);

	     System.out.println("Enter 2 numbers :");
	     a=s.nextInt();
	     b=s.nextInt();
	     System.out.println("Enter any Arithmetic Operator :"); // +, -, *, /
	     op=s.next();
	     
	     s.close();
	     
	     switch(op)
	     {
	       case "+": res=a+b;
	       			System.out.println("The Addition is :"+res);
	       			break;

	       case "-": res=a-b;
	       				System.out.println("The Subtraction is :"+res);
	       				break; // exit the case
	       
	       case "*": res=a*b;
						System.out.println("The Multiplication is :"+res);
						break;
						
	       case "/": res=a/b;
						System.out.println("The Division is :"+res);
						break;

	       default: System.out.println("Invalid Operator");
			 		break;
	   }

	}

}
