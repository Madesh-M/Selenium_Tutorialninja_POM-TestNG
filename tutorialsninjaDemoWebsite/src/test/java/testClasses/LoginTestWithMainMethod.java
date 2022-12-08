package testClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import pages.AccountPage;
import pages.LoginPage;
import utilities.BrowserHandler;
import utilities.Util;

public class LoginTestWithMainMethod {
public static void main(String[] args) throws Exception {
		WebDriver driver;
		
		//setting up chrome driver
		driver=BrowserHandler.chromeBrowserSetup();
		
		driver.get(Util.LOGIN_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		LoginPage login=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//login.toSelectLogin();
		login.setEmail(Util.EMAIL);
		login.setPassword(Util.PASSWORD);
		login.clickOnLoginbtn();
		
		AccountPage account=new AccountPage(driver);
		account.clickOnLogout();
		if(Util.BASE_URL.equalsIgnoreCase("http://tutorialsninja.com/demo/index.php?route=common/home")) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}
}
}
