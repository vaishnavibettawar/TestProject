package multiThreading;

public class TicketBooking {
	
	int totalTk=10;
	
	public void seatBooking(int seats) {
		
		if(totalTk>=seats) {
			System.out.println(seats+" tickets are booked successfully.");
			totalTk-=seats;
			System.out.println(totalTk+" ticket are Remaining");
		}
		else {
			System.out.println(seats+" tickets are not Available.");
			System.out.println(totalTk+" ticket are Remaining");
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TicketBooking obj=new TicketBooking();
		obj.seatBooking(4);
		obj.seatBooking(4);
		obj.seatBooking(4);
	}

}
