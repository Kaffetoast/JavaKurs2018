package elevator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Elevator implements Runnable {

	Person person;

	public int bottomFloor;
	public int topFloor;
	boolean elevatorDoor = false;
	private boolean elevatorIsMoving = true;
	public int currentFloor = 1;
	public Set<Integer> buttonList = new HashSet<>();

	public Elevator() {
	}

	Elevator(int bottomFloor, int topFloor) {
		super();
		this.bottomFloor = bottomFloor;
		this.topFloor = topFloor;
	}

	public synchronized int getBottomFloor() {
		return bottomFloor;
	}

	public synchronized void setBottomFloor(int bottomFloor) {
		this.bottomFloor = bottomFloor;
	}

	public synchronized int getTopFloor() {
		return topFloor;
	}

	public synchronized void setTopFloor(int topFloor) {
		this.topFloor = topFloor;
	}

	public synchronized boolean isElevatorDoorOpen() {
		return elevatorDoor;
	}

	public synchronized void setElevatorDoor(boolean elevatorDoor) {
		this.elevatorDoor = elevatorDoor;
	}

	public synchronized boolean elevatorIsMoving() {
		return elevatorIsMoving;
	}

	public synchronized void setElevatorIsMoving(boolean elevatorIsMoving) {
		this.elevatorIsMoving = elevatorIsMoving;
	}

	public synchronized int getCurrentFloor() {
		return currentFloor;
	}

	public synchronized void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public synchronized Set<Integer> getButtonList() {
		return buttonList;
	}

	public synchronized void setButtonList(Set<Integer> buttonList) {
		this.buttonList = buttonList;
	}

	public synchronized void removeButton(int value) {
		this.buttonList.remove(value);
	}
	public synchronized void addButton(int value) {
		this.buttonList.add(value);
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(!buttonList.isEmpty()) {
				System.out.println("Elevator at :" + currentFloor);
				try {
					elevatorMoving();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public void up() {
		if (currentFloor <= topFloor) {
			currentFloor++;
		}
	}

	public void down() {
		if (currentFloor >= bottomFloor) {
			currentFloor--;
		}
	}

	public void elevatorMoving() throws InterruptedException {
		synchronized (buttonList) {
			for (int onThisFloor : buttonList) {
				if (currentFloor == onThisFloor) {
					this.setElevatorDoor(true);
					System.out.println("Opens at :" + currentFloor);

					Thread.sleep(4000);
					this.setElevatorDoor(false);
					removeButton((currentFloor));
					break;
				}
			}
		}

		if (elevatorIsMoving) {
			elevatorIsMoving = false;
		}
		for (int onThisFloor : buttonList) {
			if (currentFloor < onThisFloor) {
				elevatorIsMoving = true;
			}
		}
		
		if (!elevatorIsMoving) {
			elevatorIsMoving = true;
		}
		for (int onThisFloor : buttonList) {
			if (currentFloor > onThisFloor) {
				elevatorIsMoving = false;
			}
		}
		
		if(elevatorIsMoving) {
			up();
		} else {
			down();
		}
	}
	
}
