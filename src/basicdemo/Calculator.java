package basicdemo;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaration of Variables
				Scanner s=new Scanner(System.in);
				String name;
				int a,b,sum,sub,mul;
				float div;
				
				//take input from user
				System.out.println("Enter Your Name: ");
				name=s.next(); // string input
				System.out.println("Enter 2 Numbers : ");
				a=s.nextInt(); // integer input
				b=s.nextInt();
				
				//process
				sum=a+b;
				sub=a-b;// take 
				mul=a*b;
				div=(float)a/b;  //type casting - converting one data type to another
				
				//display output
				System.out.println("***************** Java Calculator ****************");
				System.out.println("The Addition is       : "+sum);
				System.out.println("The Subtraction is    : "+sub);
				System.out.println("The Multiplication is : "+mul);
				System.out.println("The Division is       : "+div);
				System.out.println("Program Created by    : "+name+" . Thank You");
				System.out.println("*************************************************");
				
				s.close();

	}

}
