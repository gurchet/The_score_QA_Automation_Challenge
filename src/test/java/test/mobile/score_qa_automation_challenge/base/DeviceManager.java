package test.mobile.score_qa_automation_challenge.base;

import org.openqa.selenium.remote.DesiredCapabilities;

import test.mobile.score_qa_automation_challenge.utilities.CapabilitiesProvider;
import test.mobile.score_qa_automation_challenge.utilities.DeviceUtils;
import test.mobile.score_qa_automation_challenge.utilities.PropertiesUtils;

import java.io.IOException;

/**
 * @author gurchet.singh
 * @since 15 March 2023
 * @description : This Class is built to manage the devices
 */

public class DeviceManager {

	// This method returns the available android device
	public static Device getAvailableDevice() {

		for (String deviceName : DeviceUtils.getListOfConnectedDevices()) {
			try {
				DesiredCapabilities capabilities = CapabilitiesProvider.get(deviceName);

				if (capabilities != null) {
					String platform = capabilities.getCapability("platformName").toString();

					// To check if platform of the device is expected
					if (platform.equalsIgnoreCase(PropertiesUtils.get("platform"))) {
						// send the device object back to the caller
						return new Device(deviceName, platform, true, capabilities);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return null;
	}


	public static void installApp(Device device) throws IOException {
		if(PropertiesUtils.get("app_auto_install").equals("false"))
			return;
		DeviceUtils.installAppOnDevice(device.getName(), System.getProperty("user.dir") + "/" + PropertiesUtils.get("app_path"));
	}
	}
