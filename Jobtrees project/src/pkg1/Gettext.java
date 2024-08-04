package pkg1;

public class Gettext{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		// identify element
		WebElement p=driver.findElement(By.xpath("//h1"));
		//getText() to obtain text
		String s= p.getText();
		System.out.println("Text content is : " + s);
		driver.close();
	}
}
