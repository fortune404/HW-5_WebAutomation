package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Cart_Icon extends CommonAPI
{
    @Test
    public void cart() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"header-bubble-links\"]/div[4]/a/span/span/span[2]")).click();
        Thread.sleep(1000);
    }
}
