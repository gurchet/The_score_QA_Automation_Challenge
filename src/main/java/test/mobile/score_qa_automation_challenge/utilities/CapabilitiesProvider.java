package test.mobile.score_qa_automation_challenge.utilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesProvider {
	static String PATH = "config/capabilities.json"; 		String appiumHostUrl = PropertiesUtils.get("capabilities_url");

	public static DesiredCapabilities get(String deviceName) throws Exception {
		DesiredCapabilities capabilities = CapabilitiesReader.getDesiredCapabilities(deviceName,
				PATH);
		return capabilities;
	}
}
