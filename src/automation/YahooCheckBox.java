package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
 
public class YahooCheckBox {
 
     public static void main(String[] args) throws Exception {
 
    	 System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
    		WebDriver driver = new ChromeDriver();
 			driver.get("https://semantic-ui.com/modules/checkbox.html");
          driver.manage().window().maximize();
        
 
          Thread.sleep(7000);
       // Selecting CheckBox	
      	
          WebElement option1 = driver.findElement(By.cssSelector("div.ui.checkbox"));	
          Thread.sleep(4000);

          //Checking if the  checkbox is displayed on the Webpage and printing its status
          boolean tcCheckIsDisplayed = option1.isDisplayed();

          System.out.println("Is  checkbox displayed: "+tcCheckIsDisplayed);
          
          //Checking if the  checkbox is enabled on the webpage and printing its status

          boolean tcCheckboxIsEnabled = option1.isEnabled();

          System.out.println("Is  checkbox enabled: "+tcCheckboxIsEnabled);
          
          //Checking the default selection status of checkbox

          boolean tcCheckboxIsSelected = option1.isSelected();

          System.out.println("checkbox status: "+tcCheckboxIsSelected);
          
          // This will click the Check box 		
          option1.click();	
          
          // Check whether the Check box is toggled on 		
          if (option1.isSelected()) {					
              System.out.println("Checkbox is Toggled On");					

          } else {			
              System.out.println("Checkbox is Toggled Off");					
          }		
          
          Thread.sleep(5000); 
          option1.click();			
          		
     }
     }