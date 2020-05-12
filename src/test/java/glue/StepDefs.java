package glue;

import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.*;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.SendSMSPage;
import utilities.TestUtility;

public class StepDefs {
	
	//properties of class
	
	public String projectPath;
	public RemoteWebDriver driver;
	public Scenario s;
	public Properties p;

	public HomePage hp;
	public SendSMSPage sp;
	public WebDriverWait w;

	public StepDefs()
	{
		driver=null;
	}
	
	// own classes in other packages in maven project
	
	public TestUtility tu;	
	
	// Cucumber annotations
		
	@Before
	public void method1(Scenario s)
	{
		this.s=s;
		try {
			projectPath = System.getProperty("user.dir");
			FileReader fr = new FileReader(projectPath+"\\src\\test\\resources\\properties\\reuse.properties");
			p = new Properties();
			p.load(fr);
			} catch (Exception e) {
				// TODO: handle exception
				e.getStackTrace();
			}
			tu = new TestUtility();
			
	}
	
	
	
	@Given("^launch site using \"(.*)\"$")
	public void method2(String browser)
	{
		// open browser
		driver = tu.openBrowser(browser);
		hp = new HomePage(driver);
		sp = new SendSMSPage(driver);
		// Launch site
		tu.launchSite(p.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		w=new WebDriverWait(driver,20);
	}
	
	@When("^\"(.*)\" and \"(.*)\" are entered$")
	public void method3(String mobNum, String pwd)
	{
		hp.loginCredentials(mobNum, pwd);
	}
	
	@And("^login is clicked$")
	public void method4() throws Exception
	{
		hp.login();
		Thread.sleep(5000);
	}
	
	@Then("^respective \"(.*)\" should be displayed$")
	public void method5(String error)
	{
		try {
			w.until(ExpectedConditions.visibilityOf(hp.errorMsg));
			//SoftAssertions sa = new SoftAssertions();
			if(hp.errorMsg.getText().equals(error))
			{
				
				
					System.out.println("Test passed");
					//sa.assertThat(hp.errorMsg.getText()).isEqualTo(error);
					//sa.assertAll();
				
				
			}else
			{
				Assert.fail("error is not matched");
				//sa.fail("Test failed");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Then("^respective user account should be displayed$")
	public void method7()
	{
		try {
			w.until(ExpectedConditions.visibilityOf(sp.display));
			sp.clickLogout();
			w.until(ExpectedConditions.elementToBeClickable(hp.mobNum));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			tu.closeSite();
			Assert.fail();
			
		}
	}

	
	@When("^close site$")
	public void method6()
	{
		tu.closeSite();
	}
	
}
