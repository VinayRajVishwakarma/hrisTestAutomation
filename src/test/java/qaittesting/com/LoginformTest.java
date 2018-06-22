package qaittesting.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.*;

public class LoginformTest {

	WebDriver driver;
	Login login;
	
	@Test
	public void test01_(){
		Assert.assertTrue(login.enterintologin("vinayvishwakarma","vinay").contentEquals("https://hris.qainfotech.com:8086/time/timesheet"));
	}
	
	//@Test
	public void test02_(){
		
	}
	@BeforeClass 
	public void launchbrowser(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://hris.qainfotech.com/login.php");
		login= new Login(driver);
	}
}
