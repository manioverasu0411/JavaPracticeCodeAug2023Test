package TestNGDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    WebDriver driver;

    @BeforeClass
    void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(dataProvider = "dp")
    void testLogin(String email, String pwd){
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();
       driver.findElement(By.id("Email")).sendKeys(email);
       driver.findElement(By.id("Password")).sendKeys(pwd);
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

        String exp_title = "nopCommerce demo store";
        String act_title = driver.getTitle();

        Assert.assertEquals(exp_title,act_title);

    }

    @AfterClass
    void tearDown(){

        driver.close();

    }

   @DataProvider(name = "dp")
    String[][] loginData()
    {
        String data[][] = {
                {"manioverasu0411@gmail.com","Mani@1234"},
                {"manivini@gmail.com","Mani@1234"},
                {"abdasc@gmail.com","Test@1234"},
                {"manivenba@gmail.com","Mani@1234"},
                {"abc@gmail.com","Test@1234"},
        };

        return data;

    }

}
