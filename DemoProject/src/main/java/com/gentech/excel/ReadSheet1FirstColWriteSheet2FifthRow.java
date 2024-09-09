package com.gentech.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSheet1FirstColWriteSheet2FifthRow {

	public static void main(String[] args) {
		readAndWrite();

	}
	private static void readAndWrite()
	{
	 
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Sheet sh1=null;
		Row row=null;
		Row row1=null;
		Cell cell=null;
		Cell cell1=null;
		try
		{
			fin=new FileInputStream("C:\\Users\\ADE174\\Downloads\\ExcelAssignment\\Vegitables.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("sheet1");
			sh1=wb.createSheet("Sheet2");
			int rc=sh.getPhysicalNumberOfRows();
			row1=sh1.createRow(4);
			for(int r=0; r<rc;r++)
			{
				row=sh.getRow(r);				
				int cc=row.getPhysicalNumberOfCells();
				String data="";
				for(int c=0;c<cc;c++)
				{
					 cell=row.getCell(c);
					cell1=row1.createCell(r);
					
					if(cell.getCellType()==CellType.BLANK)
					{
						data=" ";						
					}
					if(cell.getCellType()==CellType.STRING)
					{
						data=cell.getStringCellValue();
					}
					if(cell.getCellType()==CellType.NUMERIC)
					{
						data=String.valueOf(cell.getNumericCellValue());
					}
					cell1.setCellValue(data);
					System.out.println(data+" ");
			   }
				System.out.println(" ");	
				fout=new FileOutputStream("C:\\Users\\ADE174\\Downloads\\ExcelAssignment\\Vegitables.xlsx");
				wb.write(fout);
				
			}System.out.println("------------Data Writen in Sheet2------------");			 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
				sh=null;
				row=null;
				row1=null;
				cell=null;
				cell1=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
