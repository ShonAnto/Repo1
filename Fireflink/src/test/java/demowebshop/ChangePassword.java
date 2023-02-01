package demowebshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangePassword {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shon.antony99@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("shonantony123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.linkText("My account")).click();
		driver.findElement(By.linkText("Change password")).click();
		driver.findElement(By.id("OldPassword")).sendKeys("shonantony123");
		driver.findElement(By.id("NewPassword")).sendKeys("shonantony1234");
		driver.findElement(By.id("ConfirmNewPassword")).sendKeys("shonantony1234");
		driver.findElement(By.xpath("//input[@value='Change password']")).click();
		
	}

}
