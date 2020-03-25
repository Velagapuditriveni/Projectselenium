package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Jainbook_Addtocartpage {
	WebDriver driver;
	 By login=By.linkText("Login");
	    By Email=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[1]/input");
	    By password=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[2]/input");
	    By loginsubmit=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[3]/input");
	   // By Advancesearch=By.xpath("/html/body/form/div[3]/header/nav/div[2]/ul/li[1]/a");
	   By advancesearch=By.xpath("//*[@id=\"navigation\"]/ul/li[1]/a");
	    By ISBN=By.id("txt_isbn");
		By Searchbutton=By.id("btn_advancedSearch");
	    By addtocart=By.xpath("/html/body/form/div[3]/div[2]/div/div/div/div[2]/div[6]/span/a");
	    By cshopping=By.id("btn_ContinueShopping");
	    By cartdetails=By.xpath("/html/body/form/div[3]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/a/span[1]");
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
	public void login()
    {
    	
		driver.findElement(login).click();
		driver.findElement(Email).sendKeys("trivenivspd@gmail.com"); // passing the vaild mail
		driver.findElement(password).sendKeys("Triveni@17"); // passing the vaild password
		driver.findElement(loginsubmit).click();
    }
	public void launchpage() throws InterruptedException // login the myntra page
	{
		driver.get("https://www.jainbookagency.com/india-largest-online-book-store.aspx");
		System.out.println(driver.getTitle());
		
		
	}
	public void add() throws InterruptedException , IOException
	{
		driver.findElement(advancesearch).click();
		
		driver.findElement(ISBN).sendKeys("9789387921511");
		driver.findElement(Searchbutton).click();
		Thread.sleep(3000);
		driver.findElement(addtocart).click();
		Thread.sleep(3000);
		driver.findElement(cshopping).click();
	}
		public void cdetails() throws InterruptedException, IOException
		{
		driver.findElement(cartdetails).click();
		Thread.sleep(3000);
		Screenshot("C:\\Users\\triveni\\Desktop\\Projectframework\\src\\test\\resources\\Screenshot\\AddtoCart1.jpg");
	}
	public void close_search() throws InterruptedException // closing the current tab
	{
		Thread.sleep(3000);
		driver.findElement(Myaccount).click();
		WebElement a=driver.findElement(logout);
		Actions act=new Actions(driver);
		act.moveToElement(a).click();
		Thread.sleep(300);	
		driver.close();
	}
	public void Screenshot(String path) throws IOException
	{
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(path));
	}
}
