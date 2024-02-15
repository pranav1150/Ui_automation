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

public class azureLogAnalyticsIntegrationTools extends corestack {

	// View of Dashboard Verification

	@Test (priority = 1, enabled = true)
	public void login() throws Exception {
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
		Thread.sleep(8000);
		}
	
	@Test(priority = 2, enabled = true)
	public void TC_40636_logAnalyticsPage() throws Exception {
		logger = report.startTest("TC_40636_logAnalyticsPage");

		try {
			Commonsteps.mousehover("toolsIntegration");
			Thread.sleep(2000);
			Commonsteps.I_click("toolsIntegration");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click on the toolsIntegration");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click on the toolsIntegration" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("logAnalytics");
			Thread.sleep(1000);
			Commonsteps.I_click("logAnalytics");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the logAnalytics");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the logAnalytics" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.I_should_see_on_page("azurelogAnalytics");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the azurelogAnalytics");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the azurelogAnalytics" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	
	@Test(priority = 3, enabled = true)
	public void TC_40638_logAnalyticsPage() throws Exception {
		logger = report.startTest("TC_40638_logAnalyticsPage");
		
		try {
			Commonsteps.mousehover("azurelogAnalytics");
			Thread.sleep(1000);
			Commonsteps.I_click("azurelogAnalytics");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the azurelogAnalytics");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the azurelogAnalytics" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Test(priority = 4, enabled = true)
	public void TC_40639_createQueryPageLoad() throws Exception {
		logger = report.startTest("TC_40639_createQueryPageLoad");
		
		try {
			Commonsteps.mousehover("createNewQuery");
			Thread.sleep(1000);
			Commonsteps.I_click("createNewQuery");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the createNewQuery");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the createNewQuery" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("cancelQuery");
			Thread.sleep(1000);
			Commonsteps.I_click("cancelQuery");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the cancelQuery");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the cancelQuery" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Test(priority = 4, enabled = true)
	public void TC_40641_viewEditDeleteQueryResults() throws Exception {
		logger = report.startTest("TC_40641_viewEditDeleteQueryResults");
		
		try {
			Commonsteps.I_should_see_on_page("viewQueryResults");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to view to the viewQueryResults");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to view to the viewQueryResults" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.I_should_see_on_page("editQueryResults");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to view to the editQueryResults");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to view to the editQueryResults" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.I_should_see_on_page("deleteQueryResults");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to view to the deleteQueryResults");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to view to the deleteQueryResults" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Test(priority = 5, enabled = true)
	public void TC_40642_viewQueryResults() throws Exception {
		logger = report.startTest("TC_40642_viewQueryResults");
		
		try {
			Commonsteps.mousehover("viewQueryResults");
			Thread.sleep(1000);
			Commonsteps.I_click("viewQueryResults");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the viewQueryResults");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the viewQueryResults" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.I_should_see_on_page("viewQueryResultsCloud");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to view to the viewQueryResultsCloud");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to view to the viewQueryResultsCloud" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.I_should_see_on_page("viewQueryResultsSubscriptionName");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to view to the viewQueryResultsSubscriptionName");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to view to the viewQueryResultsSubscriptionName" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.I_should_see_on_page("viewQueryResultsSubscriptionId");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to view to the viewQueryResultsSubscriptionId");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to view to the viewQueryResultsSubscriptionId" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.I_should_see_on_page("viewQueryResultsComputerName");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to view to the viewQueryResultsComputerName");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to view to the viewQueryResultsComputerName" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.I_should_see_on_page("viewQueryResultsResourceId");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to view to the viewQueryResultsResourceId");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to view to the viewQueryResultsResourceId" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("azureLogAnalyticsCrumb");
			Thread.sleep(1000);
			Commonsteps.I_click("azureLogAnalyticsCrumb");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the azureLogAnalyticsCrumb");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the azureLogAnalyticsCrumb" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Test(priority = 6, enabled = true)
	public void TC_40654_editQuery() throws Exception {
		logger = report.startTest("TC_40654_editQuery");
		
		try {
			Commonsteps.mousehover("editQueryResults");
			Thread.sleep(1000);
			Commonsteps.I_click("editQueryResults");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the editQueryResults");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the editQueryResults" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("editQueryExecutionInterval");
			Thread.sleep(1000);
			Commonsteps.I_click("editQueryExecutionInterval");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the editQueryExecutionInterval");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the editQueryExecutionInterval" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("saveQuery");
			Thread.sleep(1000);
			Commonsteps.I_click("saveQuery");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the saveQuery");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the saveQuery" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Test(priority = 7, enabled = true)
	public void TC_40655_reorderQueryTable() throws Exception {
		logger = report.startTest("TC_40655_reorderQueryTable");
		
		try {
			Commonsteps.mousehover("reorderQueryTable");
			Thread.sleep(1000);
			Commonsteps.I_click("reorderQueryTable");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the reorderQueryTable");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the reorderQueryTable" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		
		try {
			Commonsteps.mousehover("reorderCreatedAt");
			Thread.sleep(1000);
			Commonsteps.I_click("reorderCreatedAt");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the reorderCreatedAt");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the reorderCreatedAt" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("reorderApply");
			Thread.sleep(1000);
			Commonsteps.I_click("reorderApply");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the reorderApply");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the reorderApply" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("reorderQueryTable");
			Thread.sleep(1000);
			Commonsteps.I_click("reorderQueryTable");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the reorderQueryTable");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the reorderQueryTable" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("reorderResetDefault");
			Thread.sleep(1000);
			Commonsteps.I_click("reorderResetDefault");
			Thread.sleep(4000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the reorderResetDefault");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the reorderResetDefault" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Test(priority = 8, enabled = true)
	public void TC_40649_editQueryPage() throws Exception {
		logger = report.startTest("TC_40649_editQueryPage");
		
		try {
			Commonsteps.mousehover("editQueryResults");
			Thread.sleep(1000);
			Commonsteps.I_click("editQueryResults");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the editQueryResults");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the editQueryResults" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("saveQuery");
			Thread.sleep(1000);
			Commonsteps.I_click("saveQuery");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the saveQuery");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the saveQuery" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Test(priority = 9, enabled = true)
	public void TC_40650_deleteDialogBoxIsVisible() throws Exception {
		logger = report.startTest("TC_40650_deleteDialogBoxIsVisible");
		
		try {
			Commonsteps.mousehover("deleteQueryResults");
			Thread.sleep(1000);
			Commonsteps.I_click("deleteQueryResults");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the deleteQueryResults");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the deleteQueryResults" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.I_should_see_on_page("deleteCancel");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to view to the deleteCancel");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to view to the deleteCancel" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.I_should_see_on_page("deleteConfirm");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to view to the deleteConfirm");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to view to the deleteConfirm" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Test(priority = 9, enabled = true)
	public void TC_40651_deleteCancel() throws Exception {
		logger = report.startTest("TC_40651_deleteCancel");
		
		try {
			Commonsteps.mousehover("deleteCancel");
			Thread.sleep(1000);
			Commonsteps.I_click("deleteCancel");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the deleteCancel");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the deleteCancel" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
	}
	
	@Test(priority = 10, enabled = true)
	public void TC_40652_deleteConfirm() throws Exception {
		logger = report.startTest("TC_40652_deleteConfirm");
		
		try {
			Commonsteps.mousehover("deleteQueryResults");
			Thread.sleep(1000);
			Commonsteps.I_click("deleteQueryResults");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the deleteQueryResults");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the deleteQueryResults" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("deleteConfirm");
			Thread.sleep(1000);
			Commonsteps.I_click("deleteConfirm");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the deleteConfirm");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the deleteConfirm" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
	}
	
	@Test(priority = 11, enabled = true)
	public void logout() throws Exception {
		logger = report.startTest("Logout_Verification_CS002");

		try {
			Commonsteps.mousehover("logout");
			Thread.sleep(1000);
			Commonsteps.I_click("logout");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "Verify User has successfully logged out");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User is not able to logged out" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
	}

}
