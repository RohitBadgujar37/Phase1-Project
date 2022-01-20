package projectQ;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

	public static void main(String[] args) {
		String data="This is my Append";
		
		try
		{
			FileWriter output=new FileWriter("data1.txt",true);
			output.write(data);
			
			System.out.println("Data Append Sucessfully");
			output.close();
		}catch(IOException ex)
		{
			ex.printStackTrace();
		}

	}

}
