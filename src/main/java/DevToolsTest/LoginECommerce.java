package DevToolsTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class LoginECommerce {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Workspace\\SeleniumTest\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		/* Open the Screen */
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.manage().window().maximize();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input [@class='form-control ng-pristine ng-invalid ng-touched']")));
		/* Enter Name in Username Field */
		driver.findElement(By.xpath("//input[@id='username']")).click();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		System.out.println("Username Entered Successfully");
		/* Enter Password in Password Field */
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		System.out.println("Email Entered Successfully");
		/* Click User Radiobutton */
		driver.findElement(By.xpath("//input[@value='user']")).click();
		System.out.println("User RadioButton Clicked Successfully");
		/* Select Consultant */
		Select dropDown = new Select (driver.findElement(By.xpath("//select[@class='form-control']")));
		dropDown.selectByValue("Consultant"); 
		System.out.println("Consultant Selected Successfully");
		/* Check the Terms and Conditions Checkbox */
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		System.out.println("Check Terms and Conditions Checkbox Successfully");
		/* Click Sign in Button */
		driver.findElement(By.xpath("////input[@id='signInBtn']")).click();
		System.out.println("Sign in Button Clicked Successfully");
		/* Click Add To Cart */
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button' and @value='addtocartT']")));
		int cart = driver.findElements(By.xpath("//button[@type='button' and @value='addtocartT' and not (@class='disabled') and not (@class='close')]")).size();
		for (cart=0; cart > 30; cart++) {
			driver.findElement(By.xpath("//button[@type='button' and @value='addtocartT']")).click();
		}
		System.out.println("Add To Cart Clicked Successfully");
		/* Click Checkout */
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id,'checkout']")));
		driver.findElement(By.xpath("//button[@id,'checkout']")).click();
		System.out.println("Checkout Clicked Successfully");
		/* "Continue Shopping Button in Confirmation Screen */
		if (driver.findElement(By.xpath("//button[@id,'continueshopping']")).isDisplayed()) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id,'continueshopping']")));
			System.out.println("Continue Shopping Button should be Displayed in Confirmation Screen");
		} else {
			System.out.println("Continue Shopping Button is not Displayed in Confirmation Screen");
		}
	}

}
