package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("C://IncubationBatch//Java Program/test.text");
		fw.write("Hellooooooooooooo..............");
		fw.close();
		
		System.out.println("we wrote successfully");
	}

}
