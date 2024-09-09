package com.gentech.excel;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Colors10thRow {
    public static void main(String[] args) {
        writeContent();
    }

    private static void writeContent() {
        FileOutputStream fout = null;
        Workbook wb = null;
        Sheet sh = null;
        Row row = null;
        Cell cell = null;

        try {
            wb = new XSSFWorkbook();
            sh = wb.createSheet("Sheet1");

            row = sh.createRow(9);
            
            cell = row.createCell(0);
            cell.setCellValue("Red");
            
            cell = row.createCell(1);
            cell.setCellValue("Green");
            
            cell = row.createCell(2);
            cell.setCellValue("Blue");
           
            cell = row.createCell(3);
            cell.setCellValue("Yellow");
            
            cell = row.createCell(4);
            cell.setCellValue("Orange");
            
            cell = row.createCell(5);
            cell.setCellValue("Purple");
           
            cell = row.createCell(6);
            cell.setCellValue("Pink");
            
            cell = row.createCell(7);
            cell.setCellValue("Brown");
            
            cell = row.createCell(8);
            cell.setCellValue("Gray");
            
            cell = row.createCell(9);
            cell.setCellValue("Cyan");
            
            cell = row.createCell(10);
            cell.setCellValue("Magenta");
            
            cell = row.createCell(11);
            cell.setCellValue("Lime");
            
            cell = row.createCell(12);
            cell.setCellValue("Teal");
            
            cell = row.createCell(13);
            cell.setCellValue("Olive");
            
            cell = row.createCell(14);
            cell.setCellValue("Navy");
            
            cell = row.createCell(15);
            cell.setCellValue("Coral");
            
            cell = row.createCell(16);
            cell.setCellValue("Salmon");
            
            cell = row.createCell(17);
            cell.setCellValue("Lavender");
            
            cell = row.createCell(18);
            cell.setCellValue("Chocolate");
            
            cell = row.createCell(19);
            cell.setCellValue("Gold");

            fout = new FileOutputStream("C:\\Users\\ADE174\\Downloads\\ExcelAssignment\\Colors.xlsx");
            wb.write(fout);
            System.out.println("Excel file created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        } 
        finally 
		{

			try 
			{

				fout.close();

				wb.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			
			}
		}
    }
}
