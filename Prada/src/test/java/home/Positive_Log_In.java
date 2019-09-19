package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.security.Key;

public class Positive_Log_In extends CommonAPI
{
    @Test
    public void loginSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"application\"]/header/div/div[2]/ul/li[1]/div/div[1]/button/span[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dialogLogin\"]/div/div[3]/div/div[3]/div[1]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"UniqueID1e58090f1-b58d-48ca-8707-c017068d3069\"]")).sendKeys("raih1012.rahi@yahoo.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"UniqueID2e58090f1-b58d-48ca-8707-c017068d3069\"]")).sendKeys("A101R", Keys.ENTER);
        Thread.sleep(2000);
    }
}
