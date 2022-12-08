package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By email=By.name("email");
	By password=By.name("password");
	By loginBtn=By.xpath("//input[@value='Login']");
	By forgotPassword=By.linkText("Forgotten Password");
	//By selectLogin=By.linkText("Login");
	
	public void setEmail(String userId) {
		driver.findElement(email).sendKeys(userId);
	}
	
	public void setPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLoginbtn() {
		driver.findElement(loginBtn).click();
	}
	
	public void toHandleForgetPassword() {
		driver.findElement(forgotPassword).click();
	}
	
	public void toSelectLogin() {
		driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=account/login']"));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")).click();
	}

}
