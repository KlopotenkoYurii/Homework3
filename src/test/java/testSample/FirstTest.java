package testSample;


import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstTest {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        String property = System.getProperty("user.dir") + "/ChromeDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
        public void test1() throws InterruptedException {
            driver.navigate().to("https://www.bing.com/");
            WebElement image = driver.findElement(By.id("scpl1"));
            Thread.sleep(3000);
            image.click();

            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            System.out.println("Name of all load image after DropDown list" + driver.findElements(By.xpath("//div[@class='img_cont hoff']")));
            Thread.sleep(5000);

            jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
            System.out.println("Name of all load image after DropDown list2" + driver.findElements(By.xpath("//div[@class='img_cont hoff']")));

            WebElement image2 = driver.findElement(By.xpath("//div[@class='img_cont hoff']//img[@data-bm='43']"));
        image2.click();
        Thread.sleep(2000);

        //for(int i=20;i<30;i++){
        //List<WebElement> x = driver.findElements(By.xpath("//div[@class='imgContainer']"));

    }
       /*
        @Test
        public void navigate2() {
            driver.navigate().to("https://www.google.com/");
            List<WebElement> x = driver.findElements(By.name("q"));
            x.get(12).click();
        }

        @Test(dataProvider = "system-properties")
        public void testGoogle(ChromeDriver selenium) throws Throwable {
            selenium = new ChromeDriver();
            selenium.get("http://www.google.com/webhp?hl=en");
            assertEquals(selenium.getTitle(), "Google");
            selenium.type("q", "Selenium OpenQA");
            assertEquals(selenium.getValue("q"), "Selenium OpenQA");
            selenium.click("btnG");
            selenium.waitForPageToLoad("5000");
            assertEquals(selenium.getTitle(), "Selenium OpenQA - Google Search");
        }
        */
        @AfterClass
    public  void tearDown(){
    }

}


