package elevator;

public class Program {

	public static void main(String[] args) {
		
		
		Elevator elevator = new Elevator(1,20);
		System.out.println("Elevator started");

	
		

		Person p1 = new Person("Emil", elevator);
		Person p2 = new Person("Simon", elevator);
		Person p3 = new Person("Ronnie", elevator);
		
		Thread person1 = new Thread(p1);
		person1.start();
		Thread person2 = new Thread(p2);
		person2.start();
		Thread person3 = new Thread(p3);
		person3.start();
		
		Thread elevatorThread = new Thread(elevator);
		elevatorThread.start();
		
	}

}
