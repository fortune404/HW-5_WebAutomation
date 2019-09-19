package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Cart_Icon extends CommonAPI
{
    @Test
    public void cart() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@id=\"gh-eb\"]/li[contains(@class,\"gh-eb-li\") ][last()]")).click(); // ul[@id="gh-eb"]/li[contains(@class,"gh-eb-li") ][last()]
        Thread.sleep(1000);

    }

}
