package com.automation.pom.test;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	public static void paticularData() throws Throwable {

		File f = new File("C:\\Users\\hp\\eclipse-workspace\\Automation_Practice\\automation practice excel2.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(2);
		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;
			System.out.println(value);
		}
		System.out.println("******AllData*****");
	}

	// allData
	public static void allData() throws Throwable {
		File f1 = new File("C:\\Users\\hp\\eclipse-workspace\\Automation_Practice\\automation practice excel2.xlsx");
		FileInputStream fis1 = new FileInputStream(f1);
		Workbook wb1 = new XSSFWorkbook(fis1);
		Sheet sheetAt = wb1.getSheetAt(0);
		int size = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < size; i++) {
			Row row = sheetAt.getRow(i);
			int cellsize = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellsize; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				} else if (cellType.equals(CellType.NUMERIC)) {

					double numericCellValue = cell.getNumericCellValue();
					int value = (int) numericCellValue;
					System.out.println(value);

				}

			}
		}
		System.out.println("*****RowData******");
	}

	// romData
	public static void rowData() throws Throwable {
		File f2 = new File("C:\\Users\\hp\\eclipse-workspace\\Automation_Practice\\automation practice excel2.xlsx");
		FileInputStream fis2 = new FileInputStream(f2);
		Workbook wb2 = new XSSFWorkbook(fis2);
		Sheet sheetAt = wb2.getSheetAt(0);

		Row row = sheetAt.getRow(2);
		int size = row.getPhysicalNumberOfCells();
		for (int i = 0; i < size; i++) {

			// System.out.println(i);
			//// System.out.println(row);

			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			} else if (cellType.equals(CellType.NUMERIC)) {

				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.println(value);

			}

		}

		System.out.println("******colunm data**********");

	}
	// column data

	public static void columnData() throws Throwable {

		File f3 = new File("C:\\Users\\hp\\eclipse-workspace\\Automation_Practice\\automation practice excel2.xlsx");
		FileInputStream fis3 = new FileInputStream(f3);
		Workbook wb3 = new XSSFWorkbook(fis3);
		Sheet sheetAt = wb3.getSheetAt(0);
		int size = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < size; i++) {
			Row row = sheetAt.getRow(i);
			// System.out.println(i);
			//// System.out.println(row);

			Cell cell = row.getCell(2);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			} else if (cellType.equals(CellType.NUMERIC)) {

				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.println(value);

			}
		}

	}

	public static void main(String[] args) throws Throwable {
		paticularData();
		allData();
		rowData();
		columnData();
	}
}