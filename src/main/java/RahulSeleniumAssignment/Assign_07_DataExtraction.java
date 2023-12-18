package RahulSeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Assign_07_DataExtraction {

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

        List<WebElement> companyList = driver.findElements(By.xpath("//table[@class='dataTable']//tr//a"));
        List<WebElement> Group = driver.findElements(By.xpath("//table[@class='dataTable']//tr//td[2]"));
        List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']//tr//td[3]"));
        List<WebElement> previousClose = driver.findElements(By.xpath("//table[@class='dataTable']//tr//td[4]"));
        List<WebElement> change = driver.findElements(By.xpath("//table[@class='dataTable']//tr//td[5]"));
        List<WebElement> PercentageChange = driver.findElements(By.xpath("//table[@class='dataTable']//tr//td[6]"));

        System.out.printf("---------------------------------------------------------------------------------------------------------------------%n");
        System.out.printf("                  BSE100 LIST OF COMPANY  DETAILS                                                                    %n");
        System.out.printf("----------------------------------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-50s | %-10s | %10s | %10s| %10s | %8s | %n","COMPANY NAME","GROUP","CURRENT PRICE","PRE-CLOSE","CHANGE","PER-CHANGE" );
        System.out.printf("----------------------------------------------------------------------------------------------------------------------%n");

        for(int i = 0; i<totalCompanies; i++ ){
            System.out.printf("| %-50s | %-10s | %13s | %9s | %10s | %10s | %n",companyList.get(i).getText(),Group.get(i).getText(),currentPrice.get(i).getText(),previousClose.get(i).getText(),
                    change.get(i).getText(),PercentageChange.get(i).getText());

        }


    }


}
