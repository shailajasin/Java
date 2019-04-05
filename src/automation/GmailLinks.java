package automation;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLinks {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://gmail.com");
	Thread.sleep(5000);
	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
	for(WebElement link  : alllinks) {
		System.out.println(link.getText());
	}
}
}
