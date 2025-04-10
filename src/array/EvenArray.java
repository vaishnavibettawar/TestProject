package array;

import java.util.Scanner;

public class EvenArray {

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
			if(arr[i]%2==0){
				System.out.print(arr[i] + " ");
			}
		}		
			
		int sum=0;
		for(int j=0; j<arr.length; j++) {
			sum = sum+arr[j];
		}
		System.out.println("The Sum of array is : " + sum);

	}
}
