package com.gentech.excel;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PersonNamesIn10thCol {
    public static void main(String[] args) {
        writeContent();
    }

    private static void writeContent() 
    {
        FileOutputStream fout = null;
        Workbook wb = null;
        Sheet sh = null;
        Row row = null;
        Cell cell = null;

        try 
        {
            wb = new XSSFWorkbook();
            sh = wb.createSheet("Sheet1");

            row = sh.createRow(0);
            cell = row.createCell(9); // 10th column (index 9)
            cell.setCellValue("John Doe");

            row = sh.createRow(1);
            cell = row.createCell(9);
            cell.setCellValue("Jane Smith");

            row = sh.createRow(2);
            cell = row.createCell(9);
            cell.setCellValue("Michael Johnson");

            row = sh.createRow(3);
            cell = row.createCell(9);
            cell.setCellValue("Emily Davis");

            row = sh.createRow(4);
            cell = row.createCell(9);
            cell.setCellValue("David Brown");

            row = sh.createRow(5);
            cell = row.createCell(9);
            cell.setCellValue("Emma Wilson");

            row = sh.createRow(6);
            cell = row.createCell(9);
            cell.setCellValue("Chris Taylor");

            row = sh.createRow(7);
            cell = row.createCell(9);
            cell.setCellValue("Sarah Moore");

            row = sh.createRow(8);
            cell = row.createCell(9);
            cell.setCellValue("Matthew Lee");

            row = sh.createRow(9);
            cell = row.createCell(9);
            cell.setCellValue("Sophia White");

            row = sh.createRow(10);
            cell = row.createCell(9);
            cell.setCellValue("James Harris");

            row = sh.createRow(11);
            cell = row.createCell(9);
            cell.setCellValue("Olivia Clark");

            row = sh.createRow(12);
            cell = row.createCell(9);
            cell.setCellValue("Joshua Lewis");

            row = sh.createRow(13);
            cell = row.createCell(9);
            cell.setCellValue("Ava Walker");

            row = sh.createRow(14);
            cell = row.createCell(9);
            cell.setCellValue("Daniel Young");

            row = sh.createRow(15);
            cell = row.createCell(9);
            cell.setCellValue("Mia King");

            row = sh.createRow(16);
            cell = row.createCell(9);
            cell.setCellValue("William Scott");

            row = sh.createRow(17);
            cell = row.createCell(9);
            cell.setCellValue("Amelia Green");

            row = sh.createRow(18);
            cell = row.createCell(9);
            cell.setCellValue("Ethan Adams");

            row = sh.createRow(19);
            cell = row.createCell(9);
            cell.setCellValue("Isabella Baker");

            fout = new FileOutputStream("C:\\Users\\ADE174\\Downloads\\ExcelAssignment\\PersonNames.xlsx");
            wb.write(fout);
            System.out.println("Excel file created successfully!");
        } catch (Exception e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                 
                    fout.close();
                    wb.close();
            }
             catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
    }
}
