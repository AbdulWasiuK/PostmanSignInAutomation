package SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignIntests {

    private static WebDriver driver;

    // import chromeDriver
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\23490\\Desktop\\Postman\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Input project URL = Postman Sign In page URL

        driver.get("https://identity.getpostman.com/login?addAccount=1");
        // Global Waiting period
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Maximize the window

        driver.manage().window().maximize();
        // Get page title
        System.out.println(driver.getTitle());

        // locate username field
        driver.findElement(By.id("username")).sendKeys("kuforijiabdulwasiu@gmail.com");
        // locate the password field
        driver.findElement(By.id("password")).sendKeys("kilani123");
        // click on the log in button
        driver.findElement(By.id("sign-in-btn")).click();
        Thread.sleep (10000);

        driver.quit ();
}
    // initiate the test run command
    public static void main(String args[]) throws InterruptedException {
        SignIntests test = new SignIntests ();
        test.setUp();
    }

}
