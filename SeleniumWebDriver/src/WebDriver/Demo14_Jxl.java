package WebDriver;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Demo14_Jxl {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, BiffException {
		
		// Step 1 : 
		File fexcel = new File("C:\\Users\\RavinderGill\\Desktop\\AutoTestData\\WriteTestData.xls");
		
		// Step 2 : 
		WritableWorkbook writebook = Workbook.createWorkbook(fexcel);
		
		// Step 3 : 
		writebook.createSheet("Training", 0);
		
		// Step 4 :
		WritableSheet writeSheet = writebook.getSheet(0);
		
		Label Testdata1 = new Label(0, 0, "Sunil");
		
		writeSheet.addCell(Testdata1);
		
		Label Testdata2 = new Label(0, 0, "Niharika");
		
		writeSheet.addCell(Testdata2);
		
		writebook.write();
		writebook.close();

		
		Workbook wb = Workbook.getWorkbook(new File("C:\\Users\\RavinderGill\\Desktop\\AutoTestData\\WriteTestData.xls")); 	
		Sheet sheet = null;
		
		int noofSheets = wb.getNumberOfSheets();
		System.out.println(noofSheets);
		
		Cell cell = null;
		
		for(int i=0; i<=noofSheets; i++){
			sheet = wb.getSheet(i);
			int noofRows = sheet.getRows();
			int noofCells = sheet.getColumns();
			System.out.println(wb.getSheet(i).getName());
			
			for(int j=0; j<noofRows; j++){
				cell = sheet.getCell(j, i);
				
				if(cell.getContents().length()>0){
					System.out.println(cell.getContents());
				}
			}
		}	
	}
}
