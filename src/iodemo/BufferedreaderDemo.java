package iodemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedreaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader br =new BufferedReader(new FileReader("c:/demo/names.txt"));
			String line="";
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("File Doesnot Exists");
			ex.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("An exception occurred while reading the file");
			e.printStackTrace();
		}

	}

}
