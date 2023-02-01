package demowebshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangingAllTheSpecificationsCart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shon.antony99@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("shonantony123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Build your own computer")).click();
		WebElement d1 = driver.findElement(By.id("product_attribute_16_5_4"));
		Select s= new Select(d1);
		s.selectByIndex(1);
		
		WebElement d2 = driver.findElement(By.id("product_attribute_16_6_5"));
		Select s1= new Select(d2);
		s1.selectByIndex(2);
		driver.findElement(By.id("product_attribute_16_3_6_19")).click();
		driver.findElement(By.id("product_attribute_16_4_7_20")).click();
		driver.findElement(By.id("product_attribute_16_8_8_24")).click();
		driver.findElement(By.id("add-to-cart-button-16")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Shopping cart")).click();
		

	}

}
