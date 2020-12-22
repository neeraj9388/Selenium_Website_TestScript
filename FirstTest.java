package co.demo.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neeraj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Samsung galaxy s6")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		driver.findElement(By.id("cartur")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
		//Form Filling
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Neeraj Gupta");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("city")).sendKeys("Mumbai");
		driver.findElement(By.id("card")).sendKeys("4112211314414567");
		driver.findElement(By.id("month")).sendKeys("02");
		driver.findElement(By.id("year")).sendKeys("2023");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();
		
		Thread.sleep(7000);
		System.out.println("Test Sucessfull");
	}

}
