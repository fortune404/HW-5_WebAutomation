package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Cart_Icon extends CommonAPI
{
    @Test
    public void cart() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"/us/en/cart\"]")).click();
        Thread.sleep(1000);
    }
}
