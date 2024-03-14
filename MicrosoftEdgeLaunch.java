package webBrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class MicrosoftEdgeLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "D:\\Software Testing\\Java\\Program Files\\Java_Programs_Eclipse\\AutomationTesting\\drivers\\msedgedriver.exe");
	EdgeOptions options = new EdgeOptions();
	options.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
	WebDriver driver = new EdgeDriver(options);
	driver.manage().window().maximize();
    driver.get("https://www.youtube.com/");
    
}
}
