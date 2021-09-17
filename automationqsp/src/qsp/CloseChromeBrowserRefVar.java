package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChromeBrowserRefVar {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.close();

	}

}
