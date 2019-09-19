package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Positive_Log_In extends CommonAPI
{
    @Test
    public void loginSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"header-account-toggle\"]/span/span/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"signed-out\"]/a[1]/div/span/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("raih1012.rahi@yahoo.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("A101R");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"sign-in-form\"]/button[1]")).click();
        Thread.sleep(2000);

    }
}
