package Abips;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample {

	public static void main(String[] args)
	{
		// new filee create panraku
		/*try {
			File file=new File("Tech.txt");
			
			if(file.createNewFile())
		{
			System.out.println("File created Successfully");
		}
		else
		{
			System.out.println("File alredy exists");
		 
		}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}*/
		try   ///created file la iruka characters paka
		{
			FileReader file=new FileReader("Tech.txt");
			int ch;
			while((ch=file.read())!=-1)
			{
				System.out.println((char)ch);
			}
			file.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
