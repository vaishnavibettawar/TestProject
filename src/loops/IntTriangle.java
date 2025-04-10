package loops;

import java.util.Scanner;

public class IntTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int val = 10;
		   for (int i=1;i<=4;i++) {
			   for(int j=i; j<=4; j++) {
				   System.out.print(val + "  ");   
				   val--;
			   }
			   System.out.println();
		   }
		   


	}

}
