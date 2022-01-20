package projectQ;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		char[] data=new  char[100];
		
		try
		{
		FileReader input =new FileReader("data.txt");
		input.read(data);
		System.out.println("Data Read Sucessfully");

		System.out.println(data);
		input.close();
			
	}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}


	}
}
