package func_tion;

public class Maths2 {
	
	public int count(int n) {
		int res = 0;
		
		while(n!=0) {
			n=n/10;
			res++;
			
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths2 m2 = new Maths2();
		System.out.println(m2.count(125));

	}

}
