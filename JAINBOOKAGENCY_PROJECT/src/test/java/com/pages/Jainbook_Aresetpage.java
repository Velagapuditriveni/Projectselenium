package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Jainbook_Aresetpage {
	WebDriver driver;
	 By login=By.linkText("Login");
	    By Email=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[1]/input");
	    By password=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[2]/input");
	    By loginsubmit=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[3]/input");
	    By advancesearch=By.xpath("//*[@id=\"navigation\"]/ul/li[1]/a");
	    By text =By.id("txt_title");
	    By reset=By.xpath("//*[@id=\"ContentPlaceHolder1_div_advancedSearch\"]/div/div/div/div[4]/div[2]/input[2]");
	    By Myaccount=By.xpath("//span[@class='uname']");
		By logout=By.xpath("//*[@id=\"logout\"]");
	   
		public void launch(String browser) {
			
			try {
				//To launch firefox BROWSER
				if (browser.equalsIgnoreCase("firefox")) {
					driver = new FirefoxDriver();
				}
				// TO launch Chrome Browser
				else if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver","C:\\Users\\triveni\\Desktop\\Selenium jars\\chromedriver.exe");
					driver=new ChromeDriver();

				}
		   //to maximize the window
				driver.manage().window().maximize(); 
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//driver.get(url);
			
			} catch (WebDriverException e) {
				System.out.println(" browser could not be launched");
			}

		}
		public void LoginPage() //using webdriver get visting the testing website
		{
			driver.get("https://www.jainbookagency.com/india-largest-online-book-store.aspx");
			System.out.println(driver.getTitle());
		}
		public void login() throws IOException
	    {
	    	
			driver.findElement(login).click();
			driver.findElement(Email).sendKeys("trivenivspd@gmail.com"); // passing the vaild mail
			driver.findElement(password).sendKeys("Triveni@17"); // passing the vaild password
			driver.findElement(loginsubmit).click();
	    }
	    public void reset() throws InterruptedException
	    {
	    	driver.findElement(advancesearch).click();
	    	driver.findElement(text).sendKeys("green");
	    	Thread.sleep(3000);
	    	driver.findElement(reset).click();
	    	
	    }
	    public void close() throws InterruptedException
	    {
	    	Thread.sleep(3000);
			driver.findElement(Myaccount).click();
			WebElement a=driver.findElement(logout);
			Actions act=new Actions(driver);
			act.moveToElement(a).click();
			Thread.sleep(300);	
	    	driver.close();
	    }
}
