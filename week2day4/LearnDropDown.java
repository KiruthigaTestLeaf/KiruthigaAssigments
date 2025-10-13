package week2day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

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
		
		//select employee from dropdown Source using Index Method
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourcedd = new Select(source);
		sourcedd.selectByIndex(4);
		System.out.println("Employee selected successfully");
		
		
		//select automobile from dropdown Marketing Campaign using Visible by Index
		WebElement marktcamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marktcampdd = new Select(marktcamp);
		marktcampdd.selectByVisibleText("Automobile");
		System.out.println("Automobile selected successfully under Marketing Campaign Option");
		
		//select Corporation from dropdown Ownership using Visible by Index
				WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select ownershipdd = new Select(ownership);
				ownershipdd.selectByValue("OWN_CCORP");
				System.out.println("Corporation selected successfully under Ownership Option");
		
		
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
