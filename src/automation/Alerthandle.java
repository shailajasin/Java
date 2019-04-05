package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class Alerthandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		  driver.findElement(By.name("proceed")).click(); Thread.sleep(5000); Alert
		  alert=driver.switchTo().alert(); //alert.accept();//to click on ok
		  System.out.println(alert.getText()); alert.accept();
		  
		  
		 
	}

}
