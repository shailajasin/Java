package automation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
public class Test {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://facebook.com");
	driver.manage().window().maximize();
	Select x=new Select(driver.findElement(By.name("birthday_wrapper")));
	System.out.println("xpath selected");
x.selectByVisibleText("Apr");
x.selectByValue("10");
x.selectByIndex(1);
}

}
//