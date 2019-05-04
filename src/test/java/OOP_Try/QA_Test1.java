package OOP_Try;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class QA_Test1 {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        String property = System.getProperty("user.dir") + "/ChromeDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        DesiredCapabilities capabilities2 = DesiredCapabilities.firefox();
            capabilities2.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    }

    @DataProvider(name = "TestData")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Natali", "18years"},
                {"Pavel", "WWWW"},
                {"Markus", "EEEE"},
                {"Yura", "20years"}
        };
        return data;

    }

    @Test(dataProvider = "TestData")
    public void test2(String name, String xz) throws InterruptedException {
        driver.navigate().to("http://www.google.com");
            driver.findElement(By.name("q")).sendKeys(name);
                Thread.sleep(1000);

        //WebElement elem = (WebElement) driver.findElements(By.xpath("//*[text()='on']"));
        //System.out.println("qqqqqqqq: " + elem);
        //Select Drop = new Select(elem);
        //Drop.selectByValue("automation");
        //System.out.println(Drop);

        driver.findElement(By.name("btnK")).click();
            Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys(xz);
            driver.findElement(By.className("Tg7LZd")).click();

        System.out.println("This is name: " + name);
            Thread.sleep(1000);
    }

    /*@DataProvider(name = "CalaCSVData")
    public Object[][] dataProvider() throws Exception {
        String[][] myData = utils.ReadTXT.ReadFromFile("./ReadFrom/TestFile.txt");
        return myData;
    }
*/
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
