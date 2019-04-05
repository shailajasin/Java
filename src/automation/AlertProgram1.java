package automation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class AlertProgram1 {

	//this is for simple alert
	public static void main(String args[]) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//D:\SeleniumWS\SeleniumTutorial\src\selBasics\Alert.html
		driver.get("file:///D:\\automation\\Selenium\\src\\automation/alert1.html");		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();//xpath("tagname[@attribut='value']")
		//	driver.findElement(By.xpath("//button")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(alert.getText());
		alert.accept();
	}
}