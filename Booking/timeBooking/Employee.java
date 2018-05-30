package timeBooking;

public class Employee extends BookingList {


	public String name;
	
	public Employee (String name) {
		
		this.name = name;
		
		
	}
	
		
		
		public void printBookingList() {

			System.out.println(name.toString());


	    	for (BookingDateTime bookingDateTime : bookingList) {

	    		System.out.println(bookingDateTime.toString());

	    	}
	}
	
}
