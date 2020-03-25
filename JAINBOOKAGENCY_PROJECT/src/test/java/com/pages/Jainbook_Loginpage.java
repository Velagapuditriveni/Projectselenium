package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.excelutility.ExcelTestdata;

public class Jainbook_Loginpage {
WebDriver driver;
	
	By login=By.linkText("Login");
	By Email=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[1]/input");
	By password=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[2]/input");
	 By popup= By.xpath("//*[@id=\"msgdiv\"]/div/div/div");
	 By  firstx = By.xpath("//*[@id=\"msgdiv\"]/div/div/button/span");
	 By secondx = By.xpath("//*[@id=\"myModal\"]/div/div/button/span");

	By loginsubmit=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[3]/input");
	By Myaccount=By.xpath("//*[@id=\"form1\"]/div[3]/header/div[2]/div/div[1]/div/ul/li/a/span[1]");
	By advancesearch=By.xpath("//*[@id=\"navigation\"]/ul/li[1]/a");
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
	
	public void LoginDetails(int i) throws IOException 
	{   ExcelTestdata a =new ExcelTestdata();
		driver.findElement(login).click();
		
		
		driver.findElement(Email).sendKeys(a.excel_username(i)); // passing the vaild mail
		driver.findElement(password).sendKeys(a.excel_password(i)); // passing the vaild password
		driver.findElement(loginsubmit).click();
		driver.findElement(advancesearch).click();
		
	}
	
	public void submit() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		driver.findElement(Myaccount).click();
		WebElement a=driver.findElement(logout);
		Actions act=new Actions(driver);
		act.moveToElement(a).click();
		Thread.sleep(300);	
		Screenshot("C:\\Users\\triveni\\Desktop\\Projectframework\\src\\test\\resources\\Screenshot\\logout1.png");
		driver.close(); // close the current tab
	}
	public void Screenshot(String path) throws IOException
	{
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(path));
	}
}
