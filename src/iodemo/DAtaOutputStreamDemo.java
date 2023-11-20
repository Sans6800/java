package iodemo;
import java.io.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class DAtaOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {//write binary data
			FileOutputStream fos=new FileOutputStream("c:/demo/file.txt");
			DataOutputStream dout=new DataOutputStream(fos);
			
			dout.writeDouble(2000.00);
			dout.writeInt(55);
			dout.writeBoolean(true);
			dout.writeChar('D');
			System.out.println("Binary Data Written Successfully");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		try {//read binary data
			FileInputStream fis=new FileInputStream("c:/demo/file.txt");
			DataInputStream din=new DataInputStream(fis);
			
			double a=din.readDouble();
			int b=din.readInt();
			boolean c=din.readBoolean();
			char d=din.readChar();
			System.out.println("Values : "+a+" "+b+" "+c+" "+d);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
