package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Positive_Log_In extends CommonAPI
{
    @Test
    public void loginSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("raih1012.rahi@yahoo.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("A101R");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();
        Thread.sleep(2000);
    }
}
