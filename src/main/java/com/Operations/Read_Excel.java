package com.Operations;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {

	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	public static FileInputStream fis;

	public static void init() throws Exception {
		fis = new FileInputStream(System.getProperty("user.dir") + "\\Urbanlader.xlsx");
		workbook = new XSSFWorkbook(fis);

		sheet = workbook.getSheetAt(0);

	}

	public static String getKey()
	{
		String srch=null;
		try
		{
			init();
			 srch= String.valueOf(sheet.getRow(1).getCell(7));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return srch;
		
	}

	public static String getSearch() throws Exception {
		init();
		String srch = String.valueOf(sheet.getRow(1).getCell(0));
		return srch;
	}

	public static String SName() throws Exception {
		init();
		String srch = String.valueOf(sheet.getRow(1).getCell(1));
		return srch;
	}

	public static String Semail() throws Exception {
		init();
		String srch = String.valueOf(sheet.getRow(1).getCell(2));
		return srch;
	}

	public static String Rname() throws Exception {
		init();
		String srch = String.valueOf(sheet.getRow(1).getCell(3));
		return srch;
	}

	public static String Remail() throws Exception {
		init();
		String srch = String.valueOf(sheet.getRow(1).getCell(4));
		return srch;
	}

	public static String Phoneno() throws Exception {
		
		init();
		
		DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
		String srch = formatter.formatCellValue(sheet.getRow(1).getCell(5));
		
		//String srch = String.valueOf(sheet.getRow(1).getCell(5));

		// int srch = (int)sheet.getRow(0).getCell(1).getNumericCellValue();
		return srch;
	}

	public static String Msg() throws Exception {
		init();
		String srch = String.valueOf(sheet.getRow(1).getCell(6));
		return srch;
	}

}
