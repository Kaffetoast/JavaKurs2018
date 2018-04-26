package timeBooking;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.*;


public class BookingDateTime {
	
	private LocalTime starttime;
	private LocalTime stoptime;
	private LocalDate date;
	private double price;
	
	public void setStartTime(LocalTime starttime) {
		this.starttime = starttime;
	}
	  
	public LocalTime getStartTime() {
		return this.starttime;
	}
	
	public void setStopTime(LocalTime stoptime) {
		this.stoptime = stoptime;
	}
	  
	public LocalTime getStopTime() {
		return this.stoptime;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	  
	public LocalDate getDate() {
		return this.date;
	}
	
	public double setPrice() {
		double minutes = 60;
		double hourPay = 15;
		double time = hourPay/minutes;
		
		price = time * ChronoUnit.MINUTES.between(starttime, stoptime);
		return this.price;
	}

}
