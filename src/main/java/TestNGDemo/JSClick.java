package TestNGDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JSClick {

    WebDriver driver;

    @BeforeClass
    void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void testLogin(){
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;

        //WebElement email = driver.findElement(By.id("Email"));
       // js.executeScript("arguments[0].value='manioverasu0411@gmail.com'",email);
        js.executeScript("document.getElementById('Email').value='manioverasu0411@gmail.com'");

       // WebElement password =  driver.findElement(By.id("Password"));
       // js.executeScript("arguments[0].value='Mani@1234'",password);
        js.executeScript("document.getElementById('Password').value='Mani@1234'");


        String exp_title = "nopCommerce demo store";
        String act_title = driver.getTitle();

        Assert.assertEquals(exp_title,act_title);

    }

    @AfterClass
    void tearDown(){

        driver.close();



    }

}
