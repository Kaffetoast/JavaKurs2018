package timeBooking;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class BookingList {

	protected ArrayList<BookingDateTime> bookingList = new ArrayList<BookingDateTime>();

	public boolean checkBookingTime(BookingDateTime newBook) {

		if (newBook.getStartTime().compareTo(newBook.getStopTime()) > 0) {
			return false;
		} else {
			for (int i = 0; i < bookingList.size(); i++) {

				boolean a = newBook.getStartTime().equals(bookingList.get(i).getStartTime())
						&& newBook.getStopTime().equals(bookingList.get(i).getStopTime());

				boolean b = newBook.getStartTime().isAfter(bookingList.get(i).getStartTime())
						&& newBook.getStartTime().isBefore(bookingList.get(i).getStopTime());

				boolean c = newBook.getStopTime().isAfter(bookingList.get(i).getStartTime())
						&& newBook.getStopTime().isBefore(bookingList.get(i).getStopTime());

				boolean d = newBook.getStartTime().isBefore(bookingList.get(i).getStartTime())
						&& newBook.getStopTime().isAfter(bookingList.get(i).getStopTime());
				

				if (a || b || c || d) {

					return false;
				}
			}
		}
		return true;
	}

	public boolean addBooking(LocalTime starttime, LocalTime stoptime, LocalDate date, double price, Employee employee) {

		BookingDateTime booking = new BookingDateTime();

		booking.setStartTime(starttime);
		booking.setStopTime(stoptime);
		booking.setDate(date);
		booking.setPrice();
		booking.setEmployee(employee);
		
		
		
		Boolean bookingCheck = checkBookingTime(booking);

		if (bookingCheck == true) {
			bookingList.add(booking);
			return true;
		} else {
			return false;
		}

	}

	public void printBookingList() {
		for (BookingDateTime booking : bookingList) {

			System.out.println(" Date: " + booking.getDate().toString());
			System.out.println(" Start time: " + booking.getStartTime().toString());
			System.out.println(" End time: " + booking.getStopTime().toString());
			System.out.println(" Price: " + booking.setPrice());
			System.out.println(" Employee: "+ booking.getEmployee().name);

		}

	}

}
