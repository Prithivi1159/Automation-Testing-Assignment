package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tamilmatrimony {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//select[@class='paddl5 txtopac']"))
		WebElement dropdown = driver.findElement(By.id("REGISTERED_BY"));
		Select dd1 = new Select(dropdown);
		dd1.selectByVisibleText("Brother");
		driver.findElement(By.id("NAME")).sendKeys("Prithivi");
		driver.findElement(By.id("gendermale")).click();
		WebElement dropdown1 = driver.findElement(By.id("DOBDAY"));
		Select dd = new Select(dropdown1);
		dd.selectByVisibleText("13");
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='DOBMONTH']"));
		Select dd2 = new Select(dropdown2);
		dd2.selectByIndex(7);
		WebElement dropdown3 = driver.findElement(By.id("DOBYEAR"));
		Select dd3 = new Select(dropdown3);
		dd3.selectByVisibleText("2000");
		WebElement dropdown4 = driver.findElement(By.id("RELIGION"));
		Select dd4 = new Select(dropdown4);
		dd4.selectByIndex(1);
		WebElement dropdown7 = driver.findElement(By.xpath("//select[@name='MOTHERTONGUE']"));
		Select dd7 = new Select(dropdown7);
		dd7.selectByVisibleText("Tamil");
		
		WebElement dropdown5 = driver.findElement(By.id("CASTE_NORMAL"));
		Select dd5 = new Select(dropdown5);
		dd5.selectByVisibleText( "Caste no bar ");
		WebElement dropdown6 = driver.findElement(By.id("COUNTRY"));
		Select dd6 = new Select(dropdown6);
		dd6.selectByVisibleText("India");
		driver.findElement(By.id("MOBILENO")).sendKeys("9597955649");
		driver.findElement(By.id("EMAIL")).sendKeys("r.prithiviraj1159@gmail.com");
		driver.findElement(By.xpath("//input[@NAME='PASSWD1']")).sendKeys("Prithivi59");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		
		
		
		
		
		
	}
}
