package loops;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   
		   int flag = 1;
		   while(flag!=0) {
			   System.out.println("1. Addition");
			   System.out.println("2. Substraction");
			   System.out.println("3. Multipilcation");
			   System.out.println("4. Division");
			   System.out.println("5. Exit");
			   
			   
			   System.out.println("Enter your choice : ");
			   int choice = sc.nextInt();
			   
			   System.out.println("Enter First Number : ");
			   int a = sc.nextInt();
			   
			   System.out.println("Enter second Number : ");
			   int b = sc.nextInt();
			  
			   
			   switch(choice) {
			   case 1 :{
				   System.out.println("Addition of A and B = " + (a+b));
				   break;
			   }
			   case 2 :{
				   System.out.println("Substraction of A and B = " + (a-b));
				   break;
			   }
			   case 3 :{
				   System.out.println("Multiplication of A and B = " + (a*b));
				   break;
			   }
			   case 4 :{
				   System.out.println("Division of A and B = " + (a/b));
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


