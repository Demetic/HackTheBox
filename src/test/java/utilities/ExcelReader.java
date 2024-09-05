package utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    Workbook workbook;
    Sheet sheet;

    public ExcelReader(String path, String sheet1){

        try {
            FileInputStream fis = new FileInputStream(path);
            workbook = WorkbookFactory.create(fis);
            sheet=workbook.getSheet(sheet1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Satir ve sutun sayilarini girdigimizde, o hucredeki veriyi return eden method
    public String getCellData(int row,int column){
        Cell cell = sheet.getRow(row).getCell(column);
        return cell.toString();

    }
    //Exceldeki satir sayisini return eden method
    public int rowCount(){
        return sheet.getLastRowNum();
    }
}