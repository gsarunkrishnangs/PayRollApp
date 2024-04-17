package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// with page factory
	}

	@FindBy(xpath = "//input[@id='loginform-username']")
	WebElement userNameField;

	// By userNameField=By.id("loginform-username"); Without pagefactory

	@FindBy(xpath = "//input[@id='loginform-password']")
	WebElement passwordField;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginButton;
	
	@FindBy(xpath = "//p[text()='Incorrect username or password.']")
	WebElement warningMessage;

	public void sendUserName() {
		userNameField.sendKeys("carol");
	}
	public void sendPassWord() {
		passwordField.sendKeys("1q2w3e4r");
	}
	public void clickONLoginButton() {
		loginButton.click();
	}
	public void sendInvalidUserName() {
		userNameField.sendKeys("carol1");
	}
	public void sendInvalidPassWord() {
		passwordField.sendKeys("1q2w3e4r1");
	}
	public void invalidMessageWarning() {
		warningMessage.getText();
	}
}