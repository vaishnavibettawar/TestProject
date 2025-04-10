package array;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();
		
		int arr[][]=new int[n][n];
		int brr[][]=new int[n][n];
		int crr[][]=new int[n][n];
		
		//Arr Input
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("arr["+i+"]["+j+"] = ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		//Brr Input
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("brr["+i+"]["+j+"] = ");
				brr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {//i=0,2   <3
			for(int j=0; j<n; j++) {//j=0   <3
				for(int k=0; k<n; k++) {//k=0,1,2,3  <3
					           crr[i][j]+=arr[i][k]*brr[k][j];
				//  crr[0][1]= crr[0][1] +(arr[0][2]*brr[2][1]);
				//  crr[0][1]=      36
				}
			}
		}
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}

	}

}