package utilities;

import java.io.InputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

    public static Object[][] getData(String sheetName) {

        Object[][] data = null;

        try {

            InputStream is = ExcelUtil.class
                    .getClassLoader()
                    .getResourceAsStream("testdata/LoginData.xlsx");

            if (is == null) {
                throw new RuntimeException("Excel file not found inside testdata folder");
            }

            Workbook workbook = new XSSFWorkbook(is);
            Sheet sheet = workbook.getSheet(sheetName);

            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

            data = new Object[rowCount - 1][colCount];

            for (int i = 1; i < rowCount; i++) {

                Row row = sheet.getRow(i);

                for (int j = 0; j < colCount; j++) {
                    data[i - 1][j] = row.getCell(j).toString();
                }
            }

            workbook.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }
}