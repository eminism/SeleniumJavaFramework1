package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectPath;
	static XSSFWorkbook workBook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {
		try {
			workBook = new XSSFWorkbook(excelPath);
			sheet = workBook.getSheet(sheetName);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	public static void main(String[] args) {

		// getRowCount();
		getCellDataString(0, 0);
		getCellDataNumeric(1, 1);

	}

	public static void getRowCount() {

		try {

			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows is: " + rowCount);

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			System.out.println(exp.getStackTrace());
		}
	}

	
	
	public static void getCellDataString(int rowNum, int colNum) {

		try {
		
			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			System.out.println(exp.getStackTrace());
		}

	}

	public static void getCellDataNumeric(int rowNum, int colNum) {

		try {
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			System.out.println(exp.getStackTrace());
		}

	}
}
