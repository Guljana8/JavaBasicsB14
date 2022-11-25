package Class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        //1. We need to know path of the file
        String path="Data/Test.xlsx";
        //2. Navigate to path and open file
        FileInputStream fileInputStream=new FileInputStream(path);
        //3. that special that can handle the xlsx files
        XSSFWorkbook excelFile=new XSSFWorkbook(fileInputStream);
        Sheet sheet=excelFile.getSheet("Sheet1");
        Row row0=sheet.getRow(0);
        System.out.println(row0.getCell(0));
        //get the data from raw 1
        Row row1=sheet.getRow(1);
        System.out.println(row1.getCell(0));




    }
}
