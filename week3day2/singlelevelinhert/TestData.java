package week3day2.singlelevelinhert;

public class TestData {

	public void enterCredentials(String Username, String Password) {
		
		System.out.println("Enter the Username/emailid:" + Username);
		System.out.println("Enter the Password:" +Password);
		

	}
	
	public void navigateToHomePage() {
		
		System.out.println("Navigating to HomePage");
	}
	public static void main(String[] args) {
		
		TestData td = new TestData();
		td.enterCredentials("kirusound", "TestLeaf@123");

		td.navigateToHomePage();

	}

	

	

}
