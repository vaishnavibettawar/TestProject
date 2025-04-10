package array;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the Elements of Array : ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("arr[" +i+ "] = ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The given Array is = ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		
		

	}

	}}
