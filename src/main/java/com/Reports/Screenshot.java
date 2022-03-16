package com.Reports;

import java.io.File;
import java.io.IOException;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.main.Runner;



public class Screenshot{
@Test
public static void takeScreenShot(String fileName,WebDriver driver) throws Exception
{
File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"\\Screenshots\\"+fileName+".jpg"));
//FileUtils.copyFile(file, new File("/Final_Project_Booksheleves/Screenshots"+fileName+".jpg"));

}



}