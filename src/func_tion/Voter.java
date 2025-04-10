package func_tion;

import java.util.Scanner;

public class Voter {
	public void checkVoter(int age) {
		 if(age>=18) {
			   System.out.println("Voter is Eligible for Voting.");
		   }
		   else {
			   System.out.println("The Voter is not Eligible for Voting.");
		   }
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the Age of Voter = ");
		   int age = sc.nextInt();
		   
		   Voter voter = new Voter();
		   voter.checkVoter(age);

	}

}
