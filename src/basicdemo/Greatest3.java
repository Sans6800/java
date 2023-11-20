package basicdemo;

import java.util.Scanner;

/*
 * Program to find greatest of 3 nos if-else if-else
 */
public class Greatest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		
				
		System.out.println("Enter 3 NUmbers :");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		scan.close();
		
		if(a>b && a>c) {
			System.out.println(a+ " is Greatest. ");
		}
		else if(b>c && b>a) {
			System.out.println(b+ " is Greatest. ");
		}
		else {
			System.out.println(c+ " is Greatest. ");

	}

	}

}
