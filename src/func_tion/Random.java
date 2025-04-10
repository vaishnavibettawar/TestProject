package func_tion;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double num = Math.random()*10;
		int val = (int)num;
		
		System.out.println("Enter the value to try your luck = "); 
		int magic = sc.nextInt();
		int count = 1;
		
		while(magic!=val) {
			System.out.println("Wrong Guess Try again !!");
			magic = sc.nextInt();
			count++;
		}
		
		System.err.println("Congratulations you have won 100000 rupees....");

	}

}
