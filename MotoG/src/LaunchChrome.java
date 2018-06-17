

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome 
{
	//Comment from Eclipse
	//Comment from Github
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumhq.org/");
		
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		
		System.out.println("Page title is "+title);
		
		String url = driver.getCurrentURL();
		
		System.out.println("The page current url is: "+url);
		
		driver.close();

	}

}
