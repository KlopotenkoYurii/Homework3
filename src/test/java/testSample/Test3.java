package testSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test3 {
    private WebDriver driver;

    @BeforeClass
    public void setup(){
        String property = System.getProperty("user.dir") + "/ChromeDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        driver = new ChromeDriver();
        Reporter.setEscapeHtml(false);
    }

    @Test
    public void navigate() throws InterruptedException {
        driver.navigate().to("https://www.bing.com/");
        WebElement image = driver.findElement(By.id("scpl1"));


        Thread.sleep(3000);
        image.click();

    }

    @AfterClass
    public  void tearDown(){
        driver.quit();
    }
}