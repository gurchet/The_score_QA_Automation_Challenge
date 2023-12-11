package test.mobile.score_qa_automation_challenge.base;

import org.openqa.selenium.remote.DesiredCapabilities;

import test.mobile.score_qa_automation_challenge.utilities.CapabilitiesProvider;
import test.mobile.score_qa_automation_challenge.utilities.PropertiesUtils;

/**
 * @author gurchet.singh
 * @description : This Class is built to manage the devices
 * @since 15 March 2023
 */

public class DeviceManager {

    // This method build and returns device object
    public static Device getDevice() {
        String deviceName = PropertiesUtils.get("deviceName");
        try {
            DesiredCapabilities capabilities = CapabilitiesProvider.get(deviceName);
            if (capabilities != null) {
                    // send the device object back to the caller
                    return new Device(deviceName, true, capabilities);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
