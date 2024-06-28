package excelutility;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelFramework {
    XSSFWorkbook wb = null;
    XSSFSheet sheet = null;
    File src;
    FileInputStream fis;

    public void loadExcel(String path) {
        try {
            src = new File(path);
            if (!src.exists()) {
                throw new Exception("File not found: " + path);
            }
            System.out.println("Loading Excel file from path: " + path);
            fis = new FileInputStream(src);
            wb = new XSSFWorkbook(fis);
            System.out.println("Excel file loaded successfully.");
        } catch (Exception e) {
            System.out.println("Error loading Excel file: " + e.getMessage());
        }
    }

    public String getData(String sheetName, int row, int column) {
        if (wb == null) {
            throw new NullPointerException("Workbook is not loaded. Call loadExcel() first.");
        }
        sheet = wb.getSheet(sheetName);
        if (sheet == null) {
            throw new NullPointerException("Sheet " + sheetName + " does not exist.");
        }
        if (sheet.getRow(row) == null || sheet.getRow(row).getCell(column) == null) {
            return "";
        }
        CellType cellType = sheet.getRow(row).getCell(column).getCellType();
        switch (cellType) {
            case STRING:
                return sheet.getRow(row).getCell(column).getStringCellValue();
            case NUMERIC:
                return String.valueOf(sheet.getRow(row).getCell(column).getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(sheet.getRow(row).getCell(column).getBooleanCellValue());
            case FORMULA:
                return sheet.getRow(row).getCell(column).getCellFormula();
            default:
                return "";
        }
    }

    public void writeData(String sheetName, int row, int column, String data) {
        if (wb == null) {
            throw new NullPointerException("Workbook is not loaded. Call loadExcel() first.");
        }
        sheet = wb.getSheet(sheetName);
        sheet.getRow(row).createCell(column).setCellValue(data);
        try {
            FileOutputStream fos = new FileOutputStream(src);
            wb.write(fos);
            fos.close();
        } catch (Exception e) {
            System.out.println("Error writing to Excel file: " + e.getMessage());
        }
    }

    public int getRowCount(String sheetName) {
        if (wb == null) {
            throw new NullPointerException("Workbook is not loaded. Call loadExcel() first.");
        }
        int row = wb.getSheet(sheetName).getLastRowNum();
        row += 1; // Adding 1 to get the total number of rows because row index starts from 0
        return row;
    }

    public void closeExcel() {
        try {
            if (fis != null) {
                fis.close();
            }
            if (wb != null) {
                wb.close();
            }
        } catch (Exception e) {
            System.out.println("Error closing Excel file: " + e.getMessage());
        }
    }
}
