package com.gentech.excel;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FlowersNameColors1stAnd2ndCol {
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

		try {
			wb = new XSSFWorkbook();
			sh = wb.createSheet("Sheet1");

			row = sh.createRow(0);
			cell = row.createCell(0); // 1st column (index 0)
			cell.setCellValue("Rose");
			cell = row.createCell(1); // 2nd column (index 1)
			cell.setCellValue("John Doe");

			row = sh.createRow(1);
			cell = row.createCell(0);
			cell.setCellValue("Lily");
			cell = row.createCell(1);
			cell.setCellValue("Jane Smith");

			row = sh.createRow(2);
			cell = row.createCell(0);
			cell.setCellValue("Tulip");
			cell = row.createCell(1);
			cell.setCellValue("Michael Johnson");

			row = sh.createRow(3);
			cell = row.createCell(0);
			cell.setCellValue("Daisy");
			cell = row.createCell(1);
			cell.setCellValue("Emily Davis");

			row = sh.createRow(4);
			cell = row.createCell(0);
			cell.setCellValue("Sunflower");
			cell = row.createCell(1);
			cell.setCellValue("David Brown");

			row = sh.createRow(5);
			cell = row.createCell(0);
			cell.setCellValue("Daffodil");
			cell = row.createCell(1);
			cell.setCellValue("Emma Wilson");

			row = sh.createRow(6);
			cell = row.createCell(0);
			cell.setCellValue("Orchid");
			cell = row.createCell(1);
			cell.setCellValue("Chris Taylor");

			row = sh.createRow(7);
			cell = row.createCell(0);
			cell.setCellValue("Lavender");
			cell = row.createCell(1);
			cell.setCellValue("Sarah Moore");

			row = sh.createRow(8);
			cell = row.createCell(0);
			cell.setCellValue("Marigold");
			cell = row.createCell(1);
			cell.setCellValue("Matthew Lee");

			row = sh.createRow(9);
			cell = row.createCell(0);
			cell.setCellValue("Jasmine");
			cell = row.createCell(1);
			cell.setCellValue("Sophia White");

			row = sh.createRow(10);
			cell = row.createCell(0);
			cell.setCellValue("Hibiscus");
			cell = row.createCell(1);
			cell.setCellValue("James Harris");

			row = sh.createRow(11);
			cell = row.createCell(0);
			cell.setCellValue("Iris");
			cell = row.createCell(1);
			cell.setCellValue("Olivia Clark");

			row = sh.createRow(12);
			cell = row.createCell(0);
			cell.setCellValue("Violet");
			cell = row.createCell(1);
			cell.setCellValue("Joshua Lewis");

			row = sh.createRow(13);
			cell = row.createCell(0);
			cell.setCellValue("Lotus");
			cell = row.createCell(1);
			cell.setCellValue("Ava Walker");

			row = sh.createRow(14);
			cell = row.createCell(0);
			cell.setCellValue("Cherry Blossom");
			cell = row.createCell(1);
			cell.setCellValue("Daniel Young");

			row = sh.createRow(15);
			cell = row.createCell(0);
			cell.setCellValue("Peony");
			cell = row.createCell(1);
			cell.setCellValue("Mia King");

			row = sh.createRow(16);
			cell = row.createCell(0);
			cell.setCellValue("Dandelion");
			cell = row.createCell(1);
			cell.setCellValue("William Scott");

			row = sh.createRow(17);
			cell = row.createCell(0);
			cell.setCellValue("Poppy");
			cell = row.createCell(1);
			cell.setCellValue("Amelia Green");

			row = sh.createRow(18);
			cell = row.createCell(0);
			cell.setCellValue("Magnolia");
			cell = row.createCell(1);
			cell.setCellValue("Ethan Adams");

			row = sh.createRow(19);
			cell = row.createCell(0);
			cell.setCellValue("Freesia");
			cell = row.createCell(1);
			cell.setCellValue("Isabella Baker");

			fout = new FileOutputStream("C:\\Users\\ADE174\\Downloads\\ExcelAssignment\\FirstNamesAndColors.xlsx");
			wb.write(fout);
			System.out.println("File Created");

		} catch (Exception e) {
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
