package iodemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * Character Streams-Read/Write Textual data using Reader/Writer classes of java.io package
 */
public class WriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content ="She Sells Sea Shells on the Sea Shore";
		try {
			Writer w=new FileWriter("c://demo/data.txt");
			w.write(content);
			System.out.println("Data written to File");
			w.close();
		}
		catch(IOException e) {
			System.out.println("ERROR OCURRED");
			e.printStackTrace();
		}

	}

}
