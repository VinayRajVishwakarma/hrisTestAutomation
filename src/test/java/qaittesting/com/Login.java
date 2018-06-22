package qaittesting.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	WebDriver driver;
	//WebElement userNameEntry;
	
	public WebElement getUserName(){
		return this.driver.findElement(By.id("txtUserName"));
		
	}
	public WebElement getPassword(){
		return this.driver.findElement(By.id("txtPassword"));
	}
	
	public Login(WebDriver driver){
		this.driver=driver;
		
	}
	
	public String enterintologin(String username, String password){
		logging_in(username , password);
		return this.driver.getTitle().toString();
	}
	 
	
	public void logging_in(String username, String password){
	
		getUserName().clear();
		getUserName().sendKeys(username);
		getPassword().clear();
		getPassword().sendKeys(password);
		getPassword().sendKeys(Keys.ENTER);
	}
}
