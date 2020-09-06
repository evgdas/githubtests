package utils.helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import utils.drivers.CustomWebDriver;

import static org.openqa.selenium.logging.LogType.BROWSER;
import static utils.helpers.EnvironmentHelper.isWeb;

public class DriverHelper {

    public static void configSelenide() {
        if (isWeb) {
              Configuration.browser = CustomWebDriver.class.getName();
              Configuration.timeout = 5000;
         //     Configuration.holdBrowserOpen=true;
        }
    }

    public static String getConsoleLogs() {
        return String.join("\n", Selenide.getWebDriverLogs(BROWSER));
    }
}