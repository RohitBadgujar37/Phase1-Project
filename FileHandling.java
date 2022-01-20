package projectQ;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args)
	{
		File f=new File("data1.txt");
		
		try {
			if(f.createNewFile())
			{
				System.out.println("File created Sucewssfully");
			}
			else
			{
				System.out.println("File creation error");
			}
		} catch (IOException ex) 
		{
		      ex.printStackTrace();
		}
		
		
		String data="My Name is Rohit Shantaram Badgujar";
		try
		{
		
		FileWriter output=new FileWriter("data1.txt");
		output.write(data);
		System.out.println("Data Written Sucessfully");
		output.close();

	}
		catch(IOException ex)
		{
       	ex.printStackTrace();
		}
		
		
		
		
}
	
}

