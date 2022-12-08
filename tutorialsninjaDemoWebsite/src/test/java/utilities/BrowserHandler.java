package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserHandler {
 static WebDriver driver;
 
 public static WebDriver chromeBrowserSetup() {
	 System.setProperty("webdriver.chrome.driver",Util.CHROME_PATH);
	 driver=new ChromeDriver();
	 return driver;
 }
 
 public static WebDriver firefoxBrowserSetup() {
	 System.setProperty("webdriver.chrome.driver",Util.FIREFOX_PATH);
	 driver=new FirefoxDriver();
	 return driver;
 }
}
