package TestNGDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BigBasketDataRetrive {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-DEL&gad_source=1&gclid=CjwKCAjw15eqBhBZEiwAbDomEunmQNM4dbw6rIbTV6TcLxXthGEQQAIcIwX0hj6q119YmyxMKGN_DxoCLNwQAvD_BwE");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();

//        List<WebElement> parentMenu = driver.findElements(By.xpath("(//a[text()='Fruits & Vegetables'])[2]/ancestor::ul/li/a"));
//        int parent_menu_count = parentMenu.size();
//        System.out.println(parent_menu_count);

         getListOfItems("Fruits & Vegetables", "Cuts & Sprouts");


    }


    public static void getListOfItems(String parentProductName, String child_menu_1){
        Actions action = new Actions(driver);
        WebElement parentProduct = driver.findElement(By.xpath("(//a[text()='"+parentProductName+"'])[2]"));
        action.moveToElement(parentProduct).pause(500).build().perform();
        WebElement childProduct = driver.findElement(By.xpath("(//a[text()='"+child_menu_1+"'])[2]"));
        action.moveToElement(childProduct).pause(500).build().perform();

        List<WebElement> childProductList3 = driver.findElements(By.xpath("(//div/nav/ul[3])[1]/li/a"));


        for(int i = 0; i<childProductList3.size(); i++){
            String text = childProductList3.get(i).getText();
            System.out.println(text);

        }

    }
}
