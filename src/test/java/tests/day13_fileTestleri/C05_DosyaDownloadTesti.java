package tests.day13_fileTestleri;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

public class C05_DosyaDownloadTesti extends TestBase_Each {

    @Test
    public void test01() {

        //  1. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");


        //  2. logo.png dosyasını indirelim
        driver.findElement(By.linkText("learn.jpg"))
                .click();

        ReusableMethods.bekle(3);

        //  3. Dosyanın başarıyla indirilip indirilmediğini test edelim

        String dinamikDosyaYolu = System.getProperty("user.home")  + "/Downloads/learn.jpg";

        ReusableMethods.bekle(2);




    }
}
