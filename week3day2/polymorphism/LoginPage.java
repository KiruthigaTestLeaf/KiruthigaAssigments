package week3day2.polymorphism;

public class LoginPage extends BasePage {   
	
	@Override
	public void performCommonTasks() {
		System.out.println("Allow me to access login page");
	}

	public static void main(String[] args) {
		
		LoginPage page = new LoginPage();
		page.findElement();
		page.enterText();
		page.performCommonTasks();
	}

}
