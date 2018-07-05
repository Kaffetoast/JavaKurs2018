package elevator;

import java.util.Random;

public class Person implements Runnable {


	String name;
	private int onThisFloor;
	private int toThatFloor;
	boolean inElevator = false;
	boolean startFloor = false;
	private boolean endFloor = false;
	public Elevator elevator;

	public int randomNumber(int min, int max) {


        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;

    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            if (!startFloor) {
                if (!isInElevator()  && !elevator.isElevatorDoorOpen()) {

                    elevator.pushButton(onThisFloor);
                    startFloor = true;
                }
            }

            if (onThisFloor == elevator.getCurrentFloor() && elevator.isElevatorDoorOpen()) {
                if (!endFloor) {
                	setInElevator(true);
                	setRandomEndFloor();
                    elevator.pushButton(toThatFloor);
                    endFloor = true;
                    System.out.println("[Elevator opens "  + name + ", steps in]" );
                    System.out.println("[ " +name + " wants to go to floor " + toThatFloor + " ]");
                }
            }

            if (isInElevator()  && !elevator.isElevatorDoorOpen() && elevator.currentFloor != toThatFloor) {
            }

            if (toThatFloor == elevator.getCurrentFloor() && elevator.isElevatorDoorOpen()) {

            	setInElevator(false);
                System.out.println("[Door open " + name + " gets out]");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                setOnThisFloor(toThatFloor);
                elevator.pushButton(onThisFloor);
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
