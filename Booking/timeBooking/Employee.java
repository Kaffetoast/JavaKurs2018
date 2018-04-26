package timeBooking;

import java.util.ArrayList;

public class Employee extends BookingList {

	private String firstName;
	private String lastName;
	
	public Employee (String fName, String lName) {
		
		firstName = fName;
		lastName = lName;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
