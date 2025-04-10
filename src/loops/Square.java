package loops;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number to print the pattern : ");
		   int num = sc.nextInt();
		   for (int i=1;i<=num;i++) {
			   for(int j=1; j<=num; j++) {
				   System.out.print(" * ");   
			   }
			   System.out.println();
		   }
		   

	}

}
