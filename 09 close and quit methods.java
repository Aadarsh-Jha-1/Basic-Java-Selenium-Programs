package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandCloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://www.shoppersstack.com/products_page/6");

        // Wait for 5 seconds
        Thread.sleep(5000);

        // Click on an element with id "compare"
        driver.findElement(By.id("compare")).click();

        // Wait for 2 seconds
        Thread.sleep(2000);

        // Print the window handles (IDs)
        System.out.println("Window Handles: " + driver.getWindowHandles());

        // Close the current window (main window)
        // driver.close();

        // Close all windows and terminate the WebDriver session
        driver.quit();
    }
}
