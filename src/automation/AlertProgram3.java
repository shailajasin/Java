package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

public class AlertProgram3 {
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","D:\\JARS\\geckodriver-v0.24.0-win64.exe"); 
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//D:\SeleniumWS\SeleniumTutorial\src\selBasics\Alert.html
		driver.get("file:///D:\\automation\\Selenium\\src\\automation/alert3.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Aruna");
		alert.accept();
		Thread.sleep(2000);
	}
}