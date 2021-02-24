package filehandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String args[]) throws IOException
	{
		System.out.println(System.getProperty("user.dir"));
		
		//Step 1 : File path
		String filepath=System.getProperty("user.dir")+"\\src\\filehandler\\TestData.properties";
		System.out.println(filepath);
		//Step 2 : Create FileInputStream object
		FileInputStream file= new FileInputStream(filepath);
		//Step 3 : Create Properties class object
		Properties p=new Properties();
		//Step 4 : call load function
		p.load(file);
		//Step 5 : Call the required value
		System.out.println(p.getProperty("name"));
		System.out.println(p.keySet());
	}
} 
