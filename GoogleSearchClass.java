package googleTestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleSearchClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // Open the Browser
		driver.get("https://www.google.com");
		
		System.out.println(driver.findElement(By.className("MV3Tnb")).getText());
		driver.findElement(By.className("MV3Tnb")).click();
		System.out.println(driver.getTitle());
		driver.navigate(). back();
	    
		System.out.println("Browser Title: "+ driver.getTitle());
		System.out.println("URL : "+ driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		//driver.findElement(By.xpath("//*[@aria-label=\"Stay signed out\"]")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id=\"jZ2SBf\"]/div[1]/span")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		System.out.println("You have Searched: "+driver.getTitle());
		System.out.println("Your current Searched url: "+driver.getCurrentUrl());
		
		

		Thread.sleep(5000);	
		
		driver.quit();

	}

}
