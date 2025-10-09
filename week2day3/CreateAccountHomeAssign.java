package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CreateAccountHomeAssign {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions note = new ChromeOptions();
		note.addArguments("guest");
		
		
		ChromeDriver driver = new ChromeDriver(note);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement( By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Kiruthiga");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester Oct 2025");
		driver.findElement(By.id("numberEmployees")).sendKeys("18");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		//Thread.sleep(3000);
		
		String title=driver.getTitle();
		System.out.println("Title of the browser "+ title);
		
		driver.close();
		
		
		
	}

	
}
