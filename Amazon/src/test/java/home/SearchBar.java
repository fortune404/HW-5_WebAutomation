package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchBar extends CommonAPI
{
    @Test
    public void searchItem() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("glass");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        Thread.sleep(3000);
    }
}
