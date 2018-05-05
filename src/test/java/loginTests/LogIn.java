package loginTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LogIn {
    WebDriver webDriver;

    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
    }

    @Test
    public void validLogIn() {
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        webDriver.get("https://ihelper-prp.mts.com.ua/SelfCareUA/Logon");
        webDriver.findElement(By.name("PhoneNumber")).sendKeys("380");
        webDriver.findElement(By.name("Password")).sendKeys("Qwe123Qwe");
        webDriver.findElement(By.className("text")).click();
        Assert.assertTrue("",webDriver.findElement(By.xpath(".//")).isDisplayed());
        webDriver.quit();
    }
}
