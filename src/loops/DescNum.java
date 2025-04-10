package loops;

public class DescNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 10;
		for (int i=1;i<=10;i++) {
			System.out.print(val + " ");
			if(val==7 || val==4  || val==2) {
				System.out.println();
			}
			val--;
		}

	}

}
