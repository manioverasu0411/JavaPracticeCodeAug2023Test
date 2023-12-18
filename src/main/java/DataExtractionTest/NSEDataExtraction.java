package DataExtractionTest;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NSEDataExtraction {



    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.nseindia.com/market-data/pre-open-market-cm-and-emerge-market");

        List<Map<String, String>> dataList = new ArrayList<>();

        int totalRows = driver.findElements(By.xpath("//table[@id='livePreTable']//tbody//tr//td[@class='togglecpm plus']")).size();
        System.out.println("Totoal Rows: "+totalRows);

        List<WebElement>rowList = driver.findElements(By.xpath("//table[@id='livePreTable']//tbody//tr"));
        List<WebElement>headerList = driver.findElements(By.xpath("//table[@id='livePreTable']//thead//tr//th"));

        for (WebElement row:rowList) {
            Map<String,String> dataMap = new LinkedHashMap<>();
            for (int h = 0; h< headerList.size()-1; h++){
                dataMap.put(headerList.get(h).getText(),row.findElements(By.xpath("./td")).get(h).getText());
            }

            dataList.add(dataMap);
        }

        System.out.println(dataList);


    }
}
