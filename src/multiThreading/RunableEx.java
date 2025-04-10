package multiThreading;

public class RunableEx implements Runnable{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunableEx rn=new RunableEx();
		
		Thread th=new Thread(rn);
		th.start();
	}

}