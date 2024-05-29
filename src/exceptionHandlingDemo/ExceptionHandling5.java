package exceptionHandlingDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling5 {

	// Using throws only one Exception
	
	public static void main(String[]args) throws Exception
	
	{
		
		System.out.println("Start");
		Thread.sleep(5000);
		System.out.println("END");
		
		
		FileInputStream fis = new FileInputStream("");
		
		Robot a = new Robot();
		
	}
}
