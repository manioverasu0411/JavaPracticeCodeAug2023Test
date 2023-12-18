package RahulSeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Assign_03_DragAndDrop {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

        WebElement draggable = driver.findElement(By.id("draggable"));
        // WebElement droppable = driver.findElement(By.id("droppable"));

       // new Actions(driver).dragAndDrop(draggable,droppable).perform();

        new Actions(driver).dragAndDropBy(draggable,300,400).perform();



    }
}
