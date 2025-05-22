package tests.day13_fileTestleri;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

public class C01_FakerIle_TabloDoldurma extends TestBase_Each {

    @Test
    public void test01() {

        //1- https://www.testotomasyonu.com adresine gidelim
        driver.get("https://www.testotomasyonu.com");
        ReusableMethods.bekle(2);

        //2- Account linkine tiklayin
        driver.findElement(By.xpath("(//span[@class='menu-icon-text'])[1]"))
                .click();
        ReusableMethods.bekle(2);
        //3- Sign Up linkine basalim
        driver.findElement(By.xpath("//*[.=' Sign Up']")).click();
        ReusableMethods.bekle(13);

        //4- Ad, soyad, mail ve sifre kutularina deger yazalim ve Sign Up butonuna basalim
        WebElement firstnameKutusu = driver.findElement(By.id("firstName"));

        Actions actions = new Actions(driver);
       Faker faker = new Faker();

        ReusableMethods.bekle(12);

        String fakeSifre = faker.internet().emailAddress();

        actions.click(firstnameKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(fakeSifre)
                .sendKeys(Keys.TAB)
                .sendKeys(fakeSifre)
                .perform();
        ReusableMethods.bekle(13);


        driver.findElement(By.xpath("//*[@id='btn-submit-form']"))
                .click();
        ReusableMethods.bekle(13);


        //5- Kaydin olusturuldugunu test edin
        //   kayit olusturunca bizi login sayfasina yonlendiriyor
        //   ama account butonuna basinca giris yapildigini goruyoruz

        driver.findElement(By.xpath("//span[.='Account']"))
                .click();

        // logout butonunun gorunur olmasi ile test edelim
        WebElement logoutButonu = driver.findElement(By.xpath("//span[.='Logout']"));

        Assertions.assertTrue(logoutButonu.isDisplayed());

        ReusableMethods.bekle(2);
    }
}
