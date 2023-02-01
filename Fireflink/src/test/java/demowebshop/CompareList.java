package demowebshop;

import java.time.Duration;

import org.openqa.selenium.By;import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompareList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("14.1-inch Laptop")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.linkText("Build your own cheap computer")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.linkText("Compare products list")).click();
		System.out.println(driver.findElement(By.linkText("Build your own cheap computer")).getText());
		System.out.println(driver.findElement(By.linkText("14.1-inch Laptop")).getText());
		
		
	}

}
