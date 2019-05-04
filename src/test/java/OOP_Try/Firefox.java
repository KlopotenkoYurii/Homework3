package OOP_Try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Firefox {
    private WebDriver driver;

    public static void main(String[] args) {
       /* String property = System.getProperty("user.dir") + "/Gecodriver/gecodriver.exe";
        System.setProperty("webdriver.gecodriver", property);
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.bing.com/");
    */

        try {
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
          //  driver = new RemoteWebDriver(new URL("http://localhost/wd/hub"), capabilities);
        }catch (Exception e) {
            e.printStackTrace();
            throw new SkipException("Unable to create RemoteWebDriver instance");
        }
        String property = System.getProperty("user.dir") + "/ChromeDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com/");
    }

    @BeforeClass
    public void setup() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        driver = new ChromeDriver(capabilities);
       /* try {
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            driver = new RemoteWebDriver(new URL("http://localhost/wd/hub"), capabilities);
        }catch (Exception e) {
            e.printStackTrace();
            throw new SkipException("Unable to create RemoteWebDriver instance");
        }
        */
    }

    @Test
    public void tests() {
        driver.navigate().to("http://www.google.com");
    }

    @AfterClass
    public void tearDown() {
        // driver.quit();
    }
}
