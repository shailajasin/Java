package automation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gmailfunc {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
String baseurl="http://gmail.com";
//String EmailtagName = "";
//String NexttagName = "";
driver.get(baseurl);
System.out.println("base url is"+baseurl);
//EmailtagName = driver.findElement(By.id("identifierId")).getTagName();
//System.out.println(EmailtagName);
//NexttagName = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).getTagName();
//System.out.println(NexttagName);
WebElement myElement = driver.findElement(By.id("identifierId")); //identiying email field using Id
myElement.sendKeys("shailaja.s1@gmail.com");
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click(); 
Thread.sleep(5000);








}
}



