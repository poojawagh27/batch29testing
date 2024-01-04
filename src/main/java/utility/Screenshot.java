package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import base.TestBase;

public class Screenshot extends TestBase
{
    public static String getDate()
    {
		return new SimpleDateFormat("dd-MM-YYY ss-mm-HH").format(new Date());
    	
    }
    public static void Screenshot(String nameOfMethod) throws IOException
    {
    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dest=new File("C:\\Users\\Administrator\\eclipse-workspace NEW\\project_selenium_29Batch\\Screenshot\\"+nameOfMethod+"--------"+getDate()+".jpeg");
    FileHandler.copy(source, dest);
    }
}
