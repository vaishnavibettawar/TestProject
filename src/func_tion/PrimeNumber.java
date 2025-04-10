package func_tion;

import java.util.Scanner;

public class PrimeNumber {
	
	public void primeOrNot(int n) {
		
		for (int i =2; i<=n;i++) {
			if(n%i==0) {
				System.out.println("The Number is Not a prime");
			}
			else {
				System.out.println("The Number is prime");
			}
		}
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber p = new PrimeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Prime or not: ");
		int num = sc.nextInt();
		p.primeOrNot(num);
	}

}
