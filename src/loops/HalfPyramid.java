package loops;

public class HalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i=1;i<=5;i++) {
			   for(int j=i; j<=5; j++) {
				   System.out.print(" ");   
			   }
			   for(int k=1;k<=i; k++) {
				   System.out.print("* ");
			   }
			   System.out.println();
		   }
		   

	}

}
