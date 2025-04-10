package loops;

import java.util.Scanner;

public class DescIntTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number to print the pattern : ");
		   int rows = sc.nextInt();

	        for (int i = rows; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }

		   
	}

}
