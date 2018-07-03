package elevator;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Elevator extends Thread {
	


	int bFloor = 1;
	int tFloor = 5;
	int floor;
	private ArrayList<Integer> floorList = new ArrayList<>();
	private Random rand;
	private boolean inElevator;
	private boolean outElevator;

	Elevator() {
		
		this.start();
		//floorList.stream().map(object -> object.toString());
	}

	public int Randomm(int min, int max) {
		
		if (rand == null) {

			Integer randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
			return randomNum;
		}
		return max;
		
		
	}

	public boolean inElevator() {
		return inElevator;
	}

	public boolean outElevator() {
		return outElevator;
	}

	public void up () {
		if (floor < tFloor) {
			floor++;
		}
	}

	public void down() {
		if(floor > bFloor) {
			floor--;
		}
	}
	
	
	
	@Override
	public void run() {
		
		
		
		
	}


}
