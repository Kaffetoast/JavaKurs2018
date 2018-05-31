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

	}

}
