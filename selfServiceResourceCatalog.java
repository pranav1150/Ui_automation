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

public class selfServiceResourceCatalog extends corestack {

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
	public void TC_39714_selfServiceresourceCatalogValidImageIDVisible() throws Exception {
		logger = report.startTest("TC_39714_selfServiceresourceCatalogValidImageIDVisible");

		try {
			Commonsteps.mousehover("settings");
			Thread.sleep(2000);
			Commonsteps.I_click("settings");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to hover on the settings");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to hover on the settings" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("resourceCatalog");
			Thread.sleep(1000);
			Commonsteps.I_click("resourceCatalog");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the resourceCatalog");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the resourceCatalog" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.dropdownwitname("selectCloud", "AWS");
			Thread.sleep(1000);
			//Commonsteps.I_click("preferences");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to navigate and selectCloud");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to navigate and selectCloud" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		
		try {
			Commonsteps.dropdownwitname("selectCategory", "Compute");
			Thread.sleep(1000);
			//Commonsteps.I_click("preferences");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to navigate and selectCategory");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to navigate and selectCategory" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("virtualMachine");
			Thread.sleep(1000);
			Commonsteps.I_click("virtualMachine");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the virtualMachine");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the virtualMachine" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("virtualMachineOSVersion");
			Thread.sleep(1000);
			Commonsteps.I_click("virtualMachineOSVersion");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the virtualMachineOSVersion");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the virtualMachineOSVersion" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("virtualMachineOSVersionAddNew");
			Thread.sleep(1000);
			Commonsteps.I_click("virtualMachineOSVersionAddNew");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the virtualMachineOSVersionAddNew");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the virtualMachineOSVersionAddNew" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("selectCloudAccOSVersion");
			Thread.sleep(1000);
			Commonsteps.I_click("selectCloudAccOSVersion");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the selectCloudAccOSVersion");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the selectCloudAccOSVersion" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("AWSselectCloudAccOSVersion");
			Thread.sleep(1000);
			Commonsteps.I_click("AWSselectCloudAccOSVersion");
			Thread.sleep(3000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the AWSselectCloudAccOSVersion");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the AWSselectCloudAccOSVersion" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		
		try {
			Commonsteps.mousehover("imageTypeOSVersion");
			Thread.sleep(1000);
			Commonsteps.I_click("imageTypeOSVersion");
			Thread.sleep(3000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the imageTypeOSVersion");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the imageTypeOSVersion" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		
		try {
			Commonsteps.dropdownwitname("scopeOSVersion", "Tenant");
			Thread.sleep(3000);
			//Commonsteps.I_click("preferences");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to navigate and selectCategory");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to navigate and selectCategory" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		

		try {
			Commonsteps.I_enter_in_field("ami-0c7217cdde317cfec", "imageIDOSVersion");
			Thread.sleep(2000);
			//Commonsteps.I_click("settings");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to hover on the imageIDOSVersion");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to hover on the imageIDOSVersion" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("imageIDPlayButton");
			Thread.sleep(1000);
			//Commonsteps.I_click("imageIDPlayButton");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the imageIDPlayButton");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the imageIDPlayButton" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("cancelCatalog");
			Thread.sleep(1000);
			Commonsteps.I_click("cancelCatalog");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the cancelCatalog");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the cancelCatalog" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		
	}
	
	
	@Test(priority = 3, enabled = true)
	public void TC_39719_selfServiceresourceCatalogValidImageID() throws Exception {
		logger = report.startTest("TC_39719_selfServiceresourceCatalogValidImageID");
		
		try {
			Commonsteps.mousehover("vmSizeVirtualMachine");
			Thread.sleep(1000);
			Commonsteps.I_click("vmSizeVirtualMachine");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the vmSizeVirtualMachine");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the vmSizeVirtualMachine" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("virtualMachineOSVersion");
			Thread.sleep(1000);
			Commonsteps.I_click("virtualMachineOSVersion");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the virtualMachineOSVersion");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the virtualMachineOSVersion" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("virtualMachineOSVersionAddNew");
			Thread.sleep(1000);
			Commonsteps.I_click("virtualMachineOSVersionAddNew");
			Thread.sleep(2000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the virtualMachineOSVersionAddNew");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the virtualMachineOSVersionAddNew" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("selectCloudAccOSVersion");
			Thread.sleep(1000);
			Commonsteps.I_click("selectCloudAccOSVersion");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the selectCloudAccOSVersion");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the selectCloudAccOSVersion" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("AWSselectCloudAccOSVersion");
			Thread.sleep(1000);
			Commonsteps.I_click("AWSselectCloudAccOSVersion");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the AWSselectCloudAccOSVersion");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the AWSselectCloudAccOSVersion" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("imageTypeOSVersion");
			Thread.sleep(1000);
			Commonsteps.I_click("imageTypeOSVersion");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the imageTypeOSVersion");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the imageTypeOSVersion" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		
		try {
			Commonsteps.dropdownwitname("scopeOSVersion", "Tenant");
			Thread.sleep(1000);
			//Commonsteps.I_click("preferences");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to navigate and selectCategory");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to navigate and selectCategory" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		

		try {
			Commonsteps.I_enter_in_field("ami-0c7217cdde317cfec", "imageIDOSVersion");
			Thread.sleep(2000);
			//Commonsteps.I_click("settings");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to hover on the imageIDOSVersion");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to hover on the imageIDOSVersion" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("imageIDPlayButton");
			Thread.sleep(1000);
			Commonsteps.I_click("imageIDPlayButton");
			Thread.sleep(3000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the imageIDPlayButton");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the imageIDPlayButton" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("cancelCatalog");
			Thread.sleep(1000);
			Commonsteps.I_click("cancelCatalog");
			Thread.sleep(3000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the cancelCatalog");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the cancelCatalog" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Test(priority = 4, enabled = true)
	public void TC_39715_selfServiceresourceCatalogInvalidImageID() throws Exception {
		logger = report.startTest("TC_39715_selfServiceresourceCatalogInvalidImageID");
		
		try {
			Commonsteps.mousehover("virtualMachineOSVersionAddNew");
			Thread.sleep(1000);
			Commonsteps.I_click("virtualMachineOSVersionAddNew");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the virtualMachineOSVersionAddNew");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the virtualMachineOSVersionAddNew" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("selectCloudAccOSVersion");
			Thread.sleep(1000);
			Commonsteps.I_click("selectCloudAccOSVersion");
			Thread.sleep(3000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the selectCloudAccOSVersion");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the selectCloudAccOSVersion" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("AWSselectCloudAccOSVersion");
			Thread.sleep(1000);
			Commonsteps.I_click("AWSselectCloudAccOSVersion");
			Thread.sleep(3000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the AWSselectCloudAccOSVersion");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the AWSselectCloudAccOSVersion" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("imageTypeOSVersion");
			Thread.sleep(1000);
			Commonsteps.I_click("imageTypeOSVersion");
			Thread.sleep(3000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the imageTypeOSVersion");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the imageTypeOSVersion" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		
		try {
			Commonsteps.dropdownwitname("scopeOSVersion", "Tenant");
			Thread.sleep(3000);
			//Commonsteps.I_click("preferences");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to navigate and selectCategory");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to navigate and selectCategory" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		

		try {
			Commonsteps.I_enter_in_field("ami-0c7217fec", "imageIDOSVersion");
			Thread.sleep(3000);
			//Commonsteps.I_click("settings");
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to hover on the imageIDOSVersion");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to hover on the imageIDOSVersion" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.mousehover("imageIDPlayButton");
			Thread.sleep(1000);
			Commonsteps.I_click("imageIDPlayButton");
			Thread.sleep(3000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to click to the imageIDPlayButton");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to click to the imageIDPlayButton" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
		try {
			Commonsteps.I_should_see_in_page("imageIDOSVersionError");
			Thread.sleep(1000);
			//String logout1 = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.PASS, "User able to view the error message with invalid imageID");

		} catch (Exception e) {
			String logout = CaptureScreenshotAsBase64(StepBase.driver, "Dashboard Load");
			logger.log(LogStatus.FAIL,
					"User not able to view the error message with invalid imageID" + logger.addBase64ScreenShot(logout));
			e.printStackTrace();
			throw e;
		}
		
	}
	
	
	@Test(priority = 5, enabled = true)
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
