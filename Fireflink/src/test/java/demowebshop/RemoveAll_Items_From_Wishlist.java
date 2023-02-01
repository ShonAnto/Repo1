package demowebshop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoveAll_Items_From_Wishlist {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
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
		List<WebElement> check = driver.findElements(By.xpath("//input[@name='removefromcart']"));
		for (WebElement a : check) {
			a.click();
			driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		}
		String s = driver.findElement(By.xpath("//div[@class='wishlist-content']")).getText();
		System.out.println(s);
		driver.quit();
	}

}
