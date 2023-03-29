package com.ecommerce.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.tools.sjavac.Log;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public Properties prop;
	public static WebDriver driver;
	//public static Logger logger = LogManager.getLogger(Base.class);

	
	public Base() {
		
		//to read properties files
		prop= new Properties();
		
		FileInputStream ip = null;

		try {
			
			ip = new FileInputStream("D:\\Application\\eclipse-java-2021-06-R-win32-x86_64\\eclipse\\"
					+ "TutorialsNinja\\Configuration\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		;
			
		}
		try {
			prop.load(ip);
			
		 //  Log.info("properties file loaded");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		//Log.error("Exception Occured" +e);

		}
	}
	
	
	public void intialisation() {
		
		
		String BrowserName=prop.getProperty("browser");
		
		if(BrowserName.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			//Log.debug("Chrome browser is launched!!!!");	
			} else if(BrowserName.equals("ff")) {
			
			driver= new FirefoxDriver();
		}
		
		
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("URL"));
		
	//	Log.info("Browser is Launched"+BrowserName);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	
	
	

}
