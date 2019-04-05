package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadbutton {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://html.com/input-type.file/");
	
	driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\slusiva\\Desktop\\vb2.txt");

}
}