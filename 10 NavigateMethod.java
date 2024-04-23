package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithNavigate {
    public static void main(String[] args) throws InterruptedException  {
        // Create a ChromeDriver instance
        ChromeDriver driver = new ChromeDriver();
        // Navigate to the specified URL
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        // Print the title after navigation
        System.out.println("Title after navigation: " + driver.getTitle());
        // Click on the "Register" link
        driver.findElement(By.linkText("Register")).click();        
        // Print the title after clicking on the "Register" link
        System.out.println("Title after clicking on register link: " + driver.getTitle());
        Thread.sleep(2000);        
        // Navigate back to the previous page
        driver.navigate().back();
        System.out.println("Title after back method: " + driver.getTitle());        
        // Navigate forward to the next page
        driver.navigate().forward();
        System.out.println("Title after forward method: " + driver.getTitle()); 
        // Refresh the current page
        driver.navigate().refresh();
        System.out.println("Title after refresh method: " + driver.getTitle());        
        // Navigate to a new URL
        driver.navigate().to("https://www.selenium.dev/downloads/");
        System.out.println("Title after 'to' method: " + driver.getTitle());
        Thread.sleep(4000);  
        // Quit the browser session
        driver.quit();
    }
}
