package basicdemo;

import java.util.Scanner;

public class SingleDigit {
	
	public static void main(String[] args) {

        int a;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		a=scan.nextInt();
		
		scan.close();
		
		// Logical Operators-> Combine multiple conditions
		// && - AND operator-- All conditions should be TRUE
		if(a>=-9 && a<=9)
		{
			System.out.println(a +" is a Single Digit Number");
		}
		else
		{
			System.out.println(a+" is not a Single Digit Number ");
		}
	}
}
