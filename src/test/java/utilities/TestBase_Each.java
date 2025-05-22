package utilities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class TestBase_Each {

    protected WebDriver driver;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        //driver = new EdgeDriver();
        //driver = new FirefoxDriver();
        //driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterEach
    public void teardown(){
        driver.quit();
    }
}