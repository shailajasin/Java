package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import java.util.concurrent.TimeUnit;

public class anjali {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","D:\\selenium\\geckodriver-v0.24.0-win64.exe"); 
		WebDriver driver=new FirefoxDriver();	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
	Thread.sleep(5000);
	System.out.println("Page is intiated");
	//(".//iframe[@title='Fill Quote']")));

	driver.findElement(By.name("software")).click();
	driver.findElement(By.xpath(".//input[@value='SUBMIT']")).click();
	System.out.println("Radio button is intiated");
	driver.close();
	}
}
