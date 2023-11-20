package iodemo;

import java.io.FileReader;
import java.io.Reader;

//Reader class is used to read textual data from a file
public class ReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Reader reader = new FileReader("c:/demo/data.txt");
			int data =reader.read();//returns unicode value of character
			while(data!=-1) {
				System.out.print((char)data);
				data=reader.read();
			}
			reader.close();
			}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
