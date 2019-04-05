package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//custom xpath---driver.findelemrnt(by.xpath("//input[@class='']"))
		
		//input --html tag name,[]---attribute..
		//"//input[@name='query']"
		//xpath("//input[contains(@class,'valueofclass')]"))
		
		//dynamic id:
		//id=test_123
		//id= test_345
		//id=test_567
		//xpath("//input[contains(@id,'test_')]"))
		//xpath("//input[starts-with(@id,'test_')]")).sendkeys
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		String baseurl="http://linkedin.com";
				driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[contain(@id,'reg-firstname')]")).sendKeys("shailaja");
	}

}