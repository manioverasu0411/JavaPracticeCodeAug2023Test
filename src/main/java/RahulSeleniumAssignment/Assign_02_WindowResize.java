package RahulSeleniumAssignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Assign_02_WindowResize {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.google.com/");

        Dimension DefaultSize = driver.manage().window().getSize();
        System.out.println(DefaultSize);

        for(int i=300;i<=1000;i+=50) {
            driver.manage().window().setSize(new Dimension(i,i));
        }


       /* for(int i = 0; i<2; i++) {
            Dimension dimension = new Dimension(600, 600);
            driver.manage().window().setSize(dimension);
            Thread.sleep(2000);

            Dimension dimension1 = new Dimension(800, 800);
            driver.manage().window().setSize(dimension1);
            Thread.sleep(2000);

            Dimension dimension2 = new Dimension(900, 900);
            driver.manage().window().setSize(dimension2);
            Thread.sleep(2000);
        }*/


    }
}
