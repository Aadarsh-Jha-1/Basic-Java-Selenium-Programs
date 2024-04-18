package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetCurrentUrl {
	
    public static void main(String[] args) throws InterruptedException {
        
        // Instantiate ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Open the specified URL
        driver.get("https://demowebshop.tricentis.com/");
        
        // Pause execution for 5 seconds 
        Thread.sleep(5000);   
        
        // Find the element and click on it
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")).click();
        
        // Print the current URL to the console
        System.out.println("URL:" + driver.getCurrentUrl());
    }
}
