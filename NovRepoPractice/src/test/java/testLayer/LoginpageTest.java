package testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageLayer.Loginpage;
import testBase.TestBase;

public class LoginpageTest extends TestBase {

	String expected_url = "https://www.apps.dalalstreet.ai/dashboard";
	@Test
	public void verifyLoginTest() throws InterruptedException
	{
		Loginpage login = new Loginpage();
		
		login.enterEmailAddress();
		login.enterPassword();
		login.clickOnLoginButton();
		Thread.sleep(3000);
		
	}
}
