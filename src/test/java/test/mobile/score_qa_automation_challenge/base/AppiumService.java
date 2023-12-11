package test.mobile.score_qa_automation_challenge.base;
import test.mobile.score_qa_automation_challenge.utilities.CommandRunner;
import test.mobile.score_qa_automation_challenge.utilities.PortUtils;
import test.mobile.score_qa_automation_challenge.utilities.PropertiesUtils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * @author gurchet.singh
 * @description This Class is created to handle Appium service. ie auto start, auto stop appium service
 * @since 18 March 2023
 */

public class AppiumService {
    public static int portNumber = 4723;
    public static String host = "localhost";


    public static void startAppiumDriverService() throws IOException {
        System.out.println(String.format("Starting Appium server"));
        portNumber = PortUtils.getAvailablePort();
        host = PropertiesUtils.get("appium_host");
        Runtime.getRuntime().exec("appium -p " + portNumber);
    }

    public static void stopAppiumDriverService() throws IOException {
        try {
            CommandRunner.runSyncCommand("kill -9 " + portNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String getAppiumServerUrl() throws MalformedURLException {
        return "http://"+host+":"+portNumber+"/";
    }

}