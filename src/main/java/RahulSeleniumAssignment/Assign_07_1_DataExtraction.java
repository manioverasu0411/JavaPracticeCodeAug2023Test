package RahulSeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

public class Assign_07_1_DataExtraction {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://money.rediff.com/indices/bse/bse100?src=moneyhome_bseIndices");
        List<Map<String,String>> dataList = new LinkedList<>();
        int totalCompanies = driver.findElements(By.xpath("//table[@class='dataTable']//tr//a")).size();
        System.out.println("Total no of companies available in list: "+totalCompanies);
        int totalColumn = driver.findElements(By.xpath("//table[@class='dataTable']//tr//th")).size();
        System.out.println("Totoal no of columns available: "+totalColumn);

        List<WebElement> headerList = driver.findElements(By.xpath("//table[@class='dataTable']//tr//th"));
        List<WebElement> rowList = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));

        for (WebElement row:rowList) {
            Map<String,String> dataMap = new LinkedHashMap<>();

            for(int h = 0; h<headerList.size(); h++){
                dataMap.put(headerList.get(h).getText(),row.findElements(By.xpath(".//td")).get(h).getText());
            }

            dataList.add(dataMap);

        }

       System.out.println(dataList);


        for(Map<String,String> data: dataList){
            if(data.get("Company").equals("Zomato Ltd.")){
                System.out.println(data.get("Current Price (Rs)"));
            }
        }
    }
}
