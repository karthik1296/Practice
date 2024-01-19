package Assisted;

import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

public class ExceptionMethods
{

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
	
		//Create
		System.out.println("Creating a file");
		File fobj = new File("C:\\FilesData\\FilesOperations.txt");

		if (fobj.exists())
		{
			System.out.println("File is already existed");
		}
		else
		{
			fobj.createNewFile();
			System.out.println("File is created");
		}
		
		System.out.println("writing data in a file");
		System.out.println("Enter data into file : ");
		String str = sc.nextLine();
		str = str + '\n';
		
		FileWriter fw = new FileWriter("C:\\FilesData\\FilesOperations.txt");
		fw.write(str);
		System.out.println("Data has been Stored");
	    fw.close();
	    
	    //Read
	    FileInputStream fis = new FileInputStream("C:\\FilesData\\FilesOperations.txt");
		System.out.println("Read data from file :");
		int ch = fis.read();
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch = fis.read();
		}
		fis.close();
		
		//update
		System.out.println("updating a file");
		System.out.println("Update data in file :");
		String str1 = sc.nextLine();
		str = str + '\n';
		FileWriter fw1 = new FileWriter("C:\\FilesData\\FilesOperations.txt");
		fw1.write(str1);
		System.out.println("Data has been Stored");
	    fw1.close();
	    
		//Delete
	    System.out.println("Deleting a file");
		if (fobj.exists())
		{
			fobj.delete();
			System.out.println("File is deleted");
		}
		else
		{
			System.out.println("File Not Found");
		}
	}
 		
}
 








