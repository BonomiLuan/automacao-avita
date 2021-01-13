package util;

import org.openqa.selenium.WebDriver;

public class WebDriverUtil {

	public static WebDriver webDriver;

	public static WebDriver getWebDriver() {
		return webDriver;
	}

	public static void setWebDriver(WebDriver webDriver) {
		WebDriverUtil.webDriver = webDriver;
	}
}
