package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Positive_Log_In extends CommonAPI
{
    @Test
    public void loginSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@id=\"header-nav-signin\"]/a[@id=\"header-nav-signin-anchor\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_username\"]")).sendKeys("raih1012.rahi@yahoo.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_password\"]")).sendKeys("A101R");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"loginPageForm\"]/button")).click();
        Thread.sleep(2000);
    }
}
