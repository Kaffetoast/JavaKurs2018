package timeBooking;

import java.time.LocalDate;
import java.time.LocalTime;

public class BookingDateTime {
	
	private LocalTime starttime;
	private LocalTime stoptime;
	private LocalDate date;
	
	public void setStartTime(LocalTime starttime) {
		this.starttime = starttime;
	}
	  
	public LocalTime getStartTime() {
		return this.starttime;
	}
	
	public void setStoptTime(LocalTime stoptime) {
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
	

}
