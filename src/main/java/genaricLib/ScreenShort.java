package genaricLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShort {
	public void getscreenshort(WebDriver driver,String name) throws IOException {
		
		Date d=new Date();
		String curentdate = d.toString().replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver; 
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(AutoConstant.photoPath+curentdate+name+".png");
		FileUtils.copyFile(src, dest);
	}
	
	

}
