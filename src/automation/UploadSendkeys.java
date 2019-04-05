package automation;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.io.IOException;
public class UploadSendkeys {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.firefox.marionette","D:\\selenium\\geckodriver-v0.24.0-win64.exe"); 
	WebDriver driver=new FirefoxDriver();	
	driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
	//Locating 'browse' button
	 WebElement browse =driver.findElement(By.id("uploadfile"));
	 //pass the path of the file to be uploaded using Sendkeys method
	 browse.click();
	 System.out.println(1);
	 //browse.sendKeys("D:\\SoftwareTestingMaterial\\UploadFile.txt");
	 Runtime.getRuntime().exec("D:\\Uploadfile.exe");
	 System.out.println(2);
	 //'close' method is used to close the brzowser window
	 driver.close();	
}
}
