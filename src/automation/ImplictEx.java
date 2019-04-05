//Implict wait tells the WebDriver to wait for certain amount of time before it throws exception.
//It is intalized only once and will be used throughout the program.
//driver().manage().timeouts().implicityWait(Timeout,timeunits.seconds);
//import java.util.concurrent.TimeUnit;
package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import java.util.concurrent.TimeUnit;
public class ImplictEx {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
driver.get("http://yahoo.com");
driver.manage().window().maximize();
driver.close();

}
}
