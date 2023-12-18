package TestNGDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class FlipkartPagination {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

        WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
        search.sendKeys("Samsung Mobiles");
        search.sendKeys(Keys.ENTER);

        // To find total page text and get only page integer value using substring method
        String pageText = driver.findElement(By.xpath("//span[normalize-space()='Page 1 of 25']")).getText();
        int total_pages = Integer.parseInt(pageText.substring(pageText.indexOf("f")+2));
        WebElement nextButton = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
        System.out.println("The total no of page is: "+total_pages);

        Thread.sleep(3000);

     /*   List<WebElement> mobileNames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        List<WebElement> mobile_price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

        List<String>mobileNameList = new ArrayList<>();
        List<String>mobilePriceList = new ArrayList<>();*/

       // JavascriptExecutor js = (JavascriptExecutor) driver;

        for(int p = 1;p<=total_pages; p++){
            if(total_pages>1){
                WebElement active_page = driver.findElement(By.xpath("//nav[@class='yFHi8N']//a[text()="+p+"]"));
                System.out.println(active_page.getText());
                active_page.click();
                Thread.sleep(2000);
                }

            int rows = driver.findElements(By.xpath("//div[@class='_13oc-S']")).size();
            System.out.println("Total No of Rows in Active page is : "+rows);

            for(int r=1; r<=rows; r++){

                String mobileName = driver.findElement(By.xpath("//div[@class='_13oc-S']//div[@class='_4rR01T']")).getText();
                System.out.println(mobileName);
            }

        }
    }

}
