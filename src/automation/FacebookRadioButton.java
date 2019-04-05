package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookRadioButton {
 
     public static void main(String[] args) throws Exception {
 
    	 System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
    		WebDriver driver = new ChromeDriver();
 
          driver.manage().window().maximize();
 
          driver.get("http://www.facebook.com");
 
         WebElement male_radio_button=driver.findElement(By.id("u_0_a"));
 
         boolean status=male_radio_button.isDisplayed();
 
         System.out.println("Male radio button is Displayed >>"+status);
         
         Thread.sleep(5000);
 
          boolean enabled_status=male_radio_button.isEnabled();
 
          System.out.println("Male radio button is Enabled >>"+enabled_status);
          
                   
          male_radio_button.click();
 
        boolean selected_status=male_radio_button.isSelected();
 
          System.out.println("Male radio button is Selected >>"+selected_status);
          
         
 
          male_radio_button.click();
          
 
        boolean selected_status_new=male_radio_button.isSelected();
 
          System.out.println("Male radio button is Selected >>"+selected_status_new);
          
          Thread.sleep(5000);
          
          driver.close();
   
 
     }
 
}


