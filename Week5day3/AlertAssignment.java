package week5.day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		simpleAlert.accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmAlert.dismiss();
		WebElement value= driver.findElement(By.id("result"));
		String text = value.getText();
		if(value.equals(text)) {
			System.out.println("ConformAlert");}
		else {System.out.println("Not conform Alert ");}
		
		}
		
				
		
		
		
		
		
	}

