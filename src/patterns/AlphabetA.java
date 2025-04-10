package patterns;

public class AlphabetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int height = 7; // Height of the letter A

		        for (int i = 0; i < height; i++) {
		            for (int j = 0; j < (height * 2 - 1); j++) {
		                // Print stars in the shape of 'A'
		                if (j == height - i - 1 || j == height + i - 1) {
		                    System.out.print("*");
		                } else if (i == height / 2 && j > height - i - 1 && j < height + i - 1) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    }
		
	}


