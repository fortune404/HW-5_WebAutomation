package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login_Button extends CommonAPI
{
    @Test
    public void clickableLoginButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"application\"]/header/div/div[2]/ul/li[1]/div/div[1]/button/span[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dialogLogin\"]/div/div[3]/div/div[3]/div[1]/button")).click();
        Thread.sleep(1500);
    }
}
