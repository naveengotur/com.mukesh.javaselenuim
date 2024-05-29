package exceptionHandlingDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling6 {

	// Using the try and Catch method
	
	public static void main(String[]args) 
	
	{
		
		System.out.println("Start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			Robot a = new Robot();
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
		System.out.println("END");
		
	}
}
