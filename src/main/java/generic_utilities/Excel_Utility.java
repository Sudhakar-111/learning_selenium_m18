package generic_utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {

    private Workbook workbook;
    private Sheet sheet;

    // Constructor - opens Excel file and sheet
    public Excel_Utility(String filePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        workbook = WorkbookFactory.create(fis);
        sheet = workbook.getSheet(sheetName);
    }

    // Get total row count
    public int getRowCount() {
        return sheet.getLastRowNum();
    }

    // Get total column count
    public int getColumnCount() {
        return sheet.getRow(0).getLastCellNum();
    }

    // Get data from specific cell
    public String getCellData(int rowNum, int colNum) {
        DataFormatter formatter = new DataFormatter();
        return formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
    }

    // Close workbook
    public void closeWorkbook() throws IOException {
        workbook.close();
    }
}
