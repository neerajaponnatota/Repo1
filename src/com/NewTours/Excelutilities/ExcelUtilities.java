package com.NewTours.Excelutilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {

	static XSSFWorkbook wb; // this is POI library referecne to a work book
	static XSSFSheet sheet; // this is POI library referencce to a sheet

	public static String getURL(String filePath, int Row, int Column, String Sheet) throws IOException{
		File src = new File(filePath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sheet=wb.getSheet(Sheet);
		String data = sheet.getRow(Row).getCell(Column).getStringCellValue();
		System.out.println("Value= " + data);
		return data;
	}
	
	public static void writeresult(String filePath, int Row, int Column, int Sheet, String Value) throws IOException{
		File src = new File(filePath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		
		sheet=wb.getSheetAt(Sheet);
		//if(Sheet!=0)
		sheet.createRow(Row);
		sheet.getRow(Row).createCell(Column).setCellValue(Value);
		//System.out.println("ROW###"+sheet.getRow(Row));
		
		FileOutputStream fout=new FileOutputStream(new File(filePath));
		wb.write(fout);
		System.out.println("Test Case Passed");
	
	}
	
	public static String getData(String filepath, int sheetnumber, int rownumber, int colnum) throws IOException {
		//System.out.println("Inside getData method");
		File src = new File(filepath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(sheetnumber);
		System.out.println("Column###"+colnum);
		String data = sheet.getRow(rownumber).getCell(colnum)
				.getStringCellValue();
		return data;
	}
	
	
	public int getRowCount(int sheetIndex) {
		System.out.println("Inside getRowsCount method");
		int rowcount = wb.getSheetAt(sheetIndex).getLastRowNum();
		return rowcount;
	}
	
}	