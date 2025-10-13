package week2day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookHomeAssign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		String url = "https://en-gb.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kirutest");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("leaf");
	
		
		WebElement dropdown1 = driver.findElement(By.id("day"));
		Select day = new Select(dropdown1);
		day.selectByVisibleText("10");
		
		WebElement dropdown2 = driver.findElement(By.id("month"));
		Select month = new Select(dropdown2);
		month.selectByVisibleText("Jan");
		
		WebElement dropdown3 = driver.findElement(By.id("year"));
		Select year = new Select(dropdown3);
		year.selectByVisibleText("2002");
		
		//radio button			
		driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9600092462");
		driver.findElement(By.id("password_step_input")).sendKeys("KiruSound@17");
		Thread.sleep(3000);
		
		driver.close();
	}

}
