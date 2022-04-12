package com.Automatingtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrivenrow {
	public static void particular_row() throws IOException {
		File f= new File("C:\\Users\\Windows\\eclipse-workspace\\Automatingtest\\TestBook1.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Sheet1");
		Row r = s.getRow(3);
		int cells = r.getPhysicalNumberOfCells();
		for (int i = 0; i < cells; i++) {
			Cell c = r.getCell(i);
			CellType type = c.getCellType();
			if (type.equals(CellType.STRING)) {
				String string = c.getStringCellValue();
				System.out.println(string);
			}
			else if (type.equals(CellType.NUMERIC)) {
				double d = c.getNumericCellValue();
				int v=(int) d;
				String a = Integer.toString(v);
				System.out.println(a);
			}
		}
		wb.close();
	}
	public static void main(String[] args) throws IOException {
		particular_row();
	}
	
}
