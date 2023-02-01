package demowebshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Review {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shon.antony740@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("shonantony123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.linkText("14.1-inch Laptop")).click();
		driver.findElement(By.linkText("Add your review")).click();
		driver.findElement(By.id("AddProductReview_Title")).sendKeys("bad product");
		driver.findElement(By.id("AddProductReview_ReviewText")).sendKeys("omg such a bad product");
		driver.findElement(By.id("addproductrating_1")).click();
		driver.findElement(By.xpath("//input[@value='Submit review']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='result']")).getText());
		

	}

}
