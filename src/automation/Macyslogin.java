package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Macyslogin {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.macys.com/account/signin");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input#email")).sendKeys("Shailaja.s1@gmail.com");
	driver.findElement(By.cssSelector("input#pw-input")).sendKeys("Shiva443");
	
driver.findElement(By.id("sign-in")).click();	
}
}
