package RahulSeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assign_05_CityPrintDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(2000);
        int frameCount =driver.findElements(By.tagName("iFrame")).size();
        System.out.println(frameCount);
        driver.switchTo().frame(3);
        WebElement buttonClose = driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']//i"));
        buttonClose.click();
        driver.navigate().refresh();
        WebElement selectCity = driver.findElement(By.xpath("//div[@class='fsw ']"));
        Thread.sleep(2000);
        selectCity.findElement(By.xpath("//label[@for='fromCity']")).click();
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MUM");

        List<WebElement> FromCityList = driver.findElements(By.xpath("//ul[@role='listbox']//li//div/div//p[1]"));

        for (WebElement city:FromCityList) {
            System.out.println(city.getText());

        }








    }
}
