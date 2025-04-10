package multiThreading;

public class ThreadSleepEx extends Thread{
	
	public void run() {
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadSleepEx th=new ThreadSleepEx();
		th.start();	
		th.start();

		ThreadSleepEx th1=new ThreadSleepEx();
		th1.start();
	}

}