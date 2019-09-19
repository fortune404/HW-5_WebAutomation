package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Negative_Log_In extends CommonAPI
{
    @Test
    public void invalidCredentialLogin() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"header-account-toggle\"]/span/span/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"signed-out\"]/a[1]/div/span/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("skrrt1213@gmi.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("A$01R");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"sign-in-form\"]/button[1]")).click();
        Thread.sleep(2000);
    }
}
