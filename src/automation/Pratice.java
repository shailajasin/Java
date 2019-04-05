package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Pratice {

public static void main(String[] args) throws InterruptedException {
	
	String[] username={"", "test"};
    String[] password= {"vvvv", "test"};
    System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://linkedin.com");
        for(int i = 0; i < username.length ; i++)
        {
        	driver.findElement(By.id("login-email")).clear();
        	driver.findElement(By.id("login-email")).sendKeys(username[i]);
        	           System.out.println(username[i]);
           Thread.sleep(5000);
           driver.findElement(By.id("login-password")).clear();
           driver.findElement(By.id("login-password")).sendKeys(password[i]);
           System.out.println(password[i]);
           driver.findElement(By.id("login-submit")).click();
         }
        driver.close();
//       // driver.manage().window().maximize();//maximize the window
//		driver.manage().window().maximize();
//		System.out.println("action invoked");
//	driver.getTitle();
//			//driver.findElement(By.name("identifier")).sendKeys("shailaja.s1");
//			
//		//driver.findElement(By.name(name)))
//		driver.findElement(By.cssSelector("input#identifierId")).sendKeys("shailaja.s1");//tagname#id
////.findElement(By.cssSelector("input.login-password reg-field__input")).click();	
//		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();//tagname.classname
//		//driver.findElement(By.cssSelector("span[class=RveJvd.snByac]")).click();    //Using css=tag[attribute=value]
//	
	}
}