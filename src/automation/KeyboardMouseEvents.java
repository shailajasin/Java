/*The Keyboard interface has the below mentioned methods:
sendKeys(keysToSend) : sends a series of keystrokes onto the element
keyDown(theKey) : Sends a key press without release it. Subsequent actions may assume it as pressed. (example: Keys.ALT, Keys.SHIFT, or Keys.CONTROL)
keyUp(theKey): Performs a key release
Action builder=new Action(driver);
builder.KeyDown(password, Keys.SHIFT);
builder.KeyUP(password,Keys.SHIFT);
*/

package automation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
public class KeyboardMouseEvents {
public static void main(String[] args) {
	System.setProperty("webdriver.firefox.marionette","D:\\selenium\\geckodriver-v0.24.0-win64.exe"); 
	WebDriver driver=new FirefoxDriver();	
	String baseurl = "http://facebook.com";
	driver.get(baseurl);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	WebElement password = driver.findElement(By.id("pass"));
	//creating action class
	Actions builder=new Actions(driver);
	
	//Action seriesOfActions =
		builder.moveToElement(password).click().perform();
		builder.moveToElement(password).keyDown(password,Keys.SHIFT).perform();
		builder.moveToElement(password).sendKeys(password, "shailaja").perform();
			/* builder
					.moveToElement(password)
					.click()
					.keyDown(password, Keys.SHIFT)
					.sendKeys(password, "anvisol")
					.keyUp(password, Keys.SHIFT)
					.doubleClick(password)
					.build();	
				seriesOfActions.perform() ;	*/
}
}
