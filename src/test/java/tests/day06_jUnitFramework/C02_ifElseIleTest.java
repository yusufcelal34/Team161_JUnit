package tests.day07_assertions.day06_jUnitFramework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ifElseIleTest {

    @Test
    public void testotomasyonuTesti(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // testotomasyonu sitesine gidin
        driver.get("https://testotomasyonu.com");

        // url'in testotomasyonu icerdigini test edin
        String actualUrl = driver.getCurrentUrl();
        String expectedUrlIcerik = "testotomasyonu";

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Testotomasyonu testi PASSED");
        } else System.out.println("Testotomasyonu testi FAILED");

        driver.quit();

    }

    @Test
    public void wisequarterTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        // wisequarter sitesine gidin
        driver.get("https://wisequarter.com");

        // title'in Wise Quarter icerdigini test edin

        String actualTitle = driver.getTitle();
        String expectedTitleIcerik = "Wise Quarter";

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Wise Quarter testi PASSED");
        } else System.out.println("Wise Quarter testi FAILED");

        driver.quit();
    }

    @Test
    public void youtubeTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // YouTube sitesine gidin
        driver.get("https://youtube.com");

        // title'in Youtube oldugunu test edin
        String actualTitle = driver.getTitle();
        String expectedTitle = "Youtube";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("YouTube testi PASSED");
        } else System.out.println("YouTube testi FAILED");

        driver.quit();
    }

}

