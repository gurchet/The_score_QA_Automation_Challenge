package test.mobile.score_qa_automation_challenge.page_objects.common;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import test.mobile.score_qa_automation_challenge.base.DriverManager;
import test.mobile.score_qa_automation_challenge.base.Constants.DevicePlatform;

/**
 * @author gurchet.singh
 * @since 15 March 2023
 * @description : This class is a base for page objects, this class keep
 *              the current state of the driver and perform necessary actions
 *              upon page object elements
 */

public class BasePage {

	AppiumDriver driver;

	public BasePage() {
		this.driver = DriverManager.getAppiumDriver();
	}

	public void click(By by) {
		driver.findElement(by).click();
	}

	public void sendKeys(By by, String text) {
		driver.findElement(by).sendKeys(text);
	}

	public String waitAndExtractText(By by) {
		return driver.findElement(by).getText();
	}

}
