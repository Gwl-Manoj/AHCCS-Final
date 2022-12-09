package Library_Files;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility 
{
	
	
	
	
	public static String getdata(int rowindex, int cellindex) throws  IOException
	{																			
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test_Data\\Test_Data_Achievement_Chart.xlsx");
		Workbook workbook =WorkbookFactory.create(file);
		
		Sheet sheet = workbook.getSheet("Utility");
//		Sheet sheet = workbook.getSheetAt(0);
		
		Row row = sheet.getRow(rowindex);
		
		Cell cell = row.getCell(cellindex);
		
		String value = cell.getStringCellValue();
		
		
//		String value = WorkbookFactory.create(file).getSheet("Utility").getRow(rowindex).getCell(cellindex).getStringCellValue();
		return value;
	}
	
	public static Sheet getmultipledata(String sheetname) throws  IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test_Data\\Achievement_Multiple_Data_Final.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet(sheetname);
		return sh;
	}
	
//	public static String get_validations_data(int rowindex, int cellindex) throws EncryptedDocumentException, IOException
//	{													
//		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test_Data\\Achievement_Multiple_Data_Final.xlsx");
//		String value = WorkbookFactory.create(file).getSheet("Validations").getRow(rowindex).getCell(cellindex).getStringCellValue();
//		return value;
//	}
	
	
	
}
