package loops;

public class Daimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++) {
			   for(int j=i; j<=5; j++) {
				   System.out.print(" ");   
			   }
			   for(int k=1;k<=i; k++) {
				   System.out.print("*");
			   }
			   for(int k=2;k<=i; k++) {
				   System.out.print("*");
			   }
			   
			   System.out.println();
		   }
		
		//second half
		
		for (int i=4;i>=1;i--) {
			   for(int j=5; j>=i; j--) {
				   System.out.print(" ");   
			   }
			   for(int k=i;k>=1; k--) {
				   System.out.print("*");
			   }
			   for(int k=i;k>=2; k--) {
				   System.out.print("*");
			   }
			   
			   System.out.println();
		   }

	}

}
