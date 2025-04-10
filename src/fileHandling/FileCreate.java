package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		File f1 = new File("C://IncubationBatch//Java Program/Demo.txt");
		if(f1.exists()) {
			System.out.println("File Already exits");
		}
		else {
			f1.createNewFile();
			System.out.println("File Created Successfully");
		}
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.getAbsolutePath());
	}

}
