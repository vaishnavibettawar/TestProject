package com.operator;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the Age of Voter = ");
		   int age = sc.nextInt();
		   
		   if(age>=18) {
			   System.out.println("Voter is Eligible for Voting.");
		   }
		   else {
			   System.out.println("The Voter is not Eligible for Voting.");
		   }

	}

}
