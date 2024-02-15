package main.java.Major_Flow;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.fail;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import main.java.Utility.Commonsteps;
import main.java.Utility.GetPageObject;
import main.java.Utility.StepBase;

public class downloadLogAndUploadJsonTerrafrom extends corestack 
{

	// View of Dashboard Verification

	@Test (priority = 1, enabled = true)
	public void login() throws Exception 
	{
		logger = report.startTest("Login_Verification_CS001");
 
		try 
		{
			Commonsteps.I_enter_in_field(Username, "Email");
			logger.log(LogStatus.PASS, "User has Entered the Email address");
		} 
		
		catch (Exception e) {
			logger.log(LogStatus.FAIL, "User not able to enter Email address");
			e.printStackTrace();
			throw e;
		}
 
		try 
		{
			Commonsteps.I_enter_in_field(Password, "Password");
			logger.log(LogStatus.PASS, "User has Entered the Password");
		} 
		
		catch (Exception e) {
			logger.log(LogStatus.FAIL, "User not able to enter Password");
			e.printStackTrace();
			throw e;
		}		
 
		try 
		{
			Commonsteps.I_click("proceed");
			logger.log(LogStatus.PASS, "Verify User has Clicked on Proceed");
			//Thread.sleep(4000);
		} 
		
		catch (Exception e1) {
			logger.log(LogStatus.FAIL, "User is not able to click on Proceed ");
			e1.printStackTrace();
			throw e1;
		}
		Thread.sleep(5000);
		}
	
