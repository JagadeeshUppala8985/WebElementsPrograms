package com.AllElements.BasePage;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePage {
	public static String Browser;
	public static String Url;
	public WebDriver driver;

	public  BasePage() {
		try {
			Properties pro = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\WebElementsPrograms\\config.files\\config.Properties");
			try {
				pro.load(fis);
				Browser = pro.getProperty("Browser");
				Url = pro.getProperty("Url");
			} catch (Exception e) {
				System.out.println("Property file not load");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println("Property File not found");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// initialization of browser
	public void initialization() throws InterruptedException {
		if (Browser.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
				driver.manage().window().maximize();

		}
		else if (Browser.equalsIgnoreCase("Edge")){
			driver=new EdgeDriver();
		}
		else

		{
			try {
				throw new Exception(Browser + "Browser Not Found ");

			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		driver.get(Url);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
}
