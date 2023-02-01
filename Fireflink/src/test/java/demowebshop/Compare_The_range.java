package demowebshop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Compare_The_range {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.partialLinkText("Computers")).click();
		driver.findElement(By.partialLinkText("Desktops")).click();
		driver.findElement(By.xpath("(//span[@class='PriceRange' and text()='1000.00'])[1]")).click();
		List<WebElement> names = driver.findElements(By.xpath("//h2[@class='product-title']"));
		for(WebElement a: names)
		{
			System.out.println(a.getText());
		}
			
		}
	}


