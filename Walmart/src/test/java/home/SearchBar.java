package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchBar extends CommonAPI
{
    @Test
    public void searchItem() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"global-search-input\"]")).sendKeys("Hoodies");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"global-search-submit\"]/span/span")).click();
        Thread.sleep(1500);
    }
}
