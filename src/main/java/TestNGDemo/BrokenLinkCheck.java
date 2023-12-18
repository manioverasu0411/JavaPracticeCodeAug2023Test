package TestNGDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLinkCheck {

    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        int brokenLink = 0;
        for(WebElement link:links){
            String hrefAttributeValue = link.getAttribute("href");

            if(hrefAttributeValue == null || hrefAttributeValue.isEmpty()){
                System.out.println("Target link is empty");
                continue;
            }

            URL linkURl = new URL(hrefAttributeValue);  // converting String to URL format
            // send request to server - open, connect to the server
            HttpURLConnection conn = (HttpURLConnection) linkURl.openConnection();
           // to convert Http connection
            conn.connect();
            if(conn.getResponseCode()>=400){
                System.out.println(link.getText()+"    "+" ====> Broken Link");
                brokenLink++;
            }else {
                System.out.println(link.getText()+"    "+" ====> Not a Broken Link" );
            }


        }



    }
}
