package jobtrees_reading;

public class Jobtrees_reading 
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
