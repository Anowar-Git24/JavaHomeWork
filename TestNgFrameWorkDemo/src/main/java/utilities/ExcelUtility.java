package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility {

	public List<List<String>> readExcel(String filepath,String sheetname){
		List<List<String>> data =new ArrayList<>();
		try {
			FileInputStream excelfile =new FileInputStream(new File(filepath));
			Workbook workbook=new XSSFWorkbook(excelfile);
			Sheet sheet=workbook.getSheet(sheetname);
			for(Row row: sheet) {
				List<String> rowdata=new ArrayList<>();
				for(Cell cell: row) {
					cell.setCellType(CellType.STRING);
					rowdata.add(cell.getStringCellValue());
				}
				data.add(rowdata);
			}
			workbook.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return data;
	}
}
