package example;
import org.openqa.selenium.WebDriver;       
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.testng.Assert;       
import org.testng.annotations.Test; 
import org.testng.annotations.BeforeTest;   
import org.testng.annotations.AfterTest;    
 
public class JMeterSeleniumDemoTest {
 
   @Test
   public void openBlazeMeterTest() {
	   String driverPath = "C:\\geckodriver.exe";
	   System.setProperty("webdriver.firefox.marionette", driverPath);
       FirefoxDriver driver = new FirefoxDriver();
       driver.get("http://blazemeter.com");
       WebElement title = driver.findElement(By.xpath("//title"));
       System.out.println("********************************************************");
       System.out.println("*" + title.getAttribute("text") + "*");
       System.out.println("********************************************************");
       driver.quit();
   }
}

