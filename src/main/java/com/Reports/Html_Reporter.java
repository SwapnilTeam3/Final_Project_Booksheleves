package com.Reports;

import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Html_Reporter {
	//Create file format and all
		public static ExtentHtmlReporter htmlreporter;
		//Actual Report
		public static ExtentReports report;
	
	public static ExtentReports getReport()
	{
		Date d=new Date();
		String time=d.toString();
		time=time.replace(" ","_");
		time=time.replace(":","_");
		htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Reports\\"+time+".html");
		report=new ExtentReports();
		report.attachReporter(htmlreporter);
		report.setSystemInfo("OS","Windows 10");
		
		return report;
	}

}
