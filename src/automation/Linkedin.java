package automation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Linkedin {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
String baseurl="http://linkedin.com";
driver.manage().window().maximize();
driver.get(baseurl);
System.out.println("base url is"+baseurl);
WebElement myElement = driver.findElement(By.id("login-email")); //identiying email field using Id
myElement.sendKeys("ssingirikonda43@gmail.com");
driver.findElement(By.id("login-password")).sendKeys("Shiva443");
Thread.sleep(5000);
driver.findElement(By.id("login-submit")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"nav-settings__dropdown-trigger\"]/img")).click();
Thread.sleep(5000);
//driver.findElement(By.partialLinkText("logout")).click();
WebElement x =driver.findElement(By.cssSelector(".nav-dropdown__action"));
System.out.println("x is "+x);
x.click();
driver.findElement(By.id("login-email")).clear();
//driver.findElement(By.id("login-email")).sendKeys("43.shiva@gmail.com");
Thread.sleep(5000);






}
}




