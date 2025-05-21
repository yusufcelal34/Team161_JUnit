package tests.day12_actionsClass_FakerClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

import javax.swing.*;

public class C01_SagKlik extends TestBase_Each {



        /*
            1- https://testotomasyonu.com/click sitesine gidin
            2- “DGI Drones” uzerinde sag click yapin
            3- Alert’te cikan yazinin “Tebrikler!... Sağ click yaptınız.” oldugunu test edin.
            4- Tamam diyerek alert’i kapatalim
        */

    @Test
    public void test01() {

        driver.get("https://testotomasyonu.com/click");

        WebElement dgiDronesElementi = driver.findElement(By.id("pic2_thumb"));

        Actions actions = new Actions(driver);
        ReusableMethods.bekle(1);

        actions.contextClick(dgiDronesElementi)
                .perform();

        String expectedAlertYazi = "Tebrikler !... Sağ klik yaptınız.";

        String actualAlertYazi = driver.switchTo()
                .alert()
                .getText();

        Assertions.assertEquals(expectedAlertYazi, actualAlertYazi);
        ReusableMethods.bekle(2);


    }

}

