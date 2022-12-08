package testClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AccountPage;
import pages.LoginPage;
import utilities.BrowserHandler;
import utilities.Util;

public class LoginTestWithTestNG {
	WebDriver driver;
	
    @BeforeTest
    public void launchBrowser() {
        System.out.println("launching chrome browser"); 
        driver = BrowserHandler.chromeBrowserSetup();
        driver.get(Util.LOGIN_URL);
        driver.manage().window().maximize();
    }
    
    @Test
    public void verifyLoginpageTitle() {
    	System.out.println("verifying Login title of the website");
        String expectedTitle = "Account Login";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
   }
    
    @Test
    public void verifyWhetherLoginIsSuccessful() {
    	System.out.println("verifying whether the user is successfully logged in to account page");
        LoginPage login=new LoginPage(driver);
		login.setEmail(Util.EMAIL);
		login.setPassword(Util.PASSWORD);
		login.clickOnLoginbtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String expectedTitle = "My Account";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
   }
    
    @Test
    public void verifyWhetherLogoutIsSuccessful() {
    	System.out.println("verifying whether the user is successfully logged out from account page");
    	AccountPage account=new AccountPage(driver);
		account.clickOnLogout();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String expectedTitle = "Your Store";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
   }
    
    @AfterTest
    public void terminateBrowser(){
        driver.close();
    }
}
