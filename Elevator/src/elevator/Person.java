package elevator;

public class Person implements Runnable {

	int floor;
	int person;
	int numThreads;
	
	public Person() {};
	
	public Person(int person, int floor) {
		this.person = person;
		this.floor = floor;
		Program.visit_floors.add(floor);
	}
	
	@Override
	public void run() {
		
		 System.out.println("Person "+passenger+" enters the elevator to go to floor "+floor);

         try
         {

         //Adds permit to elevator
         //wait for key
         Elevator.signalElevator();
         sem.acquire();

         //Give access to the next 7 threads into elevator

         }
         catch(InterruptedException e)
         {
             e.printStackTrace();
         }
     }
     public static int passengerSem()
     {
         return 6;
     }
		
		
	}


