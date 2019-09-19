package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Cart_Icon extends CommonAPI
{
    @Test
    public void cart() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"application\"]/header/div/div[2]/ul/li[3]/div/div/button/span[1]")).click();
        Thread.sleep(1000);
    }
}
