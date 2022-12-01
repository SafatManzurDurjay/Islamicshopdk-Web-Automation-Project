package islamicshopdk_web_automation_Testing;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IslamicShopDK_Web_Automation_Testing {
	
	@Test
	
	public void webautomation() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		//create a chromeDriver object named driver.
		WebDriver driver = new FirefoxDriver();
		
		//go to google web page
		driver.get("https://www.islamicshopdk.com/");
		//Maximize the browser window
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(3000);
		
        js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(3000);
		
		
		WebElement inputTextElement = driver.findElement(By.xpath("//a[@href='https://www.islamicshopdk.com/product/book/ibadat/'][contains(text(),'আত্মশুদ্ধি ও অনুপ্রেরণা')]"));
		inputTextElement.click();
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(3000);
		
        js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,600)","");
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//span[@class='button-text']"));
		inputTextElement.click();
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,800)","");
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link']//img[@alt='আল্লাহর ভালোবাসা পেতে হলে']"));
		inputTextElement.click();
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,200)","");
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//button[@name='add-to-cart']"));
		inputTextElement.click();
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("(//i[@class='woofc-icon-cart6'])[1]"));
		inputTextElement.click();
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("(//a[@class='woofc-action-checkout'])[1]"));
		inputTextElement.click();
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//input[@id='billing_first_name']"));
		inputTextElement.sendKeys("S.M. Safat Manzur");
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//input[@id='billing_last_name']"));
		inputTextElement.sendKeys("Durjay");
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//input[@id='billing_address_1']"));
		inputTextElement.sendKeys("H#83, Goaltek Mosjid Road");
		Thread.sleep(3000);
		
				
		inputTextElement = driver.findElement(By.xpath("//input[@id='billing_city']"));
		inputTextElement.sendKeys("Uttara");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,200)","");
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//span[@aria-label='District']"));
		inputTextElement.click();
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.cssSelector("#select2-billing_state-container"));
		inputTextElement.click();
		Thread.sleep(3000);
		
//		inputTextElement = driver.findElement(By.xpath("//input[@aria-autocomplete='list']"));
//		inputTextElement.sendKeys("Dhaka");
//		Thread.sleep(3000);
		
		
		inputTextElement = driver.findElement(By.xpath("//input[@id='billing_postcode']"));
		inputTextElement.sendKeys("1230");
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//input[@id='billing_phone']"));
		inputTextElement.sendKeys("01790891807");
		Thread.sleep(3000);
		
//		js.executeScript("window.scrollBy(0,200)","");
//		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//input[@id='billing_email']"));
		inputTextElement.sendKeys("safatmanzur@gmail.com");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,200)","");
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//input[@name='bKash_acc_no']"));
		inputTextElement.sendKeys("01790891807");
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//textarea[@id='order_comments']"));
		inputTextElement.sendKeys("Take in place my order and call me whenever you arrive.");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,200)","");
		Thread.sleep(3000);
			
		
		driver.quit();
				
	}	
	

}
