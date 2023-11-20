package basicdemo;

import java.util.Scanner;

/*
 * Program to fing greatest of 2 Nos
 */

public class Greatest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scan=new Scanner(System.in);
		
				
		System.out.println("Enter 2 NUmbers :");
		a=scan.nextInt();
		b=scan.nextInt();
		
		scan.close();
		
		if(a>b) {
			System.out.println(a+ " is Greatest. ");
		}
		else {
			System.out.println(b+ " is Greatest. ");
		}
		

	}

}
