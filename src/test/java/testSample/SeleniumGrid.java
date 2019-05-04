package testSample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/* public class Grid {
    static ChromeDriver driver;

    @BeforeClass
    public void setting (){
        String property = System.getProperty("user.dir") + "/ChromeDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capabilities.setCapability(CapabilityType.ENABLE_PROFILING_CAPABILITY, true);
        driver = new ChromeDriver(capabilities);
    }
    @Test
    public static void main(String[] args) {


    }
    @AfterClass
    public  void tearDown() {
        driver.quit();
    }

}
   */