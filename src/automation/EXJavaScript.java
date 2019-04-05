package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
public class EXJavaScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	driver.get("http://demo.guru99.com/V4/");
	driver.manage().window().maximize();
	WebElement button= driver.findElement(By.name("btnLogin"));
	driver.findElement(By.name("uid")).sendKeys("shailaja");
	driver.findElement(By.name("password")).sendKeys("abcdessd");
	js.executeScript("arguments[0].click();", button);
	js.executeScript("alert('Welcome to Guru99');");

}
}

