package week3day2.singlelevelinhert;

public class LoginPage extends TestData{
		
	public void performCommonTasks() {
		System.out.println("Inside Login Page Common Tasks method");
	}

	public static void main(String[] args) {
		
		LoginPage login = new LoginPage();
		login.enterCredentials("kirusound", "TestLeaf@123");
		login.navigateToHomePage();
		login.performCommonTasks();
	}

}
