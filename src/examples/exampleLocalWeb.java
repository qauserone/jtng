package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exampleLocalWeb {
	
	static String Url = "file:///home/devuser/Downloads/html/ContactFrom_v8/index.html";
	
			 public static void main(String[] args) {
		 // declaration and instantiation of objects/variables
//	    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
			System.setProperty("webdriver.firefox.marionette","/usr/local/bin/geckodriver");
			WebDriver driver = new FirefoxDriver();
//			//comment the above 2 lines and uncomment below 2 lines to use Chrome
//			System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
	        String baseUrl = "http://demo.guru99.com/test/newtours/";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";
	        // launch Fire fox and direct it to the Base URL
	        driver.get(Url);
	        // get the actual value of the title
	        String xpath="/html/body/div[1]/div[2]/form/span";
	        
	        
	        driver.findElement(By.xpath(xpath)).getText();
	        
	        
	        actualTitle = driver.getTitle();
	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	        //close Fire fox
	        driver.close();
	    }

	

}
