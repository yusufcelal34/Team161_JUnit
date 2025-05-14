package tests.day07_assertions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03a_Assertions {

    // https://www.bestbuy.com/ Adresine gidin
    // farkli test method’lari olusturarak asagidaki testleri yapin
    //	○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
    //	○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    //	○ logoTest => BestBuy logosunun görüntülendigini test edin
    //	○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin

    static WebDriver driver;

    @BeforeAll
    static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bestbuy.com");
    }

    @AfterAll
    static void teardown(){
        driver.quit();
    }

    @Test
    public void test01() {

        String expectedUrl = "https://www.bestbuy.com/";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Url testi PASSED");
        } else {
            System.out.println("Url testi FAILED");
        }
    }

        @Test
        public void test02() {

            String actualTitle = driver.getTitle();
            String unexpectedTitle = "Rest";

            if (!actualTitle.contains(unexpectedTitle)) {
                System.out.println("Title testi PASSED");
            } else {
                System.out.println("Title testi FAILED");
            }
        }

        @Test
        public void test03(){

            WebElement logoElementi = driver.findElement(By.xpath("(//img[@alt='Best Buy Logo'])[1]"));
            System.out.println(logoElementi.isDisplayed() ? "Logo testi PASSED" : "Logo testi FAILED");
        }


}
