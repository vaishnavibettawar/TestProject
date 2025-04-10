package multiThreading;

public class ThreadJoin extends Thread{
	
	 static Thread main;
	
	public void run() {
		try {
			main.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		main=Thread.currentThread();

		ThreadJoin th=new ThreadJoin();
		th.start();
		
		th.join();
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}