package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;

public class FileSwitchCase {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
	
		   int flag = 1;
		   while(flag!=0) {
			   System.out.println("1. Create File");
			   System.out.println("2. Read file");
			   System.out.println("3. Write file");
			   System.out.println("4. Delete File");
			   System.out.println("5. Exit");
			   
			   
			   System.out.println("Enter your choice : ");
			   int choice = sc.nextInt();
			      
			   switch(choice) {
			   case 1 :{
					System.out.println("Enter the name :");
					String fname = sc.next();
					
					File fl = new File("C://IncubationBatch//Java Program/"+fname+".txt");
				   
				   if(fl.exists()) {
					   System.out.println("File already exixts."); 
				   }
				   else {
					   fl.createNewFile();
						   System.out.println("File successfully Created.."); 
					   }
				   break;
			   }
			   case 2 :{
					System.out.println("Enter the name to Read the File: ");
					String fname=sc.next();
					FileReader fr=new FileReader("C://IncubationBatch//Java Program/"+fname+".txt");

					int i;
					
					while((i=fr.read())!=-1) {
						System.out.print((char)i);
					}
					System.out.println();
				   break;
			   }
			   case 3 :{
				   System.out.println("Enter the name to Write the File: ");
					String fname=sc.next();				
					FileWriter fw=new FileWriter("C://IncubationBatch//Java Program/"+fname+".txt", true);
					
					System.out.println("Enter the Content to write the file: ");
					sc.nextLine();
					String str=sc.nextLine();
					fw.write(str);
					fw.close();
					
					System.out.println("The wrote successfully.");
				   break;
			   }
			   case 4 :{
					System.out.println("Enter the name :");
					String fname = sc.next();
					
					File fl = new File("C://IncubationBatch//Java Program/"+fname+".txt");
					
				   if(fl.delete()) {
					   System.out.println("File Deleted"); 
				   }
				   else {
					   System.out.print("File doesn't exists"); 
				   }
				   break;
			   }
			   case 5 :{
				   flag = 0;
				   continue;
			   }
			   default :{
				   System.out.println("Invalid Input.");
				   break;
			   }
			   }
			   System.out.println("Do you want to continue yes or no..");
			   String str = sc.next();
			   if(str.equals("yes")) {
				   
			   }
			   else {
				   flag=0;
			   }
		   }
		   System.out.println("Application has been closed !!");
	 }
		   
	}


