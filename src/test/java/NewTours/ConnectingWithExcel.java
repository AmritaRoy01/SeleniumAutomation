package NewTours;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnectingWithExcel {

    static WebElement element;
   
    public static void main(String[] args) throws IOException, InterruptedException {
    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        RegistrationPage RGPage = new RegistrationPage(driver);
        
        driver.get("https://demo.guru99.com/test/newtours/");

        Thread.sleep(5000);
    
        try {

            FileInputStream file = new FileInputStream(new File("ExcelRead1.xls"));

            //Get the workbook instance for XLS file 
            HSSFWorkbook workbook = new HSSFWorkbook(file);

            //Get first sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0);

            Row row = sheet.getRow(0);
            
            Cell cell = sheet.getRow(1).getCell(1);
            
            String FirstName = cell.getStringCellValue();
            
            System.out.println(FirstName);
            
            
            Thread.sleep(5000);
                        
            RGPage.clickRegLnk();
            RGPage.setFirstName(FirstName);
            /*
            //Iterate through each rows from first sheet
            Iterator < Row > rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                

                //For each row, iterate through each columns
                Iterator < Cell > cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {

                    Cell cell = cellIterator.next();

                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t\t");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t\t");
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "\t\t");
                            break;
                    }
                }
                System.out.println("");
            }
            */
            file.close();
            FileOutputStream out =
                new FileOutputStream(new File("test.xls"));
            workbook.write(out);
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
