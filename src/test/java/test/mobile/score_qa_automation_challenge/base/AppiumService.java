package test.mobile.score_qa_automation_challenge.base;

import test.mobile.score_qa_automation_challenge.utilities.CommandRunner;
import test.mobile.score_qa_automation_challenge.utilities.PortUtils;
import test.mobile.score_qa_automation_challenge.utilities.PropertiesUtils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author gurchet.singh
 * @since 18 March 2023
 * @description This Class is created to handle Appium service. ie auto start, auto stop appium service
 */

public class AppiumService {
    private static int portNumber;

    public static void startAppiumDriverService() throws IOException {
        if(PropertiesUtils.get("appium_auto_run").equals("false")){
            portNumber = Integer.parseInt(PropertiesUtils.get("ports").split(",")[0]);
            return;
        }

        System.out.println(String.format("Starting Appium server"));
        portNumber = PortUtils.getAvailablePort();
        Runtime.getRuntime().exec("appium -p "+portNumber);
    }

    public static void stopAppiumDriverService() throws IOException {
        if(PropertiesUtils.get("appium_auto_run").equals("false")) {
            return;
        }

        try {
            CommandRunner.runSyncCommand("kill -9 "+portNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static URL getAppiumServerUrl() throws MalformedURLException {
        return new URL(PropertiesUtils.get("appium_host_url") + ":"+portNumber+"/wd/hub/");
    }
}