//Explicit wait is applied on cretain element with defined excepted condition and time.
//WebDriverWait wait = new WebDriverWait(WebDriverReference, Timeout);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
package automation;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//WebDriverWait wait = new WebDriverWait(WebDriverReference, Timeout);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
public class ExplicitwaitEx {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	// To maximize the browser window
	driver.manage().window().maximize();
	// This waits up to 15 seconds before throwing a TimeoutException or if it finds
	// the element will return it in 0 - 15 seconds
	WebDriverWait wait = new WebDriverWait(driver, 0);
	// Title of the webpage is "Gmail"
	//wait.until(ExpectedConditions.titleIs("Gmail"));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
	// 3 seconds u will save 12 secs		
	//If i dont find element in 0 to 15 seconds, it will again throw a element not found exception..
	
	// If the above condition met then the browser will be closed
	// To close the browser
	driver.close();

	
}
}
