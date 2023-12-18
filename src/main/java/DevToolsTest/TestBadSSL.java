package DevToolsTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v115.security.Security;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

public class TestBadSSL {

    public static WebDriver driver;

    public static void captureScreenShot() throws IOException {

        Date d = new Date();

        String fileName = d.toString().replace(":","_").replace(" ","_")+".jpg";

        File screeshshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screeshshot,new File("./screenshot/"+fileName));

    }

    public void captureElementScreenshot(WebElement element) throws IOException {
        File screeshshot_element = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screeshshot_element,new File("./screenshot/error.jpg"));
    }

    public static void chatGptCodeScreenshot(String fileName) throws IOException{

            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            BufferedImage screenshotImage = ImageIO.read(screenshotFile);
            ImageIO.write(screenshotImage, "jpg", new File(fileName));

    }



    public static void main(String[] args) throws IOException {

         driver = new ChromeDriver();

        DevTools devTools = ((HasDevTools) driver).getDevTools();
        devTools.createSession();

        devTools.send(Security.enable());
        devTools.send(Security.setIgnoreCertificateErrors(true));

        driver.manage().window().maximize();
        driver.get("https://expired.badssl.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        chatGptCodeScreenshot("chatGPTScreeshot");
        captureScreenShot();







    }
}
