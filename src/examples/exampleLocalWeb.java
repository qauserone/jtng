package examples;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class exampleLocalWeb {
	
	static String Url = "file:///home/devuser/Downloads/html/ContactFrom_v8/index.html";
 	
	//int
	static int element_cant= 5;
	static int input_cant = 3;
	static int check_cant = 1;
	static int cmd_cant = 1;
	
	//xpath
	static String Title_xpath="/html/body/div[1]/div[2]/form/span";
	static String input_Name_xpath="/html/body/div[1]/div[2]/form/div[1]/input";
	static String input_Email_xpath="/html/body/div[1]/div[2]/form/div[2]/input";
	static String input_Description_xpath="/html/body/div[1]/div[2]/form/div[3]/textarea";
	static String check_send_email_xpath="/html/body/div[1]/div[2]/form/div[4]/label";
	static String cmd_send_xpath="/html/body/div[1]/div[2]/form/div[5]/button";
	
	//Values
	static String actualTitle = "";
	static String expectedTitle = "Contact V8";
	
	
			 public static void main(String[] args) {
				System.out.println("public static void main");
		    	System.setProperty("webdriver.firefox.marionette","/usr/local/bin/geckodriver");
		    	System.out.println("setProperty(\"webdriver.firefox.marionette\",\"/usr/local/bin/geckodriver");
		    	System.out.println("WebDriver driver = new FirefoxDriver();");
		    	WebDriver driver = new FirefoxDriver();
		    	System.out.println("System.out.println(\"WebDriver driver = new FirefoxDriver()");
		    	driver.get(Url);
		    	System.out.println("driver.get(Url)");
	         	GetTitle(driver,Title_xpath,actualTitle);
	         	System.out.println("Titulo actual: "+ GetTitle(driver,Title_xpath,actualTitle));
	         	
	         	System.out.println("expectedTitle " + expectedTitle);
	         	System.out.println("actualTitle " + actualTitle);
	         	
	         	ValidateTitle(driver,actualTitle,expectedTitle);
	         	validacionCaso(actualTitle,expectedTitle);
	         	
	         	
//	         	System.out.println("Titulo actual: "+actualTitle);
	         	
	         	
//		        validacionCaso(actualTitle,expectedTitle);
		        System.out.println("//close Firefox");
	         	
		        driver.close();
	    }

	public static String GetTitle(WebDriver driver,String Title_xpath, String actualTitle) {
	    System.out.println("GetTitle");
		driver.findElement(By.xpath(Title_xpath)).getText();
        actualTitle = driver.getTitle();
        return actualTitle;
		
	}	
	
	public static boolean ValidateTitle(WebDriver driver,String actualTitle, String expectedTitle) {
		System.out.println("ValidateTitle");
		GetTitle(driver,Title_xpath,actualTitle);
		return result(actualTitle,expectedTitle);
		
		
	}
		
	
	public static boolean result(String actualTitle, String expectedTitle) {
		if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
            return true;
        } else {
            System.out.println("Test Failed");
            return false;
        }
	}
	
			 
	public static void validacionCaso(String actualTitle,String expectedTitle) {
		System.out.println("validacionCaso");
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
    }
	
	
	
	
	
	

}
