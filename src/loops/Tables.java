package loops;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number to print the table : ");
		   int num = sc.nextInt();
		   
		for(int i = 1; i<=10;i++) {
			int res = num*i;
			System.out.println(num + " x " + i + " = " + res );
			
		}

	}

}
