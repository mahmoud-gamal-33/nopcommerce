package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{
	static FileInputStream fis = null;
	public FileInputStream getfileinFileInputStream()
	{
		String FilePath = System.getProperty("user.dir")+"/src/test/java/data/New Microsoft Excel Worksheet.xlsx";
		File srcfile = new File(FilePath);
		try {
			fis=new FileInputStream(srcfile);
		} catch (FileNotFoundException e) {
			System.out.println("errrrrrrror" +e.getMessage());		}
		return fis;
	}
	public Object [][] getexceldata() throws IOException
	{
		fis = getfileinFileInputStream();
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int noofrows =( sheet.getLastRowNum()+1);
		int noofcols = 4;
		String [][] myarray = new String [noofrows][noofcols];
		for (int i = 0; i < noofrows; i++)
		{
			for (int j = 0; j < noofcols; j++)
			{
				XSSFRow row = sheet.getRow(i);
				myarray[i][j] = row.getCell(j).toString();				
			}
		}
		workbook.close();
		return myarray;
	}

}
