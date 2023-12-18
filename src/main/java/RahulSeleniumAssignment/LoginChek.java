package RahulSeleniumAssignment;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LoginChek {

    public static String randomString(){
        String generatedString = RandomStringUtils.randomAlphabetic(8);
        return generatedString;
    }

    public static String randomAlphaNumeric(){

        String generatedString = RandomStringUtils.randomAlphabetic(8);
        String generatedNumber = RandomStringUtils.randomNumeric(3);
        String generatedAlphaNumeric = generatedString + generatedNumber;
        return generatedAlphaNumeric;

    }

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();

        // Using Random method for entering values dynamically
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        int frameSize = driver.findElements(By.tagName("frame")).size();
        System.out.println(frameSize);

        WebElement regFrom = driver.findElement(By.xpath("//form[@class='ng-pristine ng-invalid ng-touched']"));

        regFrom.findElement(By.xpath("//input[1]")).sendKeys("mani");

        //driver.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-invalid ng-touched'])[1]")).sendKeys(randomString());




    }
}
