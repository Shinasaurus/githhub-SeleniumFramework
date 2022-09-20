package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadXLSdata {

	
@DataProvider(name ="exceldp")
public static String[][] getData(Method m) throws EncryptedDocumentException, IOException {
	
	
	File file = new File(System.getProperty("user.dir")+ "\\src\\test\\resources\\testData\\testdata.xlsx");
	FileInputStream fis = new FileInputStream(file);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet1 = wb.getSheet(m.getName());
	int totalRows = sheet1.getLastRowNum();
	int totalCols = sheet1.getRow(0).getLastCellNum();
	
	DataFormatter df = new DataFormatter();
	
	String[][] testData = new String[totalRows][totalCols];
	
	for (int i=1; i<=totalRows; i++) {
		for (int j=0; j<totalCols;j++) {
			
			testData[i-1][j] = df.formatCellValue(sheet1.getRow(i).getCell(j));
			
			
			
		}
	}
	return testData;
}

}