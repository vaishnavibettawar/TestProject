package func_tion;

public class WithReturn {
	
	public int addtion(int a, int b) {
		int sum = a+b;
		return sum;
	}	
	public String name() {
			
			return "Hello World";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WithReturn obj = new WithReturn();
		int result = obj.addtion(4, 6);
		System.out.println("The addition is =" + result);
	}

}
