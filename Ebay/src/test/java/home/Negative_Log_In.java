package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Negative_Log_In extends CommonAPI
{
    @Test
    public void invalidCredentialLogin() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("skrrt1213@gmi.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("A$01R");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();
        Thread.sleep(2000);
    }
}
