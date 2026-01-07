package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static String[][] readData(){
		String fileName="src\\test\\resources\\excel\\Book2.xlsx";
		FileInputStream fis;
		XSSFWorkbook workBook=null;
		XSSFCell cell;
		try {
		fis=new FileInputStream(fileName);
		workBook=new XSSFWorkbook(fis);
		}catch(FileNotFoundException e) {
			System.out.println("File path or file name not correct");
		}catch(IOException e) {
			e.printStackTrace();
		}
		XSSFSheet sheet=workBook.getSheet("ProductDetails");
		int rowCount=sheet.getLastRowNum();
		System.out.println("No of Rows: "+rowCount);
		
		DataFormatter df=new DataFormatter();
		String[][] data=new String[2][2];
		
		for(int rowNo=1;rowNo<=rowCount;rowNo++) {
			int cellCount=sheet.getRow(rowNo).getLastCellNum();
			for(int cellNo=0;cellNo<cellCount;cellNo++) {
				cell=sheet.getRow(rowNo).getCell(cellNo);
				sheet.getRow(rowNo).getCell(cellNo).getStringCellValue();
				data[rowNo-1][cellNo]=df.formatCellValue(cell);
				System.out.println(data[rowNo-1][cellNo]+"\t");
		}
		System.out.println();
	}
	return data;
	}

}