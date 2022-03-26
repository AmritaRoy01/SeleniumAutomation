package NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage1 {
	WebDriver driver;
	
	public RegistrationPage1(WebDriver d) {
		// TODO Auto-generated constructor stub
		driver = d;
	}

	@FindBy(how=How.LINK_TEXT, using = "REGISTER")
	WebElement RegLink;
	
	@FindBy(how=How.NAME, using = "firstName")
	WebElement FirstName;
	
	@FindBy(how=How.NAME, using = "lastName")
	WebElement LastName;
	
	@FindBy(how=How.NAME, using = "phone")
	WebElement phone;
	
	@FindBy(how=How.NAME, using = "email")
	WebElement email;
	
	@FindBy(how=How.NAME, using = "address1")
	WebElement address1;
	
	/*@FindBy(how=How.NAME, using = "state")
	WebElement state;*/;
	
	@FindBy(how=How.NAME, using = "city")
	WebElement city;
	
	@FindBy(how=How.NAME, using = "postalCode")
	WebElement postalCode;
	
	@FindBy(how=How.NAME, using = "userName")
	WebElement userName;
	
	@FindBy(how=How.NAME, using = "password")
	WebElement password;
	
	@FindBy(how=How.NAME, using = "confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(how=How.NAME, using = "submit")
	WebElement submit;
	
	
	public void clickRegLnk()
	{
		driver.findElement((By) RegLink).click();
	}
	
	
	public void setFirstName(String fname)
	{
		driver.findElement((By) FirstName).sendKeys(fname);
	}

	public void setLastName(String lname)
	{
		driver.findElement((By) LastName).sendKeys(lname);
	}
	
	public void setPhone(String Phone)
	{
		driver.findElement((By) phone).sendKeys(Phone);
	}
	
	public void setEmail(String Email)
	{
		driver.findElement((By) email).sendKeys(Email);
	}
	
	public void setAdd1(String Add1)
	{
		driver.findElement((By) address1).sendKeys(Add1);
	}
	
	/*public void setAdd2(String Add2)
	{
		driver.findElement(address2).sendKeys(Add2);
	}*/
	
	public void setCity(String City)
	{
		driver.findElement((By) city).sendKeys(City);
	}
	
	/*public void setState(String State)
	{
		driver.findElement((By) state).sendKeys(State);
	}*/
	
	public void setPostalCode(String PostalCode)
	{
		driver.findElement((By) postalCode).sendKeys(PostalCode);
	}
	
	/*public void setCountry(String Country)
	{
		driver.findElement(country).sendKeys(Country);
	}*/
	
	public void setUserName(String UserName)
	{
		driver.findElement((By) userName).sendKeys(UserName);
	}
	
	public void setPassword(String Password)
	{
		driver.findElement((By) password).sendKeys(Password);
	}
	
	public void setConfirmPassword(String ConfirmPassword)
	{
		driver.findElement((By) confirmPassword).sendKeys(ConfirmPassword);
	}
	
	public void clickRegBtn()
	{
		driver.findElement((By) submit).click();
	}
	
	
	
}
