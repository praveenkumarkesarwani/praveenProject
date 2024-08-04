import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test 
{
	WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

	@Test
	public void TC001_first_page()
	{
		String s = driver.findElement(By.xpath("//div[@class = 'jt-banner-des text-sm tablet:text-xl text-light max-w-[650px] mb-12']")).getText();
		String s1 = "test";//data from excel sheet; replace test with data from excel sheet
		Assert.assertEquals(s, s1, "The string is not matching for banner");	
		
	}
	
	@Test
	public void TC002_first_page() throws InterruptedException
	{
		Thread.sleep(35000);
		String s = driver.findElement(By.xpath("//div[@class = 'jt-banner-des text-sm tablet:text-xl text-light max-w-[650px] mb-12']")).getText();
		String s1 = "test";//data from excel sheet; replace test with data from excel sheet
		Assert.assertEquals(s, s1, "The string is not matching for banner");	
		
	}
	
	/*
	 *  use below maven dependency
	 *  
	 <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.6.0</version>
    </dependency>
	 */