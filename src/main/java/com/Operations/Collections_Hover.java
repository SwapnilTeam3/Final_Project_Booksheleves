package com.Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Reports.Screenshot;
import com.aventstack.extentreports.Status;
import com.main.Runner;

public class Collections_Hover extends Runner {

	static WebDriver driver=null;
	public Collections_Hover(WebDriver driver)
	{
		this.driver=driver;
	}
	@Test
	public static void print_collections() throws Exception
	{	
		  logger=r.createTest("Fetching Collections");
		  Actions at = new Actions(driver);
	      at.sendKeys(Keys.PAGE_UP).build().perform();
	      Thread.sleep(3000);
	      logger.log(Status.PASS,"Fetched");
		  logger.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\Screenshots\\Collections.jpg");
	      
	      logger=r.createTest("Selecting Being-at-Home");
	      logger.log(Status.FAIL,"Unable to Find");
		  logger.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\Screenshots\\Collections.jpg");
	      
	      
	      //***** Collection *****//
	      
	      WebElement g = driver.findElement(By.xpath(Fetch_Config.Collection_Hover()));
	      Actions act = new Actions(driver);
	      act.moveToElement(g).build().perform();
	      Screenshot.takeScreenShot("Collections", driver);
		  Thread.sleep(2000);
		  
			
		  
		  List<WebElement> aa = driver.findElements(By.xpath(Fetch_Config.Fetch_Collection()));
		  
		  
		  System.out.println(driver.findElement(By.xpath(Fetch_Config.Collection_text())).getText());
		  
		  for(WebElement x : aa) {
			  System.out.println(x.getText());
		  }
		  	PageFactory.initElements(driver,Gift_Card.class);
		  	Gift_Card.giftcard();
	}

}
