package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();	
driver.get("http://facebook.com");
String actualTitle = driver.getCurrentUrl();
System.out.println("actual title is "+actualTitle);

String expectedTitle = "login-signup";

//equalsIgnoreCase  -- checks with actual facebook actual title 

if (actualTitle.equalsIgnoreCase(expectedTitle)) {
	System.out.println("Test Passed");
} else {
	System.out.println("Test Failed");
}
driver.close();

}
	
}

