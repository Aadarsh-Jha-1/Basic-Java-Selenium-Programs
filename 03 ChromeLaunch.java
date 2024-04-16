// Import necessary Selenium WebDriver classes
package webBrowserLaunch;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeLaunch {
    public static void main(String[] args) {
        // Set the system property to point to the location of chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Java\\Program Files\\Java_Programs_Eclipse\\AutomationTesting\\drivers\\chromedriver.exe");
        
        // Create an instance of ChromeOptions to configure Chrome browser options
        ChromeOptions options = new ChromeOptions();
        
        // Set the binary path for the Chrome browser executable (if not in default location)
        options.setBinary("C:\\Users\\Aadarsh Jha\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        
        // Create a WebDriver instance using ChromeDriver and the configured options
        WebDriver driver = new ChromeDriver(options);
        
        // Maximize the browser window
        driver.manage().window().fullscreen();
        
        // Open the specified URL in the Chrome browser
        driver.get("https://www.youtube.com/");
    }
}
