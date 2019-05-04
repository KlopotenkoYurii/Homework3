package testSample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

@SuppressWarnings("deprecation")
public class TestNG {

    @BeforeTest
    public void setUp() {
        System.out.println("Before test execution");
    }

    @BeforeMethod
    public void prepareEnvironment() {
        System.out.println("Before each test method");
    }

    @AfterMethod
    public void clearEnvironment() {
        System.out.println("After each test method");
    }

    @Test
    public void test1() {
        System.out.println("Open bing site #1");
    }

    @Test
    public void test2() {
        System.out.println("Open google site #2");
    }

    @Test
    public void test3() {
        System.out.println("Open image list #3");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("After test execution");
    }
}