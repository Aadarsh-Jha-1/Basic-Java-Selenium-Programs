package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetWindowHandle {
	
	public static void main(String[] args) {
		
        // Create a new instance of ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Navigate to the specified URL
        driver.get("https://demowebshop.tricentis.com/");
        
        // Retrieve and print the window handle ID
        System.out.println("ID:" + driver.getWindowHandle());
	}

}
