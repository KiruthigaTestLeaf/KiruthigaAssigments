package week2day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions note = new ChromeOptions();
		note.addArguments("guest");
		
		
		ChromeDriver driver = new ChromeDriver(note);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("//input[@id= 'username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value= 'Login']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
		
		
		driver.close();
	}

}
