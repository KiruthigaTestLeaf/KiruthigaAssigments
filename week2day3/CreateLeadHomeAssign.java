package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadHomeAssign {

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
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kiruthiga");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SoundarRajan");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Manager");
		
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.close();

	}

}
