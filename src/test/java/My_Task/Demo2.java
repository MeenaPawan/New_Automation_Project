package My_Task;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class Demo2 
{
	public static void ExcelData(WebElement element,String Sheetname,int Row,int Cell) throws Exception
	{
		String path="C:\\Users\\DELL\\eclipse-workspace\\AUTOMATION_PROJECT\\ExcelData\\TestData.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String str=wb.getSheet(Sheetname).getRow(Row).getCell(Cell).getStringCellValue();
		
		//WebElement SearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element.sendKeys(str);
	}
}
