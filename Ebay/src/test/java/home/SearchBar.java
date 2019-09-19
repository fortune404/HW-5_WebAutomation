package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchBar extends CommonAPI
{

    @Test
    public void searchItem() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("flashlight");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        Thread.sleep(1500);
    }
}
