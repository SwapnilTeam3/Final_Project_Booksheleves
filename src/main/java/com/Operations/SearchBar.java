package com.Operations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Reports.Html_Reporter;
import com.Reports.Screenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.main.Runner;



public class SearchBar extends Runner 
{
	static WebDriver driver=null;
	
	public SearchBar(WebDriver driver)
	{
		this.driver=driver;
	}
	//Display the name & price of first 3 Bookshelves below Rs. 15000, with Storage type as open & exclude out of stock
	@SuppressWarnings("deprecation")
	@Test
	public static void print_3() throws Exception
	{
		
		logger=r.createTest("Entering Keyword");
		String keyword=Read_Excel.getKey();
		driver.findElement(By.id(Fetch_Config.getSearchBox())).sendKeys(keyword);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Screenshot.takeScreenShot("Searchedkey", driver);
		
		logger.log(Status.PASS,"keyword Inserted");
		logger.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\Screenshots\\SearchedKey.jpg");
		driver.findElement(By.id("search_button")).click();
		Thread.sleep(5000);
		
		logger=r.createTest("Closing Pop-up");
		WebElement a = driver.findElement(By.xpath(Fetch_Config.getPopup()));
		Screenshot.takeScreenShot("Pop_up", driver);
		Actions act = new Actions(driver);
		act.moveToElement(a).click().build().perform();
		logger.log(Status.PASS,"Pop-Up Closed");
		logger.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\Screenshots\\Pop_up.jpg");
		
		WebElement b = driver.findElement(By.xpath(Fetch_Config.Filter1_hover()));
		act.moveToElement(b).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(Fetch_Config.Select_Bookshelves())).click();
		
		WebElement c = driver.findElement(By.xpath(Fetch_Config.Filter2_hover()));
		act.moveToElement(c).build().perform();
		Thread.sleep(3000);
		logger=r.createTest("Setting Price");
		WebElement d = driver.findElement(By.xpath(Fetch_Config.price()));
		act.moveToElement(d).click().dragAndDropBy(d,-167, 0).build().perform();
		Screenshot.takeScreenShot("Price", driver);
		Thread.sleep(3000);
		logger.log(Status.PASS,"Priced Set Succesfully");
		logger.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\Screenshots\\Price.jpg");
		
		WebElement e = driver.findElement(By.xpath(Fetch_Config.Filter3_hover()));
		Actions op = new Actions(driver);
		op.moveToElement(e).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(Fetch_Config.Storage_open())).click();
		
		WebElement f = driver.findElement(By.xpath(Fetch_Config.Filter4_hover()));
		Actions cl = new Actions(driver);
		cl.moveToElement(f).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(Fetch_Config.In_stock())).click();
		Thread.sleep(3000);
		
		List<WebElement> name = driver.findElements(By.xpath(Fetch_Config.name()));
		List<WebElement> price = driver.findElements(By.xpath(Fetch_Config.price_number()));
		
		List<WebElement> desc = driver.findElements(By.xpath(Fetch_Config.small()));
		System.out.println("The Name & Price of first 3 Bookshelves below Under Rs. 15000, with Storage type as open & exclude out of stock Are :-");
		
		for(int i=0; i<3; i++)
		{
		
		if((price.get(i).getText()).equals((price.get(i+1).getText()))) {
			System.out.println(name.get(i).getText()+" - "+price.get(i).getText());
			System.out.println(desc.get(i).getText());
			System.out.println(name.get(i+1).getText()+" - "+price.get(i+1).getText());
			System.out.println(desc.get(i+1).getText());
			i=i+1;
		}
		
		else{
			System.out.println(name.get(i).getText()+" - "+price.get(i).getText());
		}
		
		}
		Screenshot.takeScreenShot("urbanLaddder1",driver);
		PageFactory.initElements(driver,Collections_Hover.class);
		Collections_Hover.print_collections();
	}

}
