package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeData {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		Workbook wb = WorkbookFactory.create(new FileInputStream("./testData/input.xlsx"));
		
		wb.getSheet("Sheet1").createRow(3).createCell(0).setCellValue("Karthik");
		
		wb.getSheet("Sheet1").getRow(3).createCell(1).setCellValue("MuniSwami");
		
		/*Write/Save The File*/
		wb.write(new FileOutputStream("./testData/input.xlsx"));
		

	}

}