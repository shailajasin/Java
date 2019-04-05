package automation;
import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler; 

public class ScreenshotProgram { 
	
	public	static	void main(String[]args) throws IOException, InterruptedException { 
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = 
				new ChromeDriver();// Here the Webdriver is an interface contains
		   driver.manage().window().maximize();
		driver.get("http://www.gmail.com"); // convertWebdriverinterface to the takescreenshot interface 
		// Use getScreenshotAs method to take screenshot and save it in 
		//Generating screenshot here
		File Filescreenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Declaring destination file
		File DestFile1=new File("D:\\automation\\Selenium\\screenshtots\\gmail.BMP");
		  //Copy file at destination
        FileHandler.copy(Filescreenshot, DestFile1);
		
		Thread.sleep(5000);
		/*
		 * driver.get("http://www.google.com/images"); // convertWebdriverinterface to
		 * the takescreenshot interface // Use getScreenshotAs method to take screenshot
		 * and save it in File img=
		 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Move image file
		 * to new destination
		 * 
		 * File DestFile=new File("D://Selenium//output//Screen2.jpg");
		 * 
		 * //Copy file at destination FileHandler.copy(img, DestFile);
		 */
        
        driver.close();
  
		} }