package tests.day12_actionsClass_FakerClass;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

import javax.swing.*;

public class C02_DragandDrop extends TestBase_Each {
    /*
    1- https://testotomasyonu.com/droppable adresine gidelim
    2- Accept bolumunde “Acceptable” butonunu tutup “Drop Here” kutusunun ustune birakalim
    3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
    4- Sayfayi yenileyin
    5- “Not Acceptable” butonunu tutup “Drop Here” kutusunun ustune birakalim
    6- “Drop Here” yazisinin degismedigini test edin
     */

    @Test
    public void test01() {
        driver.get("https://testotomasyonu.com/droppable");

        WebElement acceptableElementi = driver.findElement(By.xpath("//*[@id='draggable2']"));
        WebElement dropHereElementi = driver.findElement(By.xpath("//*[@id='droppable2']"));

        ReusableMethods.bekle(2);

        Actions actions = new Actions(driver);

        actions.dragAndDrop(acceptableElementi, dropHereElementi).perform();
        ReusableMethods.bekle(5);




    }
}
