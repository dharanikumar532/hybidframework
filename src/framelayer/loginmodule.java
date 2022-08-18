package framelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginmodule
{
	WebElement driver;
	public loginmodule(WebElement driver)
	{
		this.driver=driver;
	}
@FindBy(xpath="//input[@id='txtuId']")
public static WebElement username;
@FindBy(xpath="//input[@id='txtPword']")
public static WebElement password;
@FindBy(xpath="//input[@id='login']")
public static WebElement login;
public static void verify(String user,String pass)
{
	username.sendKeys(user);
	password.sendKeys(pass);
	login.click();
}
}
