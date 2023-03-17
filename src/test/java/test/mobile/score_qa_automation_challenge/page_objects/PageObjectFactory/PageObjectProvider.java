package test.mobile.score_qa_automation_challenge.page_objects.PageObjectFactory;

import test.mobile.score_qa_automation_challenge.base.Constants.DevicePlatform;
import test.mobile.score_qa_automation_challenge.utilities.PropertiesUtils;

/**
 * @author gurchet.singh
 * @since 15 March 2023 Description : This class identify the platform and
 *        returns the page object accordingly
 */

public class PageObjectProvider {

	public static Object getPageObject(String pageName) {
		switch (DevicePlatform.valueOf(PropertiesUtils.get("platform"))) {
		case ANDROID:
			try {
				return Class.forName(PropertiesUtils.get("android_page_objects_package") + "." + "Android_" + pageName)
						.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		case IOS:
			try {
				return Class.forName(PropertiesUtils.get("ios_page_objects_package") + "." + "IOS_" + pageName).newInstance();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		default:
			return null;
		}

	}

}
