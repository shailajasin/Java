package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectors {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.facebook.com/";
            
        driver.get(baseUrl);       
        
        //Using Tagname # Id
        //Approach -1 
		
		 //WebElement myElement = driver.findElement(By.cssSelector("input#email"));
		  //myElement.sendKeys("aruna.avula@gmail.com");
		  
		  //WebElement myElement1 = driver.findElement(By.cssSelector("input#pass"));
		  //myElement1.sendKeys("pass");
		 
		  
		/*
		 * <a jflkflgjfkljg="">next button</a> <a jflkflgjfkljg="">previous button</a>
		 */
        
        //Approach -2
        //Using Tagname.className
        
		
  WebElement myElement2 =
		  driver.findElement(By.cssSelector("input.inputtext"));
  myElement2.sendKeys("aruna.avula@gmail.com");
		 
        //Approach -3
        //Using css=tag[attribute=value]  input[name=pass] data-testid=royal_email
		
		 WebElement myElement3 =
		  driver.findElement(By.cssSelector("input[name=email]"));
		  myElement3.sendKeys("aruna.avula@gmail.com");
		 
         myElement3.sendKeys(Keys.ENTER);
                Thread.sleep(5000);  
        
        driver.close();
        System.exit(0);
}
}
