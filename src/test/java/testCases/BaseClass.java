package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "G:\\Driver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.qabible.in/payrollapp/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));//implicit wait
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
