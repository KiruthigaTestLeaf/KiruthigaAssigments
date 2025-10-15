package week3day2;


public class LearnInheritance {

	public void horn() {
		System.out.println("Horn");
	}

	public void steering() {
		System.out.println("Steering");

	}
	public void clutch() {
		System.out.println("Clutch");
	}
	
	public static void main(String[] args) {
		// Create a obj for this class to access the methods we have declared
		
		LearnInheritance auto = new LearnInheritance();
		auto.horn();
		auto.steering();
		auto.clutch();
		

	}

}
