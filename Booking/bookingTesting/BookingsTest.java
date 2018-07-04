package bookingTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


import timeBooking.Bookings;

class BookingsTest {

	Bookings bookingsTest = new Bookings();

	String date;
	String time1;
	String time2;
	
	
	@Test
	public void noBookingOverlap() {

	
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		date = "2018-04-10";
		LocalDate bookingDate = LocalDate.parse(date, dateFormat);
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");
		time1 = "10:00";
		LocalTime timeStart = LocalTime.parse(time1, timeFormat);
		time2 = "11:00";
		LocalTime timeStop = LocalTime.parse(time2, timeFormat);
		
		Assert.assertEquals(true, bookingsTest.addBooking(timeStart, timeStop , bookingDate));
		
		time1 = "09:00";
		LocalTime timeStart2 = LocalTime.parse(time1, timeFormat);
		time2 = "11:00";
		LocalTime timeStop2 = LocalTime.parse(time2, timeFormat); 
		Assert.assertEquals(false, bookingsTest.addBooking(timeStart2, timeStop2 , bookingDate));
		
	}
	
	



}
