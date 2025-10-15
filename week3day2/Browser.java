package week3day2;

public class Browser {

	public void openURL() {
		
	System.out.println("Open URL");	

	}
	public void closeURL() {
	
	System.out.println("Close URL");
	}
	
	public void navigateBack() {
	
		System.out.println("Navigate Back");

	}
	
	public static void main(String[] args) {
		Browser name = new Browser();
		name.openURL();
		name.closeURL();
		name.navigateBack();
		
		
	}

}
