package oopsdemo3;

import java.util.Scanner;

//interface demonstration
public class Calculator implements IMath {

	Scanner kb;
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform subtraction");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a-b;
        System.out.println("Difference of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Multiplication");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a*b;
        System.out.println("Product of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Division");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a/b;
        System.out.println("Division of "+a+" and "+b+" is "+s);
		
	}
	
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		System.out.println("********** Calculator Interface ***********");
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
	}

}
