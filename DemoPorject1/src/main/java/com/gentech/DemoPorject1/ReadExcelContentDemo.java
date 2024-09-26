package com.gentech.DemoPorject1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelContentDemo {
    public static void main(String[] args) {
        readContent();
    }
    private static void readContent() {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        Workbook wb = null;
        Sheet sh = null;        
        Sheet sh1 = null;
        Row row = null;                
        Cell cell = null;
        try 
        {
            fin = new FileInputStream("C:\\Users\\ADE174\\Downloads\\ExcelAssignment\\Flowers.xlsx");
            wb = new XSSFWorkbook(fin);
            sh = wb.getSheet("Sheet1");
            sh1 = wb.createSheet("Sheet2");
            int rc = sh.getPhysicalNumberOfRows();
            for (int r = 0; r < rc; r++) 
            {
                row = sh.getRow(r);
                Row row1 = sh1.createRow(r); 
                int cc = row.getPhysicalNumberOfCells();
                for (int c = 0; c < cc; c++) 
                {
                    cell = row.getCell(c);
                    Cell cell1 = row1.createCell(c); 

                    String data = "";
                    if (cell != null) 
                    {
                        if (cell.getCellType() == CellType.BLANK) 
                        {
                            data = "";
                        } 
                        else if (cell.getCellType() == CellType.STRING) 
                        {
                            data = cell.getStringCellValue();
                        } 
                        else if (cell.getCellType() == CellType.NUMERIC) 
                        {
                            data = String.valueOf(cell.getNumericCellValue());
                        }
                    }
                    cell1.setCellValue(data);  
                    System.out.print(data+"  ");  
                }
                System.out.println(); 
            }
            fout = new FileOutputStream("C:\\Users\\ADE174\\Downloads\\ExcelAssignment\\Flowers.xlsx");
            wb.write(fout);
            System.out.println("Copied content from Sheet1 to Sheet2 successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                 fin.close();
                 fout.close();
                 wb.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
