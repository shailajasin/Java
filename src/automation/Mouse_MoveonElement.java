package automation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.

public class Mouse_MoveonElement {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.firefox.marionette","D:\\selenium\\geckodriver-v0.24.0-win64.exe"); 
	WebDriver driver=new FirefoxDriver();	
	driver.navigate().to("http://www.jabong.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	System.out.println("Navigated to Jabong");
	Actions a=new Actions(driver);
	WebElement text = driver.findElement(By.xpath("//*[@id=\"mainTopNav\"]/li[1]/a"));
	a.moveToElement(text).click().build().perform();
	Thread.sleep(1000);
	WebElement juice=driver.findElement(By.xpath("//*[@id=\"mainTopNav\"]/li[8]/a"));
a.moveToElement(juice).click().build().perform();
Thread.sleep(1000);
a.sendKeys(Keys.PAGE_DOWN).click().perform();

//driver.findElement(By.id("search")).sendKeys("kill");
//a.moveToElement(search).sendKeys("kill").click().build().perform();
//a.moveToElement(search).keyDown(search,Keys.SHIFT).perform();
}

}
