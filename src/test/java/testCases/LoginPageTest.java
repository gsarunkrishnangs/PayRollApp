package testCases;

import org.testng.annotations.Test;

import elementRepository.LoginPage;

public class LoginPageTest extends BaseClass {
	LoginPage lp;
  @Test
  /*public void verifyLoginWithValidData() {
	  lp=new LoginPage(driver);
	  lp.sendUserName();
	  lp.sendPassWord();
	  lp.clickONLoginButton();
  }*/
  public void verifyLoginWithInvalidData() {
	  lp=new LoginPage(driver);
	  lp.sendInvalidUserName();
	  lp.sendInvalidPassWord();
	  lp.clickONLoginButton();
	  lp.invalidMessageWarning();
  }
}
