package Sanity.Sanity;

import LoginPage.LoginPage;
import resources.base;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest extends base{
	
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
		@BeforeTest
		public void initialize() throws IOException
		{
		
			 driver=initializeDriver();

		}

	@Test
    public void log__in() throws InterruptedException {
		driver.get(prop.getProperty("url"));
		LoginPage loginPage = new LoginPage(driver);
		
		driver.manage().window().maximize();
		loginPage.getSignin().click();
		loginPage.getEmail().sendKeys("ilanmg@artlist.io");
		loginPage.getPassword().sendKeys("Tomido1212*");
		loginPage.getLogin().click();
      

        //Assert.assertEquals(true, siteHeader.getLicenseBtn());
       
    }
}
