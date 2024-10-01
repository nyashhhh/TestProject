package SeleniumDemo1.SeleniumDemo1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.checker.units.qual.s;

public class Excel1 {

public static void main(String[] args) throws IOException {
		
		
		FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"/TestData/Demoexcel1.xlsx");
	   XSSFWorkbook W =new XSSFWorkbook(fi);
	   XSSFSheet S =  W.getSheet("Sheet1");
	   int totalrows=S.getLastRowNum();
	   int totalcol=S.getRow(0).getLastCellNum();
	   System.out.println(totalrows);
	   System.out.println(totalcol);
	   //System.out.println("Hello");
	   




















}

}
