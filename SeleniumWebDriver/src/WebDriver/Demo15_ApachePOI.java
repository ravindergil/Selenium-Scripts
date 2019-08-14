package WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo15_ApachePOI {

	public static void main(String[] args) throws IOException {
		
		File fexcel = new File("C:\\Users\\RavinderGill\\Desktop\\AutoTestData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(fexcel);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		
		for(int i=0; i<=rowcount; i++){
			
			int columncount = sheet.getRow(i).getLastCellNum();
			
			for(int j=0; j<columncount; j++){
				String content = sheet.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(content);
				if(content.equals("https://opensource-demo.orangehrmlive.com/")){
					String URL = sheet.getRow(i).getCell(j).getStringCellValue();
					String userName = sheet.getRow(i).getCell(j + 1).getStringCellValue();
					String passWord = sheet.getRow(i).getCell(j + 2).getStringCellValue();
					System.out.println(URL + " and " + userName + " and " + passWord);
				}	
			} 
		}
		workbook.close();
		fis.close();
	}
}
