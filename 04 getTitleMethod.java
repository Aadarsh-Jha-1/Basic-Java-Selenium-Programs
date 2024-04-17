
package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetTitle {
	
	public static void main(String[] args) {
		
        // Create a new instance of ChromeDriver
        ChromeDriver driver=new ChromeDriver();
        
        // Navigate to the specified URL
        driver.get("https://demowebshop.tricentis.com/");
        
        // Print the title of the current webpage
        System.out.println("Title:"+driver.getTitle());
	}

}
