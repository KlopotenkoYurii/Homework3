package OOP_Try;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestGRID {
    public WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setPlatform(Platform.WIN10);
        //capabilities.setBrowserName("firefox");
        //capabilities.setVersion("66.0.3");
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
    }
    @Test
    public void neev () {
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("name");
    }

    @AfterClass
    public void tearDown() throws Exception{
    }

}

