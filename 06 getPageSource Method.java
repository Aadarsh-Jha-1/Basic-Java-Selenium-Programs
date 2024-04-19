package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetPageSource {
	
	public static void main(String[] args) {
		
        // Create a new instance of ChromeDriver
        ChromeDriver driver=new ChromeDriver();
        
        // Navigate to the specified URL
        driver.get("https://demowebshop.tricentis.com/");
     
        // Print the page source of the current webpage
        System.out.println("Page Source:\n" + driver.getPageSource());
	}

}
