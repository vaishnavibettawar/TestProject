package multiThreading;

public class TicketApp extends Thread{
	
	static TicketBooking obj;
	
	public void run() {
		obj.seatBooking(4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 obj=new TicketBooking();
		
		TicketApp th=new TicketApp();
		th.start();

		TicketApp th1=new TicketApp();
		th1.start();		

		TicketApp th2=new TicketApp();
		th2.start();
		
	}

}