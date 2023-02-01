package demowebshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DirectGiftCardAddToWishlist {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']/../../div[3]/div[2]/input")).click();
		driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("shon");
		driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("shon.antony45@gmail.com");
		driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("anto");
		driver.findElement(By.xpath("//input[@class='sender-email']")).sendKeys("shon.antony99@gamil.com");
		driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("hi");
		driver.findElement(By.id("add-to-wishlist-button-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Wishlist")).click();
		String text = driver.findElement(By.linkText("$25 Virtual Gift Card")).getText();
		System.out.println(text);
	}

}
