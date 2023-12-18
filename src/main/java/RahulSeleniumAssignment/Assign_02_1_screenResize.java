package RahulSeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Assign_02_1_screenResize {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
      WebElement resize =   driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));

         new Actions(driver).dragAndDropBy(resize,400,400).perform();

    }
}
