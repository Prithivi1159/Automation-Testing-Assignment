package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uibank {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Prithivi");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='title']"));
		Select dd1 = new Select(dropdown);
		dd1.selectByVisibleText("Mr");
		driver.findElement(By.id("middleName")).sendKeys("raj");
		driver.findElement(By.id("lastName")).sendKeys("Rajendhran");
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='sex']"));
		Select dd2 = new Select(dropdown1);
		dd2.selectByVisibleText("Male");
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='employmentStatus']"));
		Select dd3 = new Select(dropdown2);
		dd3.selectByVisibleText("Full-time");
		driver.findElement(By.id("age")).sendKeys("10/07/1999");
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='maritalStatus']"));
		Select dd4 = new Select(dropdown3);
		dd4.selectByVisibleText("Single");
		driver.findElement(By.id("username")).sendKeys("Prithivi59");
		driver.findElement(By.id("email")).sendKeys("r.prithiviraj1159@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Prithivi@14667");
		driver.findElement(By.xpath("//button[@class='btn btn-blue-outline form-button btn-xl']")).click();
		
		
		
	}

}
