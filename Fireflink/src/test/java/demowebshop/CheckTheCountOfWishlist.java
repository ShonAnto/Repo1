package demowebshop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckTheCountOfWishlist {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shon.antony99@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("shonantony1234");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		driver.findElement(By.linkText("50's Rockabilly Polka Dot Top JR Plus Size")).click();
		driver.findElement(By.id("add-to-wishlist-button-5")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Blue and green Sneaker")).click();
		driver.findElement(By.id("add-to-wishlist-button-28")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Wishlist")).click();
		List<WebElement> names = driver.findElements(By.xpath("//td[@class='product']"));
		int count=0;
		for (WebElement a : names) {
			count++;
			
		}
		String b = driver.findElement(By.xpath("//span[text()='Wishlist']/../span[@class='wishlist-qty']")).getText();
	    char[] vh=b.toCharArray();
	    String num="";
	    for(int i=0;i<vh.length;i++ ) {
	    	if(vh[i]>='0'&&vh[i]<='9') {
	    		num=num+vh[i];
	    	}
	    }
	    int c= Integer.parseInt(num);
	    if(c==count)
	    {
	    	System.out.println("pass");
	    }
	}

}

