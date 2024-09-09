package com.gentech.excel;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CityNamesDiagonal {
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

            row = sh.createRow(0);
            cell = row.createCell(0);
            cell.setCellValue("Bengaluru");

            row = sh.createRow(1);
            cell = row.createCell(1);
            cell.setCellValue("Mysuru");

            row = sh.createRow(2);
            cell = row.createCell(2);
            cell.setCellValue("Mangaluru");

            row = sh.createRow(3);
            cell = row.createCell(3);
            cell.setCellValue("Hubballi");

            row = sh.createRow(4);
            cell = row.createCell(4);
            cell.setCellValue("Belagavi");

            row = sh.createRow(5);
            cell = row.createCell(5);
            cell.setCellValue("Davanagere");

            row = sh.createRow(6);
            cell = row.createCell(6);
            cell.setCellValue("Ballari");

            row = sh.createRow(7);
            cell = row.createCell(7);
            cell.setCellValue("Vijayapura");

            row = sh.createRow(8);
            cell = row.createCell(8);
            cell.setCellValue("Shivamogga");

            row = sh.createRow(9);
            cell = row.createCell(9);
            cell.setCellValue("Tumakuru");

            row = sh.createRow(10);
            cell = row.createCell(10);
            cell.setCellValue("Kalaburagi");

            row = sh.createRow(11);
            cell = row.createCell(11);
            cell.setCellValue("Udupi");

            row = sh.createRow(12);
            cell = row.createCell(12);
            cell.setCellValue("Kolar");

            row = sh.createRow(13);
            cell = row.createCell(13);
            cell.setCellValue("Mandya");

            row = sh.createRow(14);
            cell = row.createCell(14);
            cell.setCellValue("Chitradurga");

            row = sh.createRow(15);
            cell = row.createCell(15);
            cell.setCellValue("Hassan");

            row = sh.createRow(16);
            cell = row.createCell(16);
            cell.setCellValue("Raichur");

            row = sh.createRow(17);
            cell = row.createCell(17);
            cell.setCellValue("Bidar");

            row = sh.createRow(18);
            cell = row.createCell(18);
            cell.setCellValue("Bagalkot");

            row = sh.createRow(19);
            cell = row.createCell(19);
            cell.setCellValue("Chikkamagaluru");

            fout = new FileOutputStream("C:\\Users\\ADE174\\Downloads\\ExcelAssignment\\Cities.xlsx");
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
