package basicdemo;

import java.util.Scanner; 
/*
 * Java program to find area of a circle
 */

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		float a,r; //variable declaration
		final float PI=3.14f;//constant declaration. [constant names should be uppercase]
		
		System.out.println("Enter Radius of a circle: ");
		r=s.nextFloat();
		
		a=PI*r*r;
		
		System.out.println("The Area of a circle is: "+a);
		System.out.print("The Area of a circle is: ");
		System.out.format("%.2f",a);
		s.close();
		

	}

}
