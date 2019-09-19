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
        driver.findElement(By.cssSelector("#header-main > div:nth-child(7) > div > a > svg._open")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys("shirt", Keys.ENTER);
        Thread.sleep(1500);
    }
}
