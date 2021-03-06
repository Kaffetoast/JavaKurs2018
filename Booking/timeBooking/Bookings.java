package timeBooking;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Bookings {

	public ArrayList<BookingDateTime> bookingList = new ArrayList<BookingDateTime>();

	public boolean checkBookingTime(BookingDateTime newBook) {

		if (newBook.getStartTime().compareTo(newBook.getStopTime()) > 0) {
			return false;
		} else {
			for (int i = 0; i < bookingList.size(); i++) {

				boolean a = newBook.getStartTime().equals(bookingList.get(i).getStartTime());

				boolean b = newBook.getStartTime().isAfter(bookingList.get(i).getStartTime())
						&& newBook.getStartTime().isBefore(bookingList.get(i).getStopTime());

				boolean c = newBook.getStopTime().isAfter(bookingList.get(i).getStartTime())
						&& newBook.getStopTime().isBefore(bookingList.get(i).getStopTime());

				boolean d = newBook.getStartTime().isBefore(bookingList.get(i).getStartTime())
						&& newBook.getStopTime().isAfter(bookingList.get(i).getStartTime());
				

				if (a || b || c || d) {

					return false;
				}
			}
		}
		return true;
	}

	public boolean addBooking(LocalTime starttime, LocalTime stoptime, LocalDate date) {

		BookingDateTime booking = new BookingDateTime();

		booking.setStartTime(starttime);
		booking.setStopTime(stoptime);
		booking.setDate(date);
		booking.setPrice();

		
		
		
		Boolean bookingCheck = checkBookingTime(booking);

		if (bookingCheck == true) {
			bookingList.add(booking);
			return true;
		} else {
			return false;
		}

	}



}
