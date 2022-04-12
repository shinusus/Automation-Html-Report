package com.Automatingtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrivencolumn {
	public static void particular_column() throws IOException {
		File f= new File("C:\\Users\\Windows\\eclipse-workspace\\Automatingtest\\TestBook1.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		int rows = s.getPhysicalNumberOfRows();
		for (int i = 0; i < rows; i++) {
			Row r = s.getRow(i);
			Cell c = r.getCell(1);
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
		particular_column();
	}

}
