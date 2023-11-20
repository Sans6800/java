package iodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedwriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//create writer object in append mode
			FileWriter writer=new FileWriter("c:/demo/names.txt",true);
			//improves efficiency while writing data to file
			BufferedWriter bwr=new BufferedWriter(writer);
			
			bwr.write("\nMax");
			bwr.write("\nGosling");
			bwr.write("\nManu");
			System.out.println("Data Written successfully");
			bwr.close();
		}
		
		catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
