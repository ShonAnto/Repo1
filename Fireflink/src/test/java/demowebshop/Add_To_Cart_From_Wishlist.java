package demowebshop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_To_Cart_From_Wishlist {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shon.antony99@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("shonantony1234");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		driver.findElement(By.linkText("50's Rockabilly Polka Dot Top JR Plus Size")).click();
		driver.findElement(By.id("add-to-wishlist-button-5")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Blue and green Sneaker")).click();
		driver.findElement(By.id("add-to-wishlist-button-28")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Wishlist")).click();
		List<WebElement> check = driver.findElements(By.xpath("//input[@name='addtocart']"));
		for (WebElement a : check) {
			a.click();
			driver.findElement(By.xpath("//input[@name='addtocartbutton']")).click();
		}
		driver.findElement(By.linkText("Shopping cart")).click();
		List<WebElement> items = driver.findElements(By.xpath("//a[@class='product-name']"));
		for (WebElement b : items) {
			System.out.println(b.getText());
		}
	}

}
