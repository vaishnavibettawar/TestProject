package func_tion;

public class Maths1 {
	
	public int pow(int a, int b) {
		int result = 1;
		for (int i=1; i<=b; i++) {
			result *= a;
		}
		return result;
	}	
	
	public static void main(String[] args) {
		
		Maths1 obj = new Maths1();
		System.out.println(obj.pow(2,3));
	}
	

}
