package tests.day06_jUnitFramework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ifElseIleTest {


    @Test
    public void testotomasyonuTesti() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testotomasyonu.com");
        String actualUrl = driver.getCurrentUrl();
        String expectedUrlIcerik = "testotomasyonu";

        if (actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("Url testi PASSED");
        } else {
            System.out.println("Url testi FAILED");
        }
        // testotomasyonu sitesine gidin

        // url'in testotomasyonu icerdigini test edin
    }

    @Test
    public void wisequarterTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.wisequarter.com");
        String actualTitle = driver.getTitle();
        String expectedTitleIcerik = "Wise Quarter";
        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title testi FAILED");
        }

        // wisequarter sitesine gidin
        // title'in Wise Quarter icerdigini test edin
    }

    @Test
    public void youtubeTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "YouTube";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Youtube testi PASSED");
        } else {
            System.out.println("Youtube testi FAILED");
        }
        // YouTube sitesine gidin
        // title'in Youtube oldugunu test edin
    }

}

