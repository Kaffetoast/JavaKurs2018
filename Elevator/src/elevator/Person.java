package elevator;

import java.util.Random;


public class Person extends Thread {
	
	Elevator elevator = new Elevator();
	
	String name;
	int floor;
	private Random rand;
	private boolean goingUp;

	public Person() {};

	Person(String name, int floor) {
		this.name = name;
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
		
		
=======

		this.start();
	}
	
	public int random() {
		if (rand == null)
			rand = new Random();
		return rand.nextInt();
	}

	private boolean goingUp() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	@Override
	public void run() {

		while (true) {
			System.out.println(name);
			if (goingUp()) {
				
				
				
				
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

>>>>>>> d9467965099e62c0818e6f7ec3bc21cd9d0a217a
	}


