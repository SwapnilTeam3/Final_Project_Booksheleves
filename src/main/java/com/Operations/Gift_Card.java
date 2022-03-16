package com.Operations;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Reports.Screenshot;
import com.aventstack.extentreports.Status;
import com.main.Runner;

public class Gift_Card extends Runner {

	static WebDriver driver=null;
	public Gift_Card(WebDriver driver)
	{
		this.driver=driver;
	}
	@Test
	public static void giftcard() throws Exception
	{

		String sname=Read_Excel.SName();
		String semail=Read_Excel.Semail();
		String Rname=Read_Excel.Rname();
		String Remail=Read_Excel.Remail();
	    String phoneno=Read_Excel.Phoneno();
		String msg=Read_Excel.Msg();
		driver.findElement(By.xpath(Fetch_Config.Gift_Card())).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		
		try {
		
		WebElement h = driver.findElement(By.xpath(Fetch_Config.Gift_Card2()));
		Actions o = new Actions(driver);
		o.moveToElement(h).build().perform();
		Thread.sleep(3000);
		  logger=r.createTest("Selecting Gift-Card");
		  driver.findElement(By.xpath(Fetch_Config.Selecting_Gift())).click();
	      Screenshot.takeScreenShot("Gift_card", driver);
		  logger.log(Status.PASS,"Gift Card Selected Succesfully");
		  logger.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\Screenshots\\Gift_card.jpg");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Fetch_Config.Gift_Price())).click();
		driver.findElement(By.xpath(Fetch_Config.gift_btn2())).click();
		
		driver.findElement(By.xpath(Fetch_Config.Gift_input1())).sendKeys(sname);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Fetch_Config.Gift_input2())).sendKeys(Rname);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Fetch_Config.Gift_input3())).sendKeys(semail);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Fetch_Config.Gift_input4())).sendKeys(Remail);
		Thread.sleep(2000);
		
		/*
		 * DataFormatter formatter = new DataFormatter(); //creating formatter using the
		 * default locale Cell phoneCell = wsObject.getRow(1).getCell(2);
		 * CarInsurance.PhoneNumber=formatter.formatCellValue(phoneCell);
		 */
		
		
		driver.findElement(By.xpath(Fetch_Config.Gift_input5())).sendKeys(phoneno);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Fetch_Config.Gift_input6())).sendKeys(msg);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(Fetch_Config.Gift_Submit())).click();
		
		Thread.sleep(5000);
		
		
		} catch(Exception ex) {
			System.out.println(ex);
			//System.out.println(printStackTrace(e));
		}
		logger=r.createTest("Fetching Error Message");
		String abc = driver.findElement(By.xpath(Fetch_Config.Err_msg())).getAttribute("validationMessage");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Screenshot.takeScreenShot("Err", driver);
		logger.log(Status.PASS,"Error Message Fetched");
		logger.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\Screenshots\\Err.jpg");
		System.out.println(abc);
		driver.quit();
	}

}
