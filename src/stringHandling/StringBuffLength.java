package stringHandling;

public class StringBuffLength extends Thread{
	
	StringBuilder sbf;
	
	public StringBuffLength(StringBuilder sbf) {
		super();
		this.sbf = sbf;
	}

	public void run() {
		for(int i=1; i<=1000; i++) {
			sbf.append("c");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		StringBuilder sbf=new StringBuilder();

		StringBuffLength th=new StringBuffLength(sbf);
		th.start();

		StringBuffLength th1=new StringBuffLength(sbf);
		th1.start();
		
		th.join();
		th1.join();
		
		System.out.println(sbf.length());
	}

}
