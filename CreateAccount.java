package Week2.HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
      ChromeOptions opt=new ChromeOptions();
      opt.addArguments("guest");
      ChromeDriver driver=new ChromeDriver(opt);
      driver.get("http://leaftaps.com/opentaps/. ");;
      driver.manage().window().maximize();
      
      //Enter user name, password and click login
      driver.findElement(By.id("username")).sendKeys("DemoCSR");
      driver.findElement(By.id("password")).sendKeys("crmsfa");
      driver.findElement(By.className("decorativeSubmit")).click();
      
      //Click CRM/SFA link
      driver.findElement(By.linkText("CRM/SFA")).click();
      
      //Click Accounts section and create account 
      driver.findElement(By.linkText("Accounts")).click();
      driver.findElement(By.linkText("Create Account")).click();
      
      //Enter account name and description
      driver.findElement(By.id("accountName")).sendKeys("TestAccountNameAssi");
      driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
      
      WebElement industryDropDown=driver.findElement(By.name("industryEnumId"));
      Select select=new Select(industryDropDown);
      select.selectByVisibleText("Computer Software");
      
      WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
      Select select2=new Select(ownership);
      select2.selectByVisibleText("S-Corporation");
      
      WebElement source=driver.findElement(By.id("dataSourceId"));
      Select select3=new Select(source);
      select3.selectByValue("LEAD_EMPLOYEE");
      
      //marketingCampaignId
      WebElement marketingCampaing=driver.findElement(By.id("marketingCampaignId"));
      Select select4=new Select(marketingCampaing);
      select4.selectByIndex(6);
      
      //generalStateProvinceGeoId
      WebElement stateProvice=driver.findElement(By.id("generalStateProvinceGeoId"));
      Select select5=new Select(stateProvice);
      select5.selectByValue("TX");
      
      driver.findElement(By.className("smallSubmit")).click();
      
      WebElement accountNameLocator=driver.findElement(By.xpath("//span[text()='Account Name']//following::span"));
      String accountName=accountNameLocator.getText();
      
      System.out.println(accountName);
      //driver.close();
      
      
      


	}

}
