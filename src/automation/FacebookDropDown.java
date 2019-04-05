package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
 
public class FacebookDropDown {
 
     public static void main(String[] args) throws Exception {
 
    	 System.setProperty("webdriver.firefox.marionette","D:\\JARS\\geckodriver-v0.24.0-win64.exe"); 
 		WebDriver driver=new FirefoxDriver();
 
          driver.manage().window().maximize();
 
          driver.get("http://www.facebook.com");
 
          Select x=new Select(driver.findElement(By.name("birthday_day")));
         
          x.selectByVisibleText("6");
          System.out.println("Value 6 is selected");
          Thread.sleep(5000);
          
          x.selectByValue("18");
          System.out.println("Value 18 is selected");
          Thread.sleep(5000);
          
          x.selectByIndex(1);
          System.out.println("Value 1 is selected");
          Thread.sleep(5000);
          
         boolean isMultiple = x.isMultiple();
          System.out.println("birthday_day_dropdown isMultiple -- "+isMultiple);
          
          Thread.sleep(5000);
         driver.close();
     }
}