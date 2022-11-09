package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import PageObjects.CreatePage;
import PageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	
	//@Parameters("browser")
	@BeforeClass
	public void Browser_launch() throws InterruptedException
	{
		//if(browser.equals("chrome"))
		//{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://portal-pre-prod.perspect.ai/login");	
		driver.navigate().refresh();
		driver.get("https://portal-pre-prod.perspect.ai/login");	

	}
	
	/*
	 * else if(browser.equals("Firefox")) { driver=new FirefoxDriver();
	 * WebDriverManager.firefoxdriver().setup();
	 * driver.manage().window().maximize();
	 * driver.get("portal-test.perspect.ai/login"); }
	 * 
	 * else (browser.equals("Edge")) { driver=new EdgeDriver();
	 * WebDriverManager.edgedriver().setup(); driver.manage().window().maximize();
	 * driver.get("portal-test.perspect.ai/login"); } }
	 */
	
	/*
	 * public void login() { LoginObject log_obj=new LoginObject(driver);
	 * log_obj.Login_Mail("prasad@perspect.ai"); log_obj.Login_Password("P@ssw0rd");
	 * log_obj.Login_button(); }
	 */
	
	
	  public CreatePage create_obj() 
	  { 
		  return new CreatePage(driver);
		  }
			
			  public WebDriverWait wait(int i) 
			  { 
				  return new WebDriverWait(driver, i);
			  
			  }
			 
	  
		/*
		 * @AfterClass public void close() { driver.close(); }
		 */
	 
}
