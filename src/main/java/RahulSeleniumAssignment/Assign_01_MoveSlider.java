package RahulSeleniumAssignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Assign_01_MoveSlider {



    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/resources/demos/slider/default.html");
        driver.manage().window().maximize();

        WebElement slider = driver.findElement(By.cssSelector(".ui-slider-handle"));
        //WebElement slider = driver.findElement(By.cssSelector(".ui-slider-handle.ui-corner-all.ui-state-default.ui-state-hover.ui-state-focus"));

        int xwidth = slider.getSize().width;
        System.out.println(xwidth);

       //new Actions(driver).dragAndDropBy(slider,1000,0).build().perform();

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider,xwidth*48,0).build().perform();
        System.out.println("Slider moved to right corner of the page");
        Thread.sleep(3000);

        for (int i = 0; i < 96; i++)
        {
            actions.sendKeys(Keys.ARROW_LEFT).build().perform();
            Thread.sleep(200);
        }

    }
}
