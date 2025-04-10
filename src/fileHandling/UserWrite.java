package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserWrite {

	public static void main(String[] args) throws IOException  {

		Scanner sc = new Scanner(System.in);
		
		
	FileWriter fw = new FileWriter("Enter the Content to write");
	String str = sc.nextLine();
	fw.write(str);
	fw.close();
	System.out.println("You wrote Succesfully");
	
	}

}
