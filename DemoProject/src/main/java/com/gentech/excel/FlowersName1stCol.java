package com.gentech.excel;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FlowersName1stCol {
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
			cell.setCellValue("Rose");

			row = sh.createRow(1);
			cell = row.createCell(0);
			cell.setCellValue("Tulip");

			row = sh.createRow(2);
			cell = row.createCell(0);
			cell.setCellValue("Lily");

			row = sh.createRow(3);
			cell = row.createCell(0);
			cell.setCellValue("Sunflower");

			row = sh.createRow(4);
			cell = row.createCell(0);
			cell.setCellValue("Daisy");

			row = sh.createRow(5);
			cell = row.createCell(0);
			cell.setCellValue("Marigold");

			row = sh.createRow(6);
			cell = row.createCell(0);
			cell.setCellValue("Carnation");

			row = sh.createRow(7);
			cell = row.createCell(0);
			cell.setCellValue("Orchid");

			row = sh.createRow(8);
			cell = row.createCell(0);
			cell.setCellValue("Peony");

			row = sh.createRow(9);
			cell = row.createCell(0);
			cell.setCellValue("Chrysanthemum");

			row = sh.createRow(10);
			cell = row.createCell(0);
			cell.setCellValue("Hydrangea");

			row = sh.createRow(11);
			cell = row.createCell(0);
			cell.setCellValue("Jasmine");

			row = sh.createRow(12);
			cell = row.createCell(0);
			cell.setCellValue("Lavender");

			row = sh.createRow(13);
			cell = row.createCell(0);
			cell.setCellValue("Lilac");

			row = sh.createRow(14);
			cell = row.createCell(0);
			cell.setCellValue("Geranium");

			row = sh.createRow(15);
			cell = row.createCell(0);
			cell.setCellValue("Zinnia");

			row = sh.createRow(16);
			cell = row.createCell(0);
			cell.setCellValue("Pansy");

			row = sh.createRow(17);
			cell = row.createCell(0);
			cell.setCellValue("Dahlia");

			row = sh.createRow(18);
			cell = row.createCell(0);
			cell.setCellValue("Snapdragon");

			row = sh.createRow(19);
			cell = row.createCell(0);
			cell.setCellValue("Freesia");

			fout = new FileOutputStream("C:\\Users\\ADE174\\Downloads\\ExcelAssignment\\Flowers.xlsx");
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
