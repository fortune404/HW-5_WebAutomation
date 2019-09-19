package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchBar extends CommonAPI
{
    @Test
    public void searchItem() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"application\"]/header/div/div[2]/ul/li[4]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"top-search\"]")).sendKeys("sweatshirt", Keys.ENTER);
        Thread.sleep(1500);
    }
}
