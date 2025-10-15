package week3day2;

public class PolymorphismOverload {
	public void reportstep(String msg, String status) {
	
			System.out.println(msg + " "+status);
	}
	public void reportstep(String msg, String status, boolean snap) {
		
		System.out.println(msg + " "+status +" "+snap);
	}
	public static void main(String[] args) {
		
		PolymorphismOverload Overld = new PolymorphismOverload();
		Overld.reportstep("Hi..", "Loaded");
		Overld.reportstep("Hello", "Best", true);

	}

}
