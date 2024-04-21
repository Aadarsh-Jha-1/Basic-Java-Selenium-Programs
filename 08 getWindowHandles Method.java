package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
        // Create a new instance of ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Navigate to the specified URL
        driver.get("https://www.shoppersstack.com/products_page/6");
        
        // Wait for 20 seconds 
        Thread.sleep(20000);
        
        // Click on an element with the ID "compare"
        driver.findElement(By.id("compare")).click();
        
        // Wait for 2 seconds 
        Thread.sleep(2000);
        
        // Retrieve and print the window handles
        System.out.println("ID:" + driver.getWindowHandles());
	}

}
