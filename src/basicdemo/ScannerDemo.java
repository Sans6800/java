package basicdemo;

import java.util.Scanner;

/*
 * Java program to demonstrate Scanner methods with character & string with multiple words
 */

public class ScannerDemo {

	public static void main(String[] args) {
		char ch;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a Initial : ");
		ch=scan.next().charAt(0); // Single character Input
		scan.nextLine();//pause the input
		System.out.println("Enter ur Full name: ");
		
		String fname=scan.nextLine();   // Multiple words String input
		
		System.out.println("Enter ur first name: ");
		String name=scan.next();
		
		scan.close();
		
		System.out.println("Entered Character is :"+ch);
		
		System.out.println("First Name :"+name);
		System.out.println("Full Name :"+fname);
	

	}

}
