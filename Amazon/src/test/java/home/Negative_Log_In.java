package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Negative_Log_In extends CommonAPI
{
    @Test
    public void invalidCredentialLogin() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("rksdcs@yahoo.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
        Thread.sleep(1000);
    }

}
