package firstpackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		
		WebDriver a = new ChromeDriver();
		a.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		a.manage().window().maximize();
		a.get("https://www.saucedemo.com/");
		String b = a.getCurrentUrl();
		System.out.print(b);
		a.findElement(By.id("user-name")).sendKeys("standard_user");
		a.findElement(By.id("password")).sendKeys("secret_sauce");
		a.findElement(By.id("login-button")).click();
		a.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		a.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
		a.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		a.findElement(By.id("first-name")).sendKeys("faran");
		Thread.sleep(2000);
		a.findElement(By.id("last-name")).sendKeys("nafiz");
		Thread.sleep(2000);
		a.findElement(By.id("postal-code")).sendKeys("6000");
		Thread.sleep(2000);
		a.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		a.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		a.findElement(By.id("back-to-products")).click();
		
		Thread.sleep(20000);
		a.close();
	}

}
