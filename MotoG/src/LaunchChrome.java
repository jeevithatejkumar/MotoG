

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumhq.org/");
		
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		
		System.out.println("Page title is "+title);
		
		driver.close();

	}

}
