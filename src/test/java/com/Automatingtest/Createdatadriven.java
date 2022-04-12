package com.Automatingtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Createdatadriven {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Windows\\Desktop\\TestBook1.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		wb.createSheet("data").createRow(0).createCell(0).setCellValue("Email");
		wb.getSheet("data").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("data").createRow(1).createCell(0).setCellValue("stella");
		wb.getSheet("data").getRow(1).createCell(1).setCellValue(587);
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Done");
		wb.close();
	}
	

}
