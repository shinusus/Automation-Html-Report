package com.Automatingtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility_Files {
	public static WebDriver driver;
	public static String value;
	public static WebDriver browserlaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Drivr\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\Drivr\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void geturl(String url) {
		driver.get(url);
	}
	public static void ClickOnElement(WebElement element) {
		element.click();
	}
	public static void inputvalue(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void Actions(WebElement element,String value) {
		Actions act=new Actions(driver);
		if (value.equalsIgnoreCase("move")) {
			act.moveToElement(element).build().perform();
		}
		else if (value.equalsIgnoreCase("rightclick")) {
			act.contextClick().build().perform();
		}
		else if (value.equalsIgnoreCase("click")) {
			act.click().build().perform();
		}
	}
	public static void dropdown(WebElement element,String type,String value) {
		Select s =new Select(element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
		else if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
	}
	public static void implicit() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void explicitwait(WebElement element) {
		WebDriverWait w= new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static String getdata(String path, int row_index,int cell_index ) throws IOException {
		File f=new File(path);
		FileInputStream fis= new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(row_index);
		Cell c = r.getCell(cell_index);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
			 value = c.getStringCellValue();
			System.out.println(value);
		}
		else if (type.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();
			int i=(int) d;
			value = Integer.toString(i);
			System.out.println(value);
		}
		return value;
	}
	public static void javascript(WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].ScrollIntoView();",element);

	}
}
