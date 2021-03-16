package com.automation.pom.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {


public static void writeData() throws Throwable {
	File f = new File("C:\\Users\\hp\\Desktop\\Data.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
Sheet sheet = wb.createSheet("user_data2");
Row createRow = sheet.createRow(0);
Cell createCell = createRow.createCell(0);
createCell.setCellValue("username");
wb.getSheet("user_data2").getRow(0).createCell(1).setCellValue("password");
wb.getSheet("user_data2").getRow(0).createCell(2).setCellValue("user_id");
wb.getSheet("user_data2").createRow(1).createCell(0).setCellValue("priya");
wb.getSheet("user_data2").getRow(1).createCell(1).setCellValue("123p");
wb.getSheet("user_data2").getRow(1).createCell(2).setCellValue("123");
wb.getSheet("user_data2").createRow(2).createCell(0).setCellValue("kathir");
wb.getSheet("user_data2").getRow(2).createCell(1).setCellValue("456k");
wb.getSheet("user_data2").getRow(2).createCell(2).setCellValue("456");
wb.getSheet("user_data2").createRow(3).createCell(0).setCellValue("leyah");
wb.getSheet("user_data2").getRow(3).createCell(1).setCellValue("789l");
wb.getSheet("user_data2").getRow(3).createCell(2).setCellValue("789");
wb.getSheet("user_data2").createRow(4).createCell(0).setCellValue("sush");
wb.getSheet("user_data2").getRow(4).createCell(1).setCellValue("124s");
wb.getSheet("user_data2").getRow(4).createCell(2).setCellValue("124");
FileOutputStream fos=new FileOutputStream(f);
wb.write(fos);
wb.close();
System.out.println("**sheet created***");
}

public static void main(String[] args) throws Throwable {
writeData();



}





}
