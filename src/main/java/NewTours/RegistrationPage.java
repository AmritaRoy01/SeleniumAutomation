package NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	
	WebDriver driver ;
	
	By RegLink = By.linkText("REGISTER");
	By FirstName = By.name("firstName");
	By LastName = By.name("lastName");
	By phone = By.name("phone");
	By email = By.name("email");
	By address1 = By.name("address1");
	By address2 = By.name("address2");
	By city = By.name("city");
	By state = By.name("state");
	By postalCode = By.name("postalCode");
	By country = By.name("country");
	By userName = By.name("userName");
	By password = By.name("password");
	By confirmpassword = By.name("confirmPassword");
	By registerBtn = By.name("submit");
	
	RegistrationPage(WebDriver d)
	{
		driver = d;
	}
	
	public void clickRegLnk()
	{
		driver.findElement(RegLink).click();
	}
	
	
	public void setFirstName(String fname)
	{
		driver.findElement(FirstName).sendKeys(fname);
	}

	public void setLastName(String lname)
	{
		driver.findElement(LastName).sendKeys(lname);
	}
	
	public void setPhone(String Phone)
	{
		driver.findElement(phone).sendKeys(Phone);
	}
	
	public void setEmail(String Email)
	{
		driver.findElement(email).sendKeys(Email);
	}
	
	public void setAdd1(String Add1)
	{
		driver.findElement(address1).sendKeys(Add1);
	}
	
	public void setAdd2(String Add2)
	{
		driver.findElement(address2).sendKeys(Add2);
	}
	
	public void setCity(String City)
	{
		driver.findElement(city).sendKeys(City);
	}
	
	public void setState(String State)
	{
		driver.findElement(state).sendKeys(State);
	}
	
	public void setPostalCode(String PostalCode)
	{
		driver.findElement(postalCode).sendKeys(PostalCode);
	}
	
	public void setCountry(String Country)
	{
		driver.findElement(country).sendKeys(Country);
	}
	
	public void setUserName(String UserName)
	{
		driver.findElement(userName).sendKeys(UserName);
	}
	
	public void setPassword(String Password)
	{
		driver.findElement(password).sendKeys(Password);
	}
	
	public void setConfirmPassword(String ConfirmPassword)
	{
		driver.findElement(confirmpassword).sendKeys(ConfirmPassword);
	}
	
	public void clickRegBtn()
	{
		driver.findElement(registerBtn).click();
	}
	
	
}
