package func_tion;

import java.util.Scanner;

public class ArmStrong {
	
	public int pow(int a, int b) {
		int result = 1;
		for (int i=1; i<=b; i++) {
			result *= a;
		}
		return result;
	}	
	
	public int count(int n) {
		int res = 0;
		
		while(n!=0) {
			n=n/10;
			res++;
			
		}
		return res;
		
	}
	
	public void armstrong(int n) {
		
		int temp = n;
		int rem = 0;
		int res = 0;
		
		while(temp!=0) {
			rem = temp%10;
			res = res+pow(rem,count(n));
			temp = temp/10;
		}
		
		if(res==n) {
			System.out.println("Given number is Armstrong");
		}
		else {
			System.out.println("Given number is Not Armstrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmStrong a = new ArmStrong();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Armstrong or not: ");
		int num = sc.nextInt();
		a.armstrong(num);
		
	}

}
