package TestNGDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class FlipkartDataRetrive {

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
        System.out.println("The total no of page is: "+total_pages);
        Thread.sleep(3000);

        List<WebElement> mobileNames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        List<WebElement> mobile_price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

        List<String>mobileNameList = new ArrayList<>();
        List<String>mobilePriceList = new ArrayList<>();

        WebElement nextButton = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for(int p = 1;p<=total_pages; p++){
            if(total_pages>1){
                for (WebElement mobile :mobileNames) {
                    System.out.println(mobile.getText());
                    mobileNameList.add(mobile.getText());
                }

                for(WebElement price: mobile_price){
                    System.out.println(price.getText());
                    mobilePriceList.add(price.getText());
                }

                js.executeScript("arguments[0].scrollIntoView();", nextButton);
                js.executeScript("arguments[0].click()", nextButton);

        }
    }
        System.out.println(mobileNameList);
        System.out.println(mobilePriceList);

        Map<String,String>hm = new HashMap<>();

        for (int i = 0; i<mobileNameList.size(); i++){
            hm.put(mobileNameList.get(i),mobilePriceList.get(i));
        }

        System.out.println(hm);


        driver.close();
    }
}
