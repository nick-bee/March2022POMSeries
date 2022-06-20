package com.qa.opencart.test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//headless: no browser launching
		//testing is happening behind the scene
		//faster than normal mode
		
		//incognito mode: private
		
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		//co.setHeadless(true);
		co.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
			
		
		
		
		
		
		
		

	}

}
