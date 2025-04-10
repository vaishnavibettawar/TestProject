package func_tion;

import java.util.Scanner;

public class Maths {
	
	public void addition(int a , int b) {
		int sum = a+b;
		System.out.println("The addition of two nos. A and b =  " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m = new Maths();
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the value of A : ");
		int a = sc.nextInt();
		System.out.println("enter the value of B : ");
		int b = sc.nextInt();
		
				
		m.addition(a, b);

	}

}
