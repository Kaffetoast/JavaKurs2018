package timeBooking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;


public class Program {

	public static void main(String[] args) throws ParseException, IOException {

		boolean bookingGet;
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		List<Employee> Employees = new ArrayList<Employee>();
		
		Employees.add(new Employee("Emil"));
		Employees.add(new Employee("Simon"));
		Employees.add(new Employee("Ronnie"));
		
		while (true) {

			System.out.print("1. Book Time  " + "\n");
			System.out.print("2. List Bookings " + "\n");

			String choice = input.readLine();

			if (choice.equals("1")) {
				
				LocalDate bookingDate = null;
				LocalTime bookingStart = null;
				LocalTime bookingStop = null;


				while (bookingDate == null || bookingStart == null || bookingStop == null) {

					try {
						DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
						DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");

						if (bookingDate == null) {

							System.out.print(" Date (YYYY-MM-DD): ");
							String date = input.readLine();
							bookingDate = LocalDate.parse(date, dateFormat);
						}

						if (bookingStart == null) {

							System.out.println();
							System.out.print(" Start time: (HH : MM): ");
							String time = input.readLine();
							bookingStart = LocalTime.parse(time, timeFormat);
						}

						System.out.println();
						System.out.print(" End time: (HH : MM): ");
						String time2 = input.readLine();
						bookingStop = LocalTime.parse(time2, timeFormat);
						
						
						boolean employeeChosen = false;
						
						while (!employeeChosen) {
							
							System.out.println("Employees; ");
							
							for (int i = 0; i < Employees.size(); i++) {
								System.out.println(Employees.get(i).name);
							}
							
							String emp = input.readLine().trim().toLowerCase();

							for (int i = 0; i < Employees.size(); i++) {
								Employee chosenEmployee = Employees.get(i);

								if (chosenEmployee.name.trim().toLowerCase().equals(emp)) {
							
									bookingGet = chosenEmployee.bookings.addBooking(bookingStart, bookingStop, bookingDate);
									if (bookingGet == false) {
										
										System.out.print(" That time is currently unavailable" + "\n" + "\n");
									}
									employeeChosen = true;
									break;
								}
							}
						}

						

					} catch (DateTimeParseException exc) {
						System.out.println("Input was wrong");
					}

				}

			}

			else if (choice.equals("2")) {
				for (Employee employee : Employees) {
					employee.printBookingList();
				}
				

			}

			else {

				System.out.print("Invalid choice" + "\n");
			}

		}
	}

}
