package week5.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	public static void main(String[] args) throws Exception {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/frame.xhtml");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	//driver.findElement(By.id("Click")).click();
	WebElement name = driver.findElement(By.id("Click"));	
	name.click();
	Thread.sleep(3000);
	String value = name.getText();
	System.out.println(value);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	WebElement name1 = driver.findElement(By.id("Click"));
	name1.click();
	String value1 = name1.getText();
	System.out.println(value1);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.xhtml']")));
	driver.switchTo().frame("frame2");
	WebElement name2 = driver.findElement(By.id("Click"));
	name2.click();
	String value2 = name2.getText();
	System.out.println(value2);
	driver.switchTo().defaultContent();
	
	
	
	
	
	}
}
