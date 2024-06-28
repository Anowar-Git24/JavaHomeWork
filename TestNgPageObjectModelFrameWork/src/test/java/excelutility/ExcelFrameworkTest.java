package excelutility;

public class ExcelFrameworkTest {
    public static void main(String[] args) {
        ExcelFramework excel = new ExcelFramework();

        // Load the Excel file from the specified absolute path
        String filePath = "/Users/mdhossain/Desktop/TestCase/nopCommerce.xlsx";
        excel.loadExcel(filePath);

        try {
            // Read and print data from multiple cells
            for (int i = 0; i < excel.getRowCount("Sheet1"); i++) {
                for (int j = 0; j < 5; j++) { // Adjust the number of columns as needed
                    String data = excel.getData("Sheet1", i, j);
                    System.out.println("Data at row " + i + ", column " + j + ": " + data);
                }
            }

            // Write data to the Excel file
            excel.writeData("Sheet1", 1, 0, "New Data");

            // Get the row count
            int rowCount = excel.getRowCount("Sheet1");
            System.out.println("Row count: " + rowCount);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the Excel file
            excel.closeExcel();
        }
    }
}
