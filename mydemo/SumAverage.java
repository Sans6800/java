package basicdemo;

import java.util.Scanner;

/*
 * Program to find Sum and Average of 3 Nos
 * using Scanner Input to take values at run time 
 */
public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable declarations
		int a,b,c,sum;
		float avg,marks;
		String name;
		Scanner s = new Scanner(System.in);
		
		//input from user
		System.out.println("Enter Your Name: ");
		name=s.next();//String Input
		System.out.println("Enter Your Marks:");
		marks=s.nextFloat();//Float Input
		
		System.out.println("Enter 3 Numbers:");
		a=s.nextInt();//Integer Input
		b=s.nextInt();
		c=s.nextInt();
		
		//Process
		sum=a+b+c;
		avg=(float)sum/3;//Type casting
		
		//Output
		System.out.println("The Sum of 3 Nos is: "+sum);
		System.out.println("The Average of 3 Nos is: "+avg);
		System.out.println("Hello "+name+". You have scored "+marks+" Marks. ");
		s.close();

	}

}
