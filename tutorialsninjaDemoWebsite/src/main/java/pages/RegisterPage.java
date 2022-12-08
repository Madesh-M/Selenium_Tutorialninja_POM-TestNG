package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
WebDriver driver;
	
	public RegisterPage(WebDriver driver){
		this.driver=driver;	
	}
	
	By firstName=By.name("firstname");
	By lastName=By.name("lastname");
	By email=By.name("email");
	By telephone=By.name("telephone");
	By password=By.name("password");
	By confirmPassword=By.name("confirm");
	By newsletterRadioBtn=By.name("newsletter");
	By agreeCheckBox=By.name("agree");
	By registerbtn=By.xpath("//input[@value='Continue']");
	
	public void setFirstName(String f_Name) {
		driver.findElement(firstName).sendKeys(f_Name);
	}
	
	public void setLastName(String l_Name) {
		driver.findElement(lastName).sendKeys(l_Name);
	}
	
	public void setEmail(String emailId) {
		driver.findElement(email).sendKeys(emailId);
	}
	
	public void setTelephone(String phone) {
		driver.findElement(telephone).sendKeys(phone);
	}
	
	public void setPassword(String passcode) {
		driver.findElement(password).sendKeys(passcode);
	}
	
	public void setConfirmPassword(String confirm) {
		driver.findElement(confirmPassword).sendKeys(confirm);
	}
	
	public void clickNewsLetter() {
		driver.findElement(newsletterRadioBtn).click();
	}
	
	public void clickAgree() {
		driver.findElement(agreeCheckBox).click();
	}
	
	public void clickContinue() {
		driver.findElement(registerbtn).click();
	}
	
}
