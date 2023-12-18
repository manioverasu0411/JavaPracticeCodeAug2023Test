package RahulSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AlertDemo {

    @Test
    public static void alertTest(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
        driver.switchTo().frame("iframeResult");

        driver.findElement(By.xpath("//input[@id='mySubmit']")).click();

        List<WebElement> frameList = driver.findElements(By.id("iframeResult"));

    }
}
