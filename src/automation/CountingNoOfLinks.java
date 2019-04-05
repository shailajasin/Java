package automation;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingNoOfLinks {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
			String baseUrl = "https://www.google.com/";

		driver.get(baseUrl);
		driver.manage().window().maximize();
		   
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		// <a>aruna</a>
		// <a>anvisol </a>
		// <a>anvitha</a>

		for (WebElement link : allLinks)

		{
			System.out.println(link.getText()); // aruna anvisol anvitha
		}

		driver.findElement(By.partialLinkText("Abo")).click();
		Thread.sleep(5000);
		//PartialLinktext ?
		driver.navigate().back();
driver.findElement(By.linkText("Advertising")).click();
		Thread.sleep(5000);

		driver.close();
		System.exit(0);
	}

}