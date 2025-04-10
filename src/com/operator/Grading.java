package com.operator;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the Marks of 1st subject = ");
		   int m1 = sc.nextInt();
		   System.out.println("Enter the Marks of 2st subject = ");
		   int m2 = sc.nextInt();
		   System.out.println("Enter the Marks of 3st subject = ");
		   int m3 = sc.nextInt();
		   System.out.println("Enter the Marks of 4st subject = ");
		   int m4 = sc.nextInt();
		   System.out.println("Enter the Marks of 5st subject = ");
		   int m5 = sc.nextInt();
		   
		   int sum = m1+m2+m3+m4+m5;
		   System.out.println("Sum = " + sum);
		   double avg = sum/5;
		   System.out.println("Average = " + avg);
		   
		   if(avg>=90 && avg<100) {
			   System.out.println("Merit");
		   }
		   else if (avg>=75 && avg<90) {
			   System.out.println("Distinction");
		   }
		   else if (avg>=60 && avg<75) {
			   System.out.println("First Class");
		   }
		   else if (avg>=50 && avg<60) {
			   System.out.println("Second Class");
		   }
		   else if (avg>=35 && avg<50) {
			   System.out.println("Third Class");
		   }
		   else {
			   System.out.println("Fail");
		   }
		   

	}

}
