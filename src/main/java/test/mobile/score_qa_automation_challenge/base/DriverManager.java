package test.mobile.score_qa_automation_challenge.base;

import java.net.URL;
import java.util.Objects;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import test.mobile.score_qa_automation_challenge.utilities.CapabilitiesReader;
import test.mobile.score_qa_automation_challenge.utilities.PropertiesUtils;

/**
 * @author gurchet.singh
 * @since 15 March 2023 Description : This file is responsible to create and
 *        maintain the AppiumDriver
 */

public class DriverManager {

	private static AppiumDriver driver;

	public static AppiumDriver getAppiumDriver() throws Exception {
		if (Objects.nonNull(driver))
			return driver;
		else {
			String capabilitiesPath = "config/capabilities.json";
			DesiredCapabilities capabilities = CapabilitiesReader
					.getDesiredCapabilities(PropertiesUtils.get("device_name"), capabilitiesPath);
			driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			return driver;
		}
	}

	public static void quit() {
		if (Objects.nonNull(driver)) {
			driver.quit();
		}
	}
}
