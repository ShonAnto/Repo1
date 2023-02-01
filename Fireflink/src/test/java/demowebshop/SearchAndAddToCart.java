package demowebshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchAndAddToCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("computer");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Build your own expensive computer")).click();
		driver.findElement(By.id("add-to-cart-button-74")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.linkText("Build your own expensive computer")).getText();
		System.out.println(text);
	}

}
