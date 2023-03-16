package test.mobile.score_qa_automation_challenge.base;

import org.openqa.selenium.remote.DesiredCapabilities;

import test.mobile.score_qa_automation_challenge.utilities.CapabilitiesProvider;
import test.mobile.score_qa_automation_challenge.utilities.DeviceUtils;


/**
 * @author gurchet.singh
 * @since 15 March 2023 Description : This Class is built to manage the devices
 */



public class DeviceManager {

	//This method returns the available android device
	public static Device getAvailableAndroidDevice() {
		for(String deviceName : DeviceUtils.getListOfConnectedDevices()) {
			
			try {
				DesiredCapabilities capabilities = CapabilitiesProvider.get(deviceName);
				if(capabilities != null){
					if(capabilities.getCapability("platformName").equals("Android")) {
						return new Device(deviceName, "Android", true, capabilities);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return null;
		
	}
	
	
	//This method returns the available iOS device
	public static Device getAvailableiOSDevice() {
		for(String deviceName : DeviceUtils.getListOfConnectedDevices()) {
			
			try {
				DesiredCapabilities capabilities = CapabilitiesProvider.get(deviceName);
				if(capabilities != null){
					if(capabilities.getCapability("platformName").equals("iOS")) {
						return new Device(deviceName, "iOS", true, capabilities);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return null;
		
	}
	
}
