package tests.day11_kontrolsuzYeniWindowKullanimi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

import java.util.Set;

public class C04_WindowGecisSonSoru extends TestBase_Each {

    @Test
    public void windowGecisSonSoru() {
/*
// testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com/");
ReusableMethods.bekle(3);

// yeni bir tab acarak, wisequarter.com.tr adresine gidin

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com.tr/");
        ReusableMethods.bekle(3);

// bagimsiz yeni bir window acarak youtube sayfasina gidin

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com/");
        ReusableMethods.bekle(3);

// Reusable methods classindaki window degistirme method'unu kullanarak
        String hedefUrl = "https://www.testotomasyonu.com.tr";
        ReusableMethods.urlIleWindowGecisi(driver,hedefUrl);
        ReusableMethods.bekle(3);

// testotomasyonu'nun acik oldugu window'a donun

        Set<String> tumWindow = driver.getWindowHandles();
        for (String w : tumWindow) {
            driver.switchTo().window(w);
        }
        ReusableMethods.bekle(3);

// url'in testotomasyonu icerdigini test edin
        String actualUrl = driver.getCurrentUrl();
        String expectedIcerik = "testotomasyonu";
        ReusableMethods.bekle(3);

// wise quarter'inn acik oldugu window'a donun
        hedefUrl = "https://www.testotomasyonu.com.tr";
        ReusableMethods.urlIleWindowGecisi(driver,hedefUrl);
        ReusableMethods.bekle(3);

// title'in Wise icerdigini test edin
        String actualTitle = driver.getTitle();
        String expectedIcerik2 = "Wise";
        ReusableMethods.bekle(3);


// youtube'un acik oldugu window'a donun
        hedefUrl = "https://www.youtube.com";
        ReusableMethods.urlIleWindowGecisi(driver,hedefUrl);
        ReusableMethods.bekle(3);

// url'in youtube icerdigini test edin
        hedefUrl = "https://www.youtube.com";
        String actualUrl2 = driver.getCurrentUrl();
        String expectedIcerik3 = "youtube";
        ReusableMethods.bekle(3);
    }
*/

// testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");
        ReusableMethods.bekle(3);

        // yeni bir tab acarak, wisequarter.com.tr adresine gidin
        driver.switchTo()
                .newWindow(WindowType.TAB)
                .get("https://www.wisequarter.com.tr");
        ReusableMethods.bekle(3);

        // bagimsiz yeni bir window acarak youtube sayfasina gidin
        driver.switchTo()
                .newWindow(WindowType.WINDOW)
                .get("https://www.youtube.com");
        ReusableMethods.bekle(3);
        // Reusable methods classindaki window degistirme method'unu kullanarak

        // testotomasyonu'nun acik oldugu window'a donun
        String hedefUrl = "https://www.testotomasyonu.com/";
        ReusableMethods.urlIleWindowGecisi(driver,hedefUrl);

        // url'in testotomasyonu icerdigini test edin
        String expectedUrlIcerik = "testotomasyonu";
        String actualUrl = driver.getCurrentUrl();

        Assertions.assertTrue(actualUrl.contains(expectedUrlIcerik));
        ReusableMethods.bekle(3);
        // wise quarter'in acik oldugu window'a donun
        hedefUrl = "https://wisequarter.com.tr/";
        ReusableMethods.urlIleWindowGecisi(driver,hedefUrl);

        // title'in Wise icerdigini test edin
        String expectedTitleIcerik = "Wise";
        String actualTitle = driver.getTitle();

        Assertions.assertTrue(actualTitle.contains(expectedTitleIcerik));
        ReusableMethods.bekle(3);

        // youtube'un acik oldugu window'a donun
        hedefUrl = "https://www.youtube.com";
        ReusableMethods.urlIleWindowGecisi(driver,hedefUrl);

        // url'in youtube icerdigini test edin
        expectedUrlIcerik = "youtube";
        actualUrl = driver.getCurrentUrl();

        Assertions.assertTrue(actualUrl.contains(expectedUrlIcerik));
        ReusableMethods.bekle(3);

}
}
