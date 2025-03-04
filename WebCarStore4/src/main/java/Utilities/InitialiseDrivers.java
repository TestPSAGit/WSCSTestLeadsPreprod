/*
 * Creation : 28 mars 2019
 */
package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InitialiseDrivers {

    static WebDriver driver;

    @SuppressWarnings("deprecation")
    public static WebDriver InitialiseChromDriver() {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--headless");
        options.addArguments("--ignore-certificate-errors");
        // options.addArguments("headless");
        // Proxy proxy = new Proxy();
        // proxy.setHttpProxy("http.ntlm.internetpsa.inetpsa.com:8080");
        // options.setCapability("proxy", proxy);
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\E562418\\Desktop\\WSCS Selenium\\WebCarStore4\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver(capabilities);

        return driver;
    }

    public static WebDriver InitialiseFirefoxDriver() {

        System.setProperty("webdriver.gecko.driver", "\\Drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver InitialiseIEDriver() {
        System.setProperty("webdriver.ie.driver", "C:\\Users\\E562418\\git\\WSCSAutomatisation\\WebCarStore4\\Drivers\\IEDriverServer.exe");

        driver = new InternetExplorerDriver();
        return driver;
    }
}
