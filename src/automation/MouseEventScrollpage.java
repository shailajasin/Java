package automation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventScrollpage {
	public  static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			// Creating an object 'action'
		Actions action = new Actions(driver);
		   driver.get("https://www.jabong.com");
			Thread.sleep(3000);
			// SCROLL DOWN
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(3000);
		// SCROLL UP
		action.sendKeys(Keys.PAGE_UP).build().perform();
		// driver.close();

		Thread.sleep(3000);
driver.close();
	}
}
