package demowebshop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckTheCountOnWishlist {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shon.antony99@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("shonantony1234");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.partialLinkText("Computer")).click();
		driver.findElement(By.partialLinkText("Desktops")).click();
		driver.findElement(By.linkText("Build your own cheap computer")).click();
		driver.findElement(By.id("add-to-cart-button-72")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Build your own expensive computer")).click();
		driver.findElement(By.id("add-to-cart-button-74")).click();
		driver.findElement(By.linkText("Shopping cart")).click();
		List<WebElement> names = driver.findElements(By.xpath("//td[@class='product']"));
		int count=0;
		for (WebElement a : names) {
			count++;
			
		}
		String b = driver.findElement(By.xpath("//span[text()='Shopping cart']/../span[@class='cart-qty']")).getText();
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
