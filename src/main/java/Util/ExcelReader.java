package Util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	XSSFWorkbook wb;
	XSSFSheet sheet;

	public ExcelReader(String filePath, String sheetName) throws IOException {
		wb = new XSSFWorkbook(filePath);
		sheet = wb.getSheet(sheetName);
	}

	public int getRowCount() {
		return sheet.getPhysicalNumberOfRows();
	}

	public int getColCount() {
		return sheet.getRow(0).getLastCellNum();
	}

	public String getCellValue(int rowNum, int colNum) {
		return sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	}

	public Object[][] getData() {
		int rowCount = getRowCount();
		int colCount = getColCount();
		Object[][] data = new Object[rowCount - 1][colCount];
		for (int row = 1; row < rowCount; row++) {
			for (int col = 0; col < colCount; col++) {
				data[row - 1][col] = getCellValue(row, col);
			}
		}
		return data;
	}
}
