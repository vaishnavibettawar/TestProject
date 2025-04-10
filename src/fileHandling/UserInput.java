package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) throws IOException  {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to create file");
		String fname = sc.next();
		
	File fl = new File("C://IncubationBatch//javaProgram/"+fname+".txt");
	
	fl.createNewFile();
	System.out.println("File Created Succesfully");
	
	}

}
