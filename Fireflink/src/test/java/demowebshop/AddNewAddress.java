package demowebshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddNewAddress {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shon.antony99@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("shonantony123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("//input[@value='Add new']")).click();
		driver.findElement(By.id("Address_FirstName")).sendKeys("sh");
		driver.findElement(By.id("Address_LastName")).sendKeys("anto");
		driver.findElement(By.id("Address_Email")).sendKeys("shon.antony77@gmail.com");
		WebElement dropdown = driver.findElement(By.id("Address_CountryId"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("India");
		driver.findElement(By.id("Address_City")).sendKeys("Kochin");
		driver.findElement(By.id("Address_Address1")).sendKeys("#33/1,1st main,4th cross");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("560029");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("884701268");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
	}

}
