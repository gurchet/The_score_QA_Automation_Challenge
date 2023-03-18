package test.mobile.score_qa_automation_challenge.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import test.mobile.score_qa_automation_challenge.utilities.PropertiesUtils;

/**
 * @author gurchet.singh
 * @since 15 March 2023 Description : This file is responsible to create and
 *        maintain the AppiumDriver
 */

public class DriverManager {

	private static HashMap<Long, AppiumDriver> drivers = new HashMap<Long, AppiumDriver>();

	public static AppiumDriver getAppiumDriver() {

		Long desiredKey = Thread.currentThread().getId();
		for (Entry<Long, AppiumDriver> entry : drivers.entrySet()) {
			if (desiredKey == entry.getKey())
				return entry.getValue();
		}

		URL url;
		try {
			url = new URL(PropertiesUtils.get("appium_host_url"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		Device device = DeviceManager.getAvailableDevice();
		if(Objects.isNull(device)){
			System.out.println("No connected device found");
			return null;
		}

		DesiredCapabilities capabilities = device.getCapabilities();
		if(Objects.isNull(capabilities)) {
			System.out.println("No capabilities found for the device "+device.getName());
			return null;
		}

		AppiumDriver driver = new AppiumDriver(url, capabilities);

		// using the current thread id to tie the drivers with the test scenario threads
		drivers.put(Thread.currentThread().getId(), driver);
		return driver;

	}

}