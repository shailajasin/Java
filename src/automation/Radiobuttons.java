package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.WebElement;


public class Radiobuttons {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
driver.manage().window().maximize();	
Thread.sleep(5000);
driver.findElement(By.id("u_0_c")).sendKeys("Charit");
driver.findElement(By.id("u_0_e")).sendKeys("kunchakuri");
driver.findElement(By.id("u_0_h")).sendKeys("012345678");
driver.findElement(By.id("u_0_o")).sendKeys("password@123");
//Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText(6);
Select month =new Select(driver.findElement(By.id("month")));
month.selectByValue("12");
Select day=new Select(driver.findElement(By.name("birthday_day")));
day.selectByVisibleText("7");//name="birthday_year"
Select year=new Select(driver.findElement(By.name("birthday_year")));
year.selectByVisibleText("1989");
driver.findElement(By.id("u_0_a")).click();
//driver.findElement(By.id("u_0_9")).click();
driver.findElement(By.name("websubmit")).click();

}
}
