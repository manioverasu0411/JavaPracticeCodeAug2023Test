package DevToolsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestBasicAuth {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        ((HasAuthentication)driver).register(UsernameAndPassword.of("admin","admin"));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/basic_auth");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText());





    }
}
