package automation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

public class AlertProgram2 {
	
	public static void main(String args[]) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//D:\SeleniumWS\SeleniumTutorial\src\selBasics\Alert.html
		driver.get("file:///D:\\automation\\Selenium\\src\\automation/alert2.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.dismiss();
	}
}