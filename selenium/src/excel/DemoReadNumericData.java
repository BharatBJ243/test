package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoReadNumericData {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		Workbook wb = WorkbookFactory.create(new FileInputStream("./testData/input.xlsx"));
		 String un = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		System.out.println(un);
		String pwd = wb.getSheet("Sheet1").getRow(1).getCell(1).toString();
		System.out.println(pwd);

	}

}
