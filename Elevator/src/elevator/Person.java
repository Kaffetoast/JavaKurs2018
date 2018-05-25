package elevator;

public class Person implements Runnable {

	int floor;
	int person;
	int numThreads;
	
	public Person() {};
	
	public Person(int person, int floor) {
		this.person = person;
		this.floor = floor;
	}
	
	
	
	@Override
	public void run() {
		
		
	}

}
