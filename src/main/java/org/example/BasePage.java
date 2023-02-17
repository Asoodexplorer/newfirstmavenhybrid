package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BasePage {
    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","src/test/java/Driver/msedgedriver.exe");
            driver = new EdgeDriver();
//          driver = new ChromeDriver();
        String timestamp =new SimpleDateFormat("yyyy.MM.dd.mm.ss").format(new java.util.Date());
        System.out.println(timestamp);

            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
            driver.findElement(By.className("ico-register")).click();
            driver.findElement(By.id("FirstName")).sendKeys("Amit");
            driver.findElement(By.id("LastName")).sendKeys("Sood");
            driver.findElement(By.xpath("//option[@value=\"14\"]")).click();
            driver.findElement(By.xpath("//option[@value=\"11\"]")).click();
            driver.findElement(By.xpath("//option[@value=\"1984\"]")).click();
            driver.findElement(By.xpath("//input[@type=\"email\"][@data-val=\"true\"]")).sendKeys("Abcdefg"+timestamp+"@gmail.com");
            driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("Abcdf.co");

            driver .findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
            driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Abcd1234");
            driver.findElement(By.id("ConfirmPassword")).sendKeys("Abcd1234");
            driver.findElement(By.id("register-button")).click();

            String regMsg = driver.findElement(By.className("result")).getText();
        System.out.println(regMsg);


           // driver.close();
          //  driver.quit();

    }

}
