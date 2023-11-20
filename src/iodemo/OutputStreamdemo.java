package iodemo;
import java.io.*;
public class OutputStreamdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos=new FileOutputStream("c:/demo/data1.txt");
			String text="Its a Sunny Day";
			
			byte[] myBytes=text.getBytes();
			
			fos.write(myBytes);
			System.out.println("Data Written to Binary File");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
