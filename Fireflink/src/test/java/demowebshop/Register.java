package demowebshop;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Shon");
		driver.findElement(By.id("LastName")).sendKeys("Antony");
		driver.findElement(By.id("Email")).sendKeys("shon.antony105@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("shonantony123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("shonantony123");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("//input[@type='button' and @value='Continue']")).click();
		String text = driver.findElement(By.xpath("(//a[@class='account' and @href='/customer/info'])[1]")).getText();
		System.out.println(text);
		driver.quit();
	}

}
