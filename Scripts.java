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

public class Scripts extends corestack {

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
		Thread.sleep(5000);
		}
	
	
	@Test(priority = 2, enabled = true)
	public void TC_32689_Scripts_Page_Load() throws Exception {
		logger = report.startTest("TC_32689_Scripts_Page_Load");

		try {
			Commonsteps.mousehover("OperationsPage");
			Thread.sleep(2000);
			Commonsteps.I_click("OperationsPage");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to hover on the OperationsPage");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to hover on the OperationsPage" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("AutomationDropdown");
			Thread.sleep(1000);
			Commonsteps.I_click("AutomationDropdown");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the AutomationDropdown");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the AutomationDropdown" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("ScriptsPage");
			Thread.sleep(1000);
			Commonsteps.I_click("ScriptsPage");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to navigate to the ScriptsPage");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to navigate to the ScriptsPage" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
	}

	@Test(priority = 3, enabled = true)
	public void TC_34823_jobHistoryAndScheduleScriptsLoadTest() throws Exception {
		logger = report.startTest("TC_34823_jobHistoryAndScheduleScriptsLoadTest");

		try {
			Commonsteps.mousehover("jobHistory");
			Thread.sleep(2000);
			Commonsteps.I_click("jobHistory");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the jobHistory");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the jobHistory" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("schedules");
			Thread.sleep(2000);
			Commonsteps.I_click("schedules");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to navigate to the schedules");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to navigate to the schedules" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
	}
	
	@Test(priority = 4, enabled = true)
	public void TC_68534_nextRerunScheduleScriptsDelete() throws Exception {
		logger = report.startTest("TC_68534_nextRerunScheduleScriptsDelete");

		try {
			Commonsteps.mousehover("schedulesRow");
			Thread.sleep(1000);
			Commonsteps.I_click("schedulesRow");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the schedulesRow");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the schedulesRow" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("deleteNextRun");
			Thread.sleep(1000);
			Commonsteps.I_click("deleteNextRun");
			Thread.sleep(3000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the deleteNextRun");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the deleteNextRun" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
	}
	
	@Test(priority = 5, enabled = true)
	public void TC_34822_appPageInScriptsLoad() throws Exception {
		logger = report.startTest("TC_34822_appPageInScriptsLoad");

		try {
			Commonsteps.mousehover("AppsPage");
			Thread.sleep(1000);
			Commonsteps.I_click("AppsPage");
			Thread.sleep(3000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the AppsPage");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the AppsPage" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Test(priority = 6, enabled = true)
	public void TC_34824_scriptsPageList() throws Exception {
		logger = report.startTest("TC_34824_scriptsPageList");

		try {
			Commonsteps.mousehover("ScriptsPage");
			Thread.sleep(1000);
			Commonsteps.I_click("ScriptsPage");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the ScriptsPage");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the ScriptsPage" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.pagescrolldown();
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the Scrolldown");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the Scrolldown" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}

		try {
			Commonsteps.mousehover("LoadMore");
			Thread.sleep(1000);
			Commonsteps.I_click("LoadMore");
			Thread.sleep(3000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the LoadMore");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the LoadMore" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Test(priority = 7, enabled = false)
	public void TC_68546_nextRunTimeChnageForScheduleScripts() throws Exception {
		logger = report.startTest("TC_68546_nextRunTimeChnageForScheduleScripts");

		try {
			//Commonsteps.mousehover("schedules");
			Thread.sleep(1000);
			Commonsteps.I_click("schedules");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the schedules");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the schedules" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			//Commonsteps.mousehover("schedulesRow");
			Thread.sleep(1000);
			Commonsteps.I_click("schedulesRow");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the schedulesRow");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the schedulesRow" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("editScheduleScript");
			Thread.sleep(1000);
			Commonsteps.I_click("editScheduleScript");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the editScheduleScript");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the editScheduleScript" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}

		try {
			Commonsteps.mousehover("scriptsNextRunCalendar");
			Thread.sleep(1000);
			Commonsteps.I_click("scriptsNextRunCalendar");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the scriptsNextRunCalendar");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the scriptsNextRunCalendar" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("scriptsCalendarDate");
			Thread.sleep(1000);
			Commonsteps.I_click("scriptsCalendarDate");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the scriptsCalendarDate");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the scriptsCalendarDate" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("scriptsNextRunTime");
			Thread.sleep(1000);
			Commonsteps.I_click("scriptsNextRunTime");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the scriptsNextRunTime");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the scriptsNextRunTime" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("scriptsCalendarTime");
			Thread.sleep(1000);
			Commonsteps.I_click("scriptsCalendarTime");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the scriptsCalendarTime");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the scriptsCalendarTime" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("scriptApply");
			Thread.sleep(1000);
			Commonsteps.I_click("scriptApply");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the scriptApply");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the scriptApply" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Test(priority = 8, enabled = true)
	public void TC_68550_scheduleScriptRecurrence() throws Exception {
		logger = report.startTest("TC_68550_scheduleScriptRecurrence");

		try {
			//Commonsteps.mousehover("schedules");
			Thread.sleep(1000);
			Commonsteps.I_click("schedules");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the schedules");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the schedules" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("editScheduleDetails");
			Thread.sleep(1000);
			Commonsteps.I_click("editScheduleDetails");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the editScheduleDetails");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the editScheduleDetails" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("instanceDetailsPassword");
			Thread.sleep(1000);
			Commonsteps.I_enter_in_field("Venkatesh@123","instanceDetailsPassword");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to enter the instanceDetailsPassword");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to enter the instanceDetailsPassword" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("scriptDetailsNext");
			Thread.sleep(1000);
			Commonsteps.I_click("scriptDetailsNext");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the scriptDetailsNext");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the scriptDetailsNext" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("scriptDetailsNext");
			Commonsteps.I_click("scriptDetailsNext");
			Thread.sleep(3000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the scriptDetailsNext");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the scriptDetailsNext" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		
		try {
//			Commonsteps.explicityWaittoClick("updateScheduleRun");
			Commonsteps.dropdownwitname("updateScheduleRun", "Monthly");
			Thread.sleep(3000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the updateScheduleRun");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the updateScheduleRun" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("updateScripts");
			Thread.sleep(1000);
			Commonsteps.I_click("updateScripts");
			Thread.sleep(4000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the updateScripts");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the updateScripts" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		
		try {
			Commonsteps.mousehover("okButton");
			Thread.sleep(1000);
			Commonsteps.I_click("okButton");
			Thread.sleep(4000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click on the okButton");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click on the okButton" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Test(priority = 9, enabled = true)
	public void TC_68536_deleteScriptsSchedule() throws Exception {
		logger = report.startTest("TC_68536_deleteScriptsSchedule");

		try {
			Commonsteps.mousehover("deleteScripts");
			Thread.sleep(1000);
			Commonsteps.I_click("deleteScripts");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the deleteScripts");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the deleteScripts" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("okButton");
			Thread.sleep(1000);
			Commonsteps.I_click("okButton");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click on the okButton");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click on the okButton" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Test(priority = 10, enabled = true)
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
