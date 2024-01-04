package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData
{
  public static String readPropertyfile(String value) throws IOException
  {
	  Properties prop=new Properties();
	  FileInputStream file=new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace NEW\\project_selenium_29Batch\\TestData\\config.properties");
      prop.load(file);
	  return prop.getProperty(value);
	  }
        public static String readExel(int rowNum,int colNum) throws EncryptedDocumentException, IOException
        {
        	FileInputStream file=new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace NEW\\project_selenium_29Batch\\TestData\\Book1.xlsx");
        	Sheet es = WorkbookFactory.create(file).getSheet("Sheet3");
        	String value = es.getRow(rowNum).getCell(colNum).getStringCellValue();
		    return value;
        	
        }
}
