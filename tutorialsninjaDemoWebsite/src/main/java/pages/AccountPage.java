package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class AccountPage {
	WebDriver driver;
		
	public AccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By logoutLink=By.linkText("Logout");
	By continueLogout=By.linkText("Continue");
	
	public void clickOnLogout() {
		driver.findElement(logoutLink).click();
		driver.findElement(continueLogout).click();
	}
}
