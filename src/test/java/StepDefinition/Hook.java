package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hook {
    public static WebDriver driver= null;

    @Before
    public static void openChrome() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @After
    public static void CloseBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