	@Test (priority = 2, enabled = true)
	public void TC_66585_ExecuteFromJSON() throws Exception
	{
		logger = report.startTest("TC_66585_ExecuteFromJSON");

		try 
		{
			Commonsteps.mousehover("OperationsPage");
			Commonsteps.I_click("OperationsPage");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to hover on the OperationsPage");

		} 
		
		catch (Exception e) 
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to hover on the OperationsPage" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try 
		{
			Commonsteps.mousehover("AutomationDropdown");
			Commonsteps.I_click("AutomationDropdown");
			Thread.sleep(1000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the AutomationDropdown");

		} 
		
		catch (Exception e) 
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the AutomationDropdown" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try 
		{
			Commonsteps.mousehover("templatesPage");
			Commonsteps.I_click("templatesPage");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to navigate to the templatesPage");

		} 
		
		catch (Exception e) 
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to navigate to the templatesPage" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try 
		{
			Commonsteps.mousehover("filterButton");
			Commonsteps.I_click("filterButton");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the filterButton");

		} 
		
		catch (Exception e) 
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the filterButton" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try 
		{
			Commonsteps.dropdownwitname("dslSelect", "terraform" );
			Thread.sleep(2000);
			//Commonsteps.I_click("filterButton");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the dslSelect and select terraform");

		} 
		
		catch (Exception e) 
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the dslSelect and select terraform" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try 
		{
			Commonsteps.mousehover("applyFilter");
			Commonsteps.I_click("applyFilter");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the applyFilter");

		} 
		
		catch (Exception e) 
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the applyFilter" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try 
		{
			Commonsteps.I_enter_in_field("Provision_Instance_With_ElasticIP_AWS_Terraform","search");
			Thread.sleep(2000);
			//Commonsteps.I_click("applyFilter");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the search and enter the string");

		} 
		
		catch (Exception e)
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the search and enter the string" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try 
		{
			Commonsteps.Enter();
			//Commonsteps.I_click("executeButton");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click on enter");

		} 
		
		catch (Exception e) 
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click on enter" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try
		{
			Commonsteps.mousehover("awsTemplateButton");
			//Commonsteps.I_click("awsTemplateButton");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click on the awsTemplateButton");

		} 
		
		catch (Exception e) 
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click on the awsTemplateButton" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try 
		{
//			Commonsteps.mousehover("executeButton");
			Commonsteps.I_click("executeButton");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the executeButton");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the executeButton" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try 
		{
			Commonsteps.mousehover("executeUsingJson");
			Commonsteps.I_click("executeUsingJson");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the executeUsingJson");

		} 
		
		catch (Exception e) 
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the executeUsingJson" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Test(priority = 3, enabled = true)
	public void TC_66588_BrowseOption() throws Exception 
	{
		logger = report.startTest("TC_66588_BrowseOption");

		try 
		{
			Commonsteps.I_should_see_on_page("browse");
			Thread.sleep(1000);
			//Commonsteps.I_click("executeUsingJson");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to view to the browse");

		} 
		
		catch (Exception e) 
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to view to the browse" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
	}
	
	@Test(priority = 4, enabled = true)
	public void TC_66602_ExecuteJSONParameterDisabled() throws Exception 
	{
		logger = report.startTest("TC_66602_ExecuteJSONParameterDisabled");

		try 
		{
			Commonsteps.I_should_see_on_page("executeJSONParameter");
			Thread.sleep(1000);
			//Commonsteps.I_click("executeUsingJson");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to view to the executeJSONParameter");

		} 
		
		catch (Exception e) 
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to view to the executeJSONParameter" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
	}
	
	@Test(priority = 5, enabled = true)
	public void TC_66597_66599_JSONFileError() throws Exception 
	{
		logger = report.startTest("TC_66597_66599_JSONFileError");
	
	
	
	try 
	{
		Commonsteps.I_enter_in_field("C:/Users/PranavGupta/Documents/ui-automation/cs-automation-ui/CloudOps-Scripts/src/test/resources/xpaths.txt", "browse");
		//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
		logger.log(LogStatus.PASS, " User is able to upload the json file");
		Thread.sleep(3000);

	} 
	
	catch (Exception e) 
	{
		String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
		logger.log(LogStatus.FAIL,
				"User is not able to upload the json file" + logger.addBase64ScreenShot(logout));
		e.printStackTrace();
		throw e;
	}
	
	try 
	{
		Commonsteps.I_should_see_on_page("errorMessage");
		Thread.sleep(2000);
		//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
		logger.log(LogStatus.PASS, " User is able to view on errorMessage");

	} 
	
	catch (Exception e) 
	{
		String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
		logger.log(LogStatus.FAIL,
				"User is not able to view on errorMessage" + logger.addBase64ScreenShot(logout));
		e.printStackTrace();
		throw e;
	}
	
	
}
	
	@Test(priority = 6, enabled = true)
	public void TC_66590_UploadJSON() throws Exception 
	{
		logger = report.startTest("TC_66590_UploadJSON");

		try 
		{
			Commonsteps.I_enter_in_field("C:/Users/PranavGupta/Documents/ui-automation/cs-automation-ui/CloudOps-Scripts/src/test/resources/test.json", "browse");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, " User is able to upload the json file");
			

		} 
		
		catch (Exception e) 
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User is not able to upload the json file" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
	}
	
		@Test(priority = 7, enabled = true)
		public void TC_66592_ExecuteJSONParameters() throws Exception 
		{
			logger = report.startTest("TC_66592_ExecuteJSONParameters");
		try 
		{
			Thread.sleep(3000);
			Commonsteps.I_click("executeJSONParameter");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, " User is able to click on executeJSONParameter");

		} 
		
		catch (Exception e) 
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User is not able to click on executeJSONParameter" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
	}
		
		@Test(priority = 8, enabled = true)
		public void TC_66604_TextAreasUploadJSON() throws Exception 
		{
			logger = report.startTest("TC_66604_TextAreasUploadJSON");
		try 
		{
			Commonsteps.I_enter_in_field("\"sng"+generateString()+"\"","securityNameGroupText");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, " User is able to enter value in securityNameGroupText");

		} 
		
		catch (Exception e) 
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User is not able to enter value in securityNameGroupText" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
	}
		
	@Test(priority = 9, enabled = true)
	public void TC_66601_RunEnabled() throws Exception 
		{
			logger = report.startTest("TC_66601_RunEnabled");

			try 
			{
				Commonsteps.I_click("runtemplate");
				Thread.sleep(2000);				//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
				logger.log(LogStatus.PASS, "User able to view the runtemplate");

			} 
			
			catch (Exception e) 
			{
				String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
				logger.log(LogStatus.FAIL,
						"User not able to view the runtemplate" + logger.addBase64ScreenShot(logout));
				e.printStackTrace();
				throw e;
			}
		}
		
		
	
	@Test(priority = 10, enabled = true)
	public void logout() throws Exception 
	{
		logger = report.startTest("Logout_Verification_CS002");

		try 
		{
			Commonsteps.mousehover("logout");
			Thread.sleep(1000);
			Commonsteps.I_click("logout");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "Verify User has successfully logged out");

		} 
		
		catch (Exception e) 
		{
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User is not able to logged out" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
	}

}
