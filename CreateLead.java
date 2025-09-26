package Week2.HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CreateLead {

	public static void main(String[] args) {

 ChromeOptions opt=new ChromeOptions();
 opt.addArguments("guest");
 
 ChromeDriver driver=new ChromeDriver(opt);
 driver.get("http://leaftaps.com/opentaps/");
 driver.manage().window().maximize();
 
 //Enter user name, password and click login
 driver.findElement(By.id("username")).sendKeys("DemoCSR");
 driver.findElement(By.id("password")).sendKeys("crmsfa");
 driver.findElement(By.className("decorativeSubmit")).click();
 
 //Click CRM/SFA link
 driver.findElement(By.linkText("CRM/SFA")).click();
 driver.findElement(By.linkText("Leads")).click();
 driver.findElement(By.linkText("Create Lead")).click();
 
 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Company");
 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TFName");
 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TLName");
 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TTitle");
 
 driver.findElement(By.className("smallSubmit")).click();
 
 //Get Title name
 String titleName= driver.findElement(By.xpath("//span[@id='viewLead_generalProfTitle_sp']")).getText(); 
 System.out.println("Title name of a lead is: "+titleName);
 
 driver.close();
 

	}

}
