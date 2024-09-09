package com.gentech.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadSheet1First2ndColWriteSheet24thFifthRow
{
    public static void main(String[] args) {
        readAndWriteContent();
    }
    private static void readAndWriteContent() 
    {
    	FileInputStream fin=null;
    	FileOutputStream fout=null;
    	Workbook wb=null;
    	Sheet sh1=null;
    	Sheet sh2=null;
    	Row row=null;
    	Cell cell=null;
    	try
    	{
    		fin=new FileInputStream("C:\\Users\\ADE174\\Downloads\\ExcelAssignment\\FirstNamesAndColors.xlsx");
    		wb=new XSSFWorkbook(fin);
    		sh1=wb.getSheet("Sheet1");
    		sh2=wb.createSheet("Sheet2");
    		Row row1=sh2.createRow(3);
    		Row row2=sh2.createRow(4);
    		int rc=sh1.getPhysicalNumberOfRows();
    		for(int r=0;r<rc;r++)
    		{
    			row=sh1.getRow(r);
    			 
    			 
    				cell=row.getCell(0);  				
    				String data="" ;   				
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
    				Cell cell1=row1.createCell(r);
    				cell1.setCellValue(data);
    				System.out.println(data+" ");
    				
    				cell=row.getCell(1);
    				String data1="";
    				if(cell.getCellType()==CellType.BLANK)
    				{
    					data1=" ";
    				}
    				if(cell.getCellType()==CellType.STRING)
    				{
    					data1=cell.getStringCellValue();
    				}
    				if(cell.getCellType()==CellType.NUMERIC)
    				{
    					data1=String.valueOf(cell.getNumericCellValue());
    				}
    				Cell cell2=row2.createCell(r);
    				cell2.setCellValue(data1);
    				System.out.println(data1+" ");
    		}
    		 
    		fout=new FileOutputStream("C:\\Users\\ADE174\\Downloads\\ExcelAssignment\\FirstNamesAndColors.xlsx");
    		wb.write(fout);
    		System.out.println("Data Written in Sheet2");
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		try
        	{
        	 	fin.close();
                fout.close();
                wb.close();
                
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        	}
    	}
    }
    
} 