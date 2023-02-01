package demowebshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddressEditTest {
     @Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shon.antony99@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("shonantony123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("//input[@value='Edit']")).click();
		driver.findElement(By.id("Address_FaxNumber")).clear();
		driver.findElement(By.id("Address_FaxNumber")).sendKeys("7856524639554");
		driver.findElement(By.id("Address_City")).clear();
		driver.findElement(By.id("Address_City")).sendKeys("kochin");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		String city="Kochin, 560029";
		String fax1 = driver.findElement(By.xpath("//label[@for='Addresses_0__FaxNumber']")).getText();
		String city1 = driver.findElement(By.xpath("//li[@class='city-state-zip']")).getText();
		System.out.println(fax1);
		System.out.println(city1);
		
		if(city.equals(city1))
		{
			System.out.println("pass");
		}
		driver.quit();

	}

}
