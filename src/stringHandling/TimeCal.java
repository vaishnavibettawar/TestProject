package stringHandling;

public class TimeCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start, end ;
		
		start = System.currentTimeMillis();
		start=System.nanoTime();
		String str = "Welcome to";
		
		for(int i=1;i<=1000;i++) {
			str+=" World !!";
			
		}
		end=System.nanoTime();
		
		System.out.println("String Takes " + (end-start) + " mili sec.") ;
	}

}
