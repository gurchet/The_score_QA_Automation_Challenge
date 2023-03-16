package test.mobile.score_qa_automation_challenge.base;

import java.net.URL;
import java.util.HashMap;
import java.util.Map.Entry;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import test.mobile.score_qa_automation_challenge.base.Constants.Platform;
import test.mobile.score_qa_automation_challenge.utilities.PropertiesUtils;

/**
 * @author gurchet.singh
 * @since 15 March 2023 Description : This file is responsible to create and
 *        maintain the AppiumDriver
 */

public class DriverManager {

	private static HashMap<Long, AppiumDriver> drivers = new HashMap<Long, AppiumDriver>();

	public static AppiumDriver getAppiumDriver(Platform platform) throws Exception {

		Long desiredKey = Thread.currentThread().getId();
		for (Entry<Long, AppiumDriver> entry : drivers.entrySet()) {
			if (desiredKey == entry.getKey())
				return entry.getValue();
		}

		String appiumHostUrl = PropertiesUtils.get("appium_host_url");

		// Switch case to identify the platform and building the driver accordingly
		switch (platform) {
		case Android:
			AndroidDriver androidDriver = new AndroidDriver(new URL(appiumHostUrl),
					DeviceManager.getAvailableAndroidDevice().getCapabilities());
			//using the current thread id to tie the drivers with the test scenario threads
			drivers.put(Thread.currentThread().getId(), androidDriver);
			return androidDriver;
		case iOS:
			IOSDriver iOSDriver = new IOSDriver(new URL(appiumHostUrl),
					DeviceManager.getAvailableAndroidDevice().getCapabilities());
			drivers.put(Thread.currentThread().getId(), iOSDriver);
			return iOSDriver;
		default:
			return null;

		}

	}

}
