package RahulSeleniumAssignment;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class BookingTest {

    public static WebDriver driver;

    public static void captureScreenShot() throws IOException {

        Date d = new Date();
        String fileName = d.toString().replace(":","_").replace(" ","_")+".jpg";

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("./screenshot/"+fileName));

    }

    public static void captureElementScreenShot(WebElement element) throws IOException {

        Date d = new Date();
        String fileName = "Element_"+d.toString().replace(":","_").replace(" ","_")+".jpg";

        File screenshot = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("./screenshot/"+fileName));

    }

    public static void main(String[] args) throws InterruptedException, IOException {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");
        driver.navigate().refresh();
        driver.findElement(By.xpath("//input[@class='ce45093752']")).clear();
        driver.findElement(By.xpath("//input[@class='ce45093752']")).sendKeys("MAD");
        Thread.sleep(2000);

        // Dropdown part
        WebElement dropCard = driver.findElement(By.xpath("//ul[@class='ce50aa40cd d319063cd8 b530332a61']"));
        captureElementScreenShot(dropCard);
        List<WebElement> dropList = dropCard.findElements(By.xpath(".//li//div/div/div/div[1]"));
        System.out.println(dropList.size());
        for (WebElement dropName:dropList) {
            System.out.println(dropName.getText());

        }

        captureScreenShot();
    }
}
