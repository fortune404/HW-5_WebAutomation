package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Sign_In_Button extends CommonAPI
{
    @Test
    public void clickableSignInButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"header-account-toggle\"]/span/span/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"signed-out\"]/a[1]/div/span/div")).click();
        Thread.sleep(1000);
    }
}
