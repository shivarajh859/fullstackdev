package com.gentech.DemoPorject1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {

    public static void main(String[] args) {
        readFromSheet1AndWriteToSheet2();
    }

    private static void readFromSheet1AndWriteToSheet2() {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        Workbook wb = null;
        Sheet sh1 = null; // Source sheet
        Sheet sh2 = null; // Target sheet
        Row row = null;
        Cell cell = null;

        try {
            fin = new FileInputStream("C:\\Users\\ADE174\\Downloads\\ExcelAssignment\\Flowers.xlsx");
            wb = new XSSFWorkbook(fin);

            // Accessing Sheet1
            sh1 = wb.getSheet("Sheet1");
            if (sh1 == null) {
                System.out.println("Sheet1 not found.");
                return;
            }

            // Creating or accessing Sheet2
            sh2 = wb.createSheet("Sheet2");

            int rowCount = sh1.getPhysicalNumberOfRows();

            for (int r = 0; r < rowCount; r++) {
                row = sh1.getRow(r);
                if (row == null) {
                    continue; // Skip empty rows
                }

                Row newRow = sh2.createRow(r); // Create a new row in Sheet2

                int cellCount = row.getPhysicalNumberOfCells();

                for (int c = 0; c < cellCount; c++) {
                    cell = row.getCell(c);
                    Cell newCell = newRow.createCell(c); // Create a new cell in Sheet2

                    if (cell == null) {
                        newCell.setCellValue(""); // Handle empty cells
                        continue;
                    }

                    String data = "";

                    if (cell.getCellType() == CellType.STRING) {
                        data = cell.getStringCellValue();
                    } else if (cell.getCellType() == CellType.NUMERIC) {
                        data = String.valueOf(cell.getNumericCellValue());
                    }

                    newCell.setCellValue(data); // Write data to the new cell
                }
            }

            // Save the changes to the file
            fout = new FileOutputStream("C:\\Users\\ADE174\\Downloads\\ExcelAssignment\\Flowers.xlsx");
            wb.write(fout);
            System.out.println("Content copied from Sheet1 to Sheet2 successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fout != null) fout.close();
                if (wb != null) wb.close();
                if (fin != null) fin.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
