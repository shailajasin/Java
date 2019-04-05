package automation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesEx {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	WebDriver driver = new ChromeDriver();
	String baseUrl = "https://www.quackit.com/html/examples/frames/";
	driver.get("http://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	int size=driver.findElements(By.tagName("iframe")).size();
	System.out.println("size is"+size);
	//driver.switchTo().frame(0);// will switch our focus from main html to iframe.
	//1st method
	//driver.switchTo().frame("id");
	//2nd method
	//driver.switchTo().frame("name");
	//driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@title='Fill Quote']")));
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe[@class='demo-frame']")));
	WebElement d = driver.findElement(By.id("droppable"));
	System.out.println("text is==="+d.getText());
	driver.switchTo().defaultContent();//switch back to html
	WebElement wb = driver.findElement(By.linkText("Draggable"));
	wb.click();
	driver.close();
}
	
}
