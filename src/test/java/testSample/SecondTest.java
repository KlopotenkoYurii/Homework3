package testSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SecondTest {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        String property = System.getProperty("user.dir") + "/ChromeDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    /*
        @Test
        public void test1() {
            driver.navigate().to("http://www.google.com");
            WebElement search = driver.findElement(By.name("q"));
            search.sendKeys("hotel");
            search.click();
            System.out.print("This is search element" + search);
        }
        */
    @Test
    public void test2()throws InterruptedException {
        driver.navigate().to("http://www.bing.com");
        WebElement search2 = driver.findElement(By.id("scpl1"));
        search2.click();
        Thread.sleep(3000);
        System.out.print("This is search2 element" + search2);


    }

    @Test
    public void test3() {
        driver.navigate().to("https://www.bing.com/images/discover?form=Z9LH1");
        WebElement search3 = driver.findElement(By.className("q"));
        search3.sendKeys("master");
        search3.click();
    }

    @SuppressWarnings("deprecation")
    /*@DataProvider(name = "CalaCSVData")

    public Object[][] dataProvider() throws Exception {

        String[][] myData = utils.ReadTXT.ReadFromFile("./ReadFrom/TestFile.txt");

        return myData;
    }
    @Test
        public void test3 (){
        System.out.print("End of our test");
    }
*/
    @AfterClass
    public void tearDown() {
        //    driver.quit();
    }
}
