package demowebshop;

import java.awt.Checkbox;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoveAll_Items_From_Cart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shon.antony99@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("shonantony1234");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Build your own cheap computer")).click();
		driver.findElement(By.id("add-to-cart-button-72")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("14.1-inch Laptop")).click();
		driver.findElement(By.id("add-to-cart-button-31")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("")).click();
		driver.findElement(By.linkText("Shopping cart")).click();
	    List<WebElement> Checkbox = driver.findElements(By.xpath("//input[@name='removefromcart']"));
	    for(WebElement a:Checkbox)
	    {
	    	a.click();
	    	driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
	    }
	    
		String s = driver.findElement(By.xpath("//div[@class='order-summary-content']")).getText();
		System.out.println(s);
		driver.quit();
	}

}
