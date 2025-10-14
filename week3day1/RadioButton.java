package week3day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[9]"))
				.isDisplayed();
		System.out.println("Chrome browser button is displayed");
		
			
		WebElement selectChromwRadio = driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[12]"));
		selectChromwRadio.click();
		
			
		Boolean check = driver
				.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[9]"))
				.isSelected();
		if (check = true) {
			System.out.println("Chrome is selected:  " +check);
		}
		Thread.sleep(3000);
		

		
		WebElement selectEdgeRadio = driver.findElement(By.xpath("//label[text()='Edge']"));
		selectEdgeRadio.click();
		Boolean edgeBrowser=driver.findElement(By.xpath("//label[text()='Edge']")).isSelected();
		if(edgeBrowser = true) {
			System.out.println("Edge Browser is my favourite: " +edgeBrowser);
		}
				
		Boolean safariBrowser=driver.findElement(By.xpath("(//label[contains(text(), 'Safari')])[2]")).isSelected();
		if(safariBrowser = true) {
			System.out.println("Safari is selected as default radio button: " +safariBrowser);
		}
		
		Boolean defaultAge=driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		if(defaultAge = true) {
			System.out.println("Default age is selected as 21-40: " +defaultAge);
		}
		
		
		Thread.sleep(4000);
		driver.close();
	}

}
