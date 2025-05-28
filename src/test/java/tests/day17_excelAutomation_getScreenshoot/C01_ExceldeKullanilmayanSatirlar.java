package tests.day17_excelAutomation_getScreenshoot;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ExceldeKullanilmayanSatirlar {

    @Test
    public void test01() throws IOException {


// ulkeler excel'inde Sayfa2'ye gidin
        String dosyaYolu = "src/test/java/tests/day16_webtables_excelOtomasyon/ulkeler.xlsx";
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sayfa2 = workbook.getSheet("Sayfa2");

// kullanilan en son satirin 20.satir oldugunu test edin
        int expectedSonSatirIndexi = 19;
        int actualSonSatirIndexi = sayfa2.getLastRowNum();
        Assertions.assertEquals(expectedSonSatirIndexi, actualSonSatirIndexi);

// reel olarak data yazilan satir sayisinin 8 oldugunu test edin
        int expectedSatirSayisi = 8;
        int actualSatirSayisi = sayfa2.getPhysicalNumberOfRows();
        Assertions.assertEquals(expectedSatirSayisi, actualSatirSayisi);

// 4.satir, 1.sutun'daki sayinin 3 oldugunu test edin
        double expectedDeger = 3;
        double actualDeger = sayfa2.getRow(3).getCell(0).getNumericCellValue();
        Assertions.assertEquals(expectedDeger, actualDeger);

// 4.satir, 2.sutun'daki datayi yazdirin
        System.out.println(sayfa2.getRow(3).getCell(1));

// 5.satir, 3.sutun'daki datayi yazdirin
        System.out.println(sayfa2.getRow(4).getCell(2));




    }
}
