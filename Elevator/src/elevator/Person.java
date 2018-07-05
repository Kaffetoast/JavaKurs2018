package elevator;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class Person implements Runnable {


	String name;
	public int onThisFloor;
	public int toThatFloor;
	boolean inElevator = false;
	boolean startFloor = false;
	private boolean endFloor = false;
	Elevator elevator;

	public int randomNumber(int min, int max) {


        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;

    }


	@Override
	public void run() {

		while (true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (!startFloor) {
				if (!isInElevator() && !elevator.isElevatorDoorOpen()) {
					elevator.addButton(onThisFloor);
					startFloor = true;

				}
			}

			if (onThisFloor == elevator.getCurrentFloor() && elevator.isElevatorDoorOpen()) {
				if (!endFloor) {
					setInElevator(true);
					setRandomEndFloor();
						elevator.addButton(toThatFloor);
						endFloor = true;
						System.out.println(name + "Gets in");
				}
			}
			
			if(isInElevator() && !elevator.isElevatorDoorOpen() && elevator.currentFloor != toThatFloor); {
				
			}
			
			if(toThatFloor == elevator.getCurrentFloor() && elevator.isElevatorDoorOpen());  {
				
				setInElevator(false);
				System.out.println("Elevator opens and" + name + "Gets out");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

				setOnThisFloor(toThatFloor);
                elevator.addButton(onThisFloor);
                endFloor = false;
			}
		}
	}
	
	Person(String name, Elevator elevator) {
		super();
		this.name = name;
		this.elevator = elevator;
		this.onThisFloor = randomNumber(elevator.getBottomFloor(), elevator.getTopFloor());

	}

	public int getOnThisFloor() {
		return onThisFloor;
	}

	public void setOnThisFloor(int onThisFloor) {
		this.onThisFloor = onThisFloor;
	}

	public int getToThatFloor() {
		return toThatFloor;
	}

	public void setToThatFloor(int toThatFloor) {
		this.toThatFloor = toThatFloor;
	}

	public boolean isInElevator() {
		return inElevator;
	}

	public void setInElevator(boolean inElevator) {
		this.inElevator = inElevator;
	}

	public boolean isStartFloor() {
		return startFloor;
	}

	public void setStartFloor(boolean startFloor) {
		this.startFloor = startFloor;
	}

	public boolean isEndFloor() {
		return endFloor;
	}

	public void setEndFloor(boolean endFloor) {
		this.endFloor = endFloor;
	}

	public void setRandomStartFloor() {
		this.setOnThisFloor(randomNumber(elevator.getBottomFloor(), elevator.getTopFloor()));
	}

	public void setRandomEndFloor() {
		this.setToThatFloor(randomNumber(elevator.getBottomFloor(), elevator.getTopFloor()));
	}

}
