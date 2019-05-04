import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import sun.management.counter.Counter;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.id;

public class HomeW3 {
    public static void main(String[] args) throws InterruptedException {

        String property = System.getProperty("user.dir") + "/ChromeDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
// first part
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com/");
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
// second part
        WebElement image = ((ChromeDriver) driver).findElementById("scpl1");
        image.click();
// thirty part
            driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
                    //Thread.sleep(3000);
         //System.out.print("Name of all images:" + driver.findElements(By.xpath("//div[@class='img_cont hoff']")));
                     // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
                   // Thread.sleep(3000);
        //System.out.print("New Image:" + driver.findElements(By.xpath("//div[@class='img_cont hoff']")));
        //Thread.sleep(3000);
        jse.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
  //6 part
        //WebElement seasch = ((ChromeDriver) driver).findElementByName("q");
       // seasch.sendKeys("hotel");
        WebElement serch4 = ((ChromeDriver) driver).findElementByXPath("//div[@class='img_cont hoff']");
        serch4.click();
 //4 part
       /* WebElement seasch = ((ChromeDriver) driver).findElementByName("q");
            seasch.sendKeys("hote");
            WebElement search2 = ((ChromeDriver) driver).findElement(By.xpath("//div[@vaelue='hotel']"));
            search2.click();
                Thread.sleep(3000);
                WebElement search3 = ((ChromeDriver) driver).findElement(By.xpath("//div[@aria-activedescendant='sa_5000']"));
                Thread.sleep(3000);
                search3.click();
        */


        /* boolean scrollResult = (boolean) jse.executeScript("var scrollBefore = $(window).scrollTop();" +
                "window.scrollTo(scrollBefore, document.body.scrollHeight);" +
                "return $(window).scrollTop() > scrollBefore;");
        */
        Thread.sleep(5000);
        //driver.quit();
    }
}