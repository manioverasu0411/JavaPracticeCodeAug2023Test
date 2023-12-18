package RahulSeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;


public class Assign_06_LogicalCalculation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://timesofindia.indiatimes.com/poll.cms");

        String expResult = "You have successfully cast your vote.";

        WebElement DropItem = driver.findElement(By.xpath("//td[@valign='bottom']"));

        List<WebElement> dropList = driver.findElements(By.xpath("//td[@valign='bottom']//span"));

        String expectName = "Disagree";

        for (WebElement name : dropList) {
            String actName = name.getText();
            if (expectName.equals(actName)) {
                DropItem.findElement(By.xpath("//input[@name='PRadio'][1]")).click();
                break;
            }
        }

        WebElement letter = driver.findElement(By.xpath("//span[@id='mathq2']"));
        String letterNew = letter.getText();
        System.out.println(letterNew);
        char firstChar = letterNew.charAt(0);
        char secondChar = letterNew.charAt(4);
        int a = Integer.parseInt(String.valueOf(firstChar));
        int b = Integer.parseInt(String.valueOf(secondChar));
        int total = a+b;
        System.out.println("After Converting into int: "+total);

        String totalCheck = Integer.toString(total);
        System.out.println("After converting into String: "+totalCheck);

        driver.findElement(By.id("mathuserans2")).sendKeys(totalCheck);

        driver.findElement(By.xpath("//div[@class='homesprite vot']")).click();

        String actResult = driver.findElement(By.xpath("//*[@id=\"polldiv\"]/table/tbody/tr/td/table[1]/tbody/tr/td/font/b")).getText();
        System.out.println(actResult);
        Assert.assertEquals(actResult,expResult);



    }
}
