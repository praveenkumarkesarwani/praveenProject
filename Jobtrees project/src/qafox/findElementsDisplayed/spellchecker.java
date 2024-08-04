package qafox.findElementsDisplayed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.github.diplombmstu.pyspellchecker.SpellChecker;

public class spellchecker {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prave\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Configure Chrome options (optional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        // Create a new instance of the Chrome driver
        ChromeDriver driver = new ChromeDriver(options);

        // Set implicit wait to handle dynamic elements
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to the webpage
        driver.get("https://jobtrees.com");  // Replace with your webpage URL

        // Find the paragraph element using its XPath or other locating strategy
        WebElement paragraphElement = driver.findElement(By.xpath("//p[@id='yourParagraphId']"));  // Replace with your actual XPath

        // Extract text from the paragraph
        String paragraphText = paragraphElement.getText();

        // Use SpellChecker from pyspellchecker library
        SpellChecker spellChecker = new SpellChecker();

        // Split the text into words
        String[] words = paragraphText.split("\\s+");

        // Get misspelled words
        List<String> misspelled = spellChecker.checkSpelling(words);

        // Iterate through misspelled words and highlight or print them
        for (String word : misspelled) {
            System.out.println("Misspelled word: " + word);
        }

        // Close the browser
        driver.quit();
    }
}
