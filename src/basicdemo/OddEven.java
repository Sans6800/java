package basicdemo;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        int a;
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter a Number :");
				a=scan.nextInt();
				
				scan.close();
				
				if(a % 2==0)
				{
					System.out.println(a +" is a Even Number");
				}
				else
				{
					System.out.println(a +" is a Odd Number");
				}
	}

}
