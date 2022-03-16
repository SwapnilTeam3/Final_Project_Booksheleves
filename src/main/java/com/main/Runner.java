package com.main;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Operations.Fetch_Config;
import com.Operations.SearchBar;
import com.Reports.Html_Reporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Runner {
	public static WebDriver driver = null;
	public static ExtentTest logger;
	public static ExtentReports r;

	@Test
	public static void init() throws Exception {
		r = Html_Reporter.getReport();
		String url = Fetch_Config.getUrl();
		String brwsrnm =Fetch_Config.getbrwsrnm();
		logger = r.createTest("Intializing Browser");
		if (brwsrnm.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		logger.log(Status.PASS, "Test Execution pass");
		driver.manage().window().maximize();
		driver.get(url);
		PageFactory.initElements(driver, SearchBar.class);
		SearchBar.print_3();
		r.flush();
	}

}
