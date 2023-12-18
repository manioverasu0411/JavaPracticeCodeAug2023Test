package DevToolsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestNewTabsAndPopUps {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://timesofindia.indiatimes.com/poll.cms");
        System.out.println(driver.getTitle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://mail.google.com/mail/u/0/");
        System.out.println(driver.getTitle());

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());

        int windIds = driver.getWindowHandles().size();

        Set<String> windowId = driver.getWindowHandles();

        List<String> windowList = new ArrayList<>(windowId);

        for (String window :windowList) {

            System.out.println(window);
            if(window.equals("BF24D42122094445A79D866941F69331")){
                driver.close();
            }
        }



    }
}
