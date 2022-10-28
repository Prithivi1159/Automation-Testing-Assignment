package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prithivi");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rajendhran");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("testing");
	    driver.findElement(By.name("departmentName")).sendKeys("Chemical Engineering");
	    driver.findElement(By.name("description")).sendKeys("Expected things will happen at unexpected time");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("r.prithiviraj1159@gmail.com");
	    driver.findElement(By.className("smallSubmit")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.name("description")).clear();
	    driver.findElement(By.name("importantNote")).sendKeys("surprice");
	    driver.findElement(By.name("submitButton")).click();
	     String title=driver.getTitle();
	     
	     System.out.println(title);
	}

}