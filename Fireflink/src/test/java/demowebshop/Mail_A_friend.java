package demowebshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mail_A_friend {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shon.antony99@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("shonantony1234");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		driver.findElement(By.linkText("50's Rockabilly Polka Dot Top JR Plus Size")).click();
		driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
		driver.findElement(By.id("FriendEmail")).sendKeys("shon.antony740@gmail.com");
		driver.findElement(By.id("PersonalMessage")).sendKeys("this product is basically shit");
		driver.findElement(By.xpath("//input[@name='send-email']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='result']")).getText());
		
	}

}
