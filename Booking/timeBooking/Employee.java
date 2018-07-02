package timeBooking;

public class Employee {


	public String name;
	
	public Bookings bookings;
	
	public Employee (String name) {
		
		bookings = new Bookings();
		this.name = name;
		
		
	}
	
		
		
	public void printBookingList() {
		for (BookingDateTime booking : bookings.bookingList) {

			System.out.println(" Date: " + booking.getDate().toString());
			System.out.println(" Start time: " + booking.getStartTime().toString());
			System.out.println(" End time: " + booking.getStopTime().toString());
			System.out.println(" Price: " + booking.setPrice());
			System.out.println(" Employee: "+ this.name);

		}

	}
	
}
