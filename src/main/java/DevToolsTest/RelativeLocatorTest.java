package DevToolsTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class RelativeLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://way2automation.com/way2auto_jquery/index.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


       WebElement email = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("Select")));
       email.sendKeys("manikandanover@gmail.com");

        WebElement city = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("Select")));
        city.sendKeys("Chennai");

        WebElement rightOf = driver.findElement(RelativeLocator.with(By.name("password")).toRightOf(By.tagName("label")));
        rightOf.sendKeys("sadfas");

        WebElement near = driver.findElement(RelativeLocator.with(By.partialLinkText("THE")).near(By.linkText("Signin")));
        near.click();
        System.out.println(near.getText());



    }
}
