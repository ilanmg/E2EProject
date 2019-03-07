package LoginPage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

	
	public WebDriver driver;
	
	By signInBtn=By.cssSelector("#user-login-btn");
	By logemail=By.cssSelector("#logemail");
	By loaginPasswordInput=By.cssSelector("#logpassword");
	By loginBtn=By.cssSelector("#btnlogin");
	
	
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public WebElement getSignin()
	{
		return driver.findElement(signInBtn);
	}
	public WebElement getEmail()
	{
		return driver.findElement(logemail);
	}
	public WebElement getPassword()
	{
		return driver.findElement(loaginPasswordInput);
	}
	public WebElement getLogin()
	{
		return driver.findElement(loginBtn);
	}
    
 }
