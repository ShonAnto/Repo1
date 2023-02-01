package demowebshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaceOrder {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shon.antony99@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("shonantony123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.linkText("14.1-inch Laptop")).click();
		driver.findElement(By.id("add-to-cart-button-31")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		/*driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Test Yantra");
		WebElement dropdown = driver.findElement(By.id("BillingNewAddress_CountryId"));
		Select s= new Select(dropdown);
		s.selectByVisibleText("India");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("bangalore");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("#33/1,1st main,4th cross");
		
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("560029");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("7892116521");*/
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		driver.findElement(By.id("PickUpInStore")).click();
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		String text = driver.findElement(By.xpath("//strong")).getText();
		System.out.println(text);
		
	}

}
