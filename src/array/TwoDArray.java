package array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int n = sc.nextInt();
		
		int arr[][]= new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0;j<n;j++) {
				System.out.print("arr[" +i+"][" +j+ "] = ");
				arr[i][j] = sc.nextInt();
			}
		}
		//print Array 
		

		for(int i=0; i<n; i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			for(int j=0;j<n;j++) {
				sum=sum+arr[i][j];
			}
				System.out.print(sum);
			}
	}

}
