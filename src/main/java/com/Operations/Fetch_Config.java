package com.Operations;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class Fetch_Config {
	public static FileInputStream fs;
	public static Properties prop;

	public static void init() {
		try {
			fs = new FileInputStream(System.getProperty("user.dir") + "\\Config\\config.properties");
			prop = new Properties();
			prop.load(fs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getUrl() {
		init();
		String url = prop.getProperty("Url");
		return url;
	}
	
	public static String getbrwsrnm() {
		init();
		String brwsrnm =  prop.getProperty("Browser");
		return brwsrnm;
	}
	
	public static String getSearchBox()
	{
		init();
		String box = prop.getProperty("Search_Box");
		return box;
		
	}
	public static String getPopup()
	{
		init();
		String pop = prop.getProperty("pop_up");
		return pop;
	}
	public static String Filter1_hover()
	{
		init();
		String pop = prop.getProperty("filter1_hover");
		return pop;
	}
	public static String Select_Bookshelves()
	{
		init();
		String pop = prop.getProperty("Bookshelves");
		return pop;
	}
	public static String Filter2_hover()
	{
		init();
		String pop = prop.getProperty("filter2_hover");
		return pop;
	}
	public static String price()
	{
		init();
		String pop = prop.getProperty("price");
		return pop;
	}
	public static String Filter3_hover()
	{
		init();
		String pop = prop.getProperty("filter3_hover");
		return pop;
	}
	public static String Storage_open()
	{
		init();
		String pop = prop.getProperty("Storage_open");
		return pop;
	}
	public static String Filter4_hover()
	{
		init();
		String pop = prop.getProperty("filter4_hover");
		return pop;
	}
	public static String In_stock()
	{
		init();
		String pop = prop.getProperty("In_stock");
		return pop;
	}
	public static String Collection_Hover()
	{
		init();
		String pop = prop.getProperty("Collection_hover");
		return pop;
	}
	public static String Fetch_Collection()
	{
		init();
		String pop = prop.getProperty("Fetch_Collection");
		return pop;
	}
	public static String Collection_text()
	{
		init();
		String pop = prop.getProperty("Collection_Text");
		return pop;
	}
	public static String Gift_Card()
	{
		init();
		String pop = prop.getProperty("Gift_Card");
		return pop;
	}
	public static String Gift_Card2()
	{
		init();
		String pop = prop.getProperty("Gift_Card2");
		return pop;
	}
	public static String Selecting_Gift()
	{
		init();
		String pop = prop.getProperty("Selecting_Gift");
		return pop;
	}
	public static String Gift_Price()
	{
		init();
		String pop = prop.getProperty("Gift_Price");
		return pop;
	}
	public static String gift_btn2()
	{
		init();
		String pop = prop.getProperty("gift_btn2");
		return pop;
	}
	public static String Gift_input1()
	{
		init();
		String pop = prop.getProperty("Gift_input1");
		return pop;
	}
	public static String Gift_input2()
	{
		init();
		String pop = prop.getProperty("Gift_input2");
		return pop;
	}
	public static String Gift_input3()
	{
		init();
		String pop = prop.getProperty("Gift_input3");
		return pop;
	}
	public static String Gift_input4()
	{
		init();
		String pop = prop.getProperty("Gift_input4");
		return pop;
	}
	public static String Gift_input5()
	{
		init();
		String pop = prop.getProperty("Gift_input5");
		return pop;
	}
	public static String Gift_input6()
	{
		init();
		String pop = prop.getProperty("Gift_input6");
		return pop;
	}
	public static String Gift_Submit()
	{
		init();
		String pop = prop.getProperty("Gift_Submit");
		return pop;
	}
	public static String Err_msg()
	{
		init();
		String pop = prop.getProperty("Err_msg");
		return pop;
	}
	public static String name()
	{
		init();
		String pop = prop.getProperty("name");
		return pop;
	}
	public static String price_number()
	{
		init();
		String pop = prop.getProperty("price_number");
		return pop;
	}
	public static String small()
	{
		init();
		String pop = prop.getProperty("small");
		return pop;
	}
}
