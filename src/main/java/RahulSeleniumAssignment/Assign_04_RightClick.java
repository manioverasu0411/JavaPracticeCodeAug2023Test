package RahulSeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Assign_04_RightClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get("http://deluxe-menu.com/popup-mode-sample.html");

        WebElement contextClick = driver.findElement(By.xpath("//p[2]/img"));
        Actions actions = new Actions(driver);

        //WebElement prodcutInfo = driver.findElement(By.id("dm2m1i1tdT"));
        actions.contextClick(contextClick).perform();

        WebElement productInfo = driver.findElement(By.xpath("//td[@id='dm2m1i1tdT']"));
        actions.contextClick(productInfo).perform();

        WebElement installation = driver.findElement(By.xpath("//td[@id='dm2m2i1tdT']"));
        actions.contextClick(installation).perform();


        driver.findElement(By.xpath("//td[@id='dm2m3i1tdT']")).click();
        Thread.sleep(2000);
        actions.click();




    }
}