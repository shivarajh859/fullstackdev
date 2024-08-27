package com.gentech.io;

import java.io.File;

public class FolderOperationDemo {

	public static void main(String[] args) {
		creatFolder();
		createNestedFolder();
		renameFolder();
		deleteFolder();
		folderCollection();

	}
	public static void creatFolder()
	{
		try
		{
			File f=new File("E:\\DemoFolder");
			boolean v=f.mkdir();
			System.out.println("Folder Created:"+v);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void createNestedFolder()
	{
		try
		{
			File f=new File("E:\\Demo1\\\\Demo2\\\\Demo3\\\\Demo4");
			boolean v=f.mkdirs();
			System.out.println("Nested Folder Created:"+v);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void renameFolder()
	{
		try
		{
			File f=new File("E:\\DemoFolder");
			File f1=new File("E:\\DemoFolder1");
			
			boolean v=f.renameTo(f1);
			System.out.println("Folder Renamed:"+v);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteFolder()
	{
		try
		{		 
			File f1=new File("E:\\DemoFolder1");
			boolean v=f1.delete();
			System.out.println("Folder Deleted:"+v);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void folderCollection( )
	{
		File f=new File("E:\\Demo1");
		File f1[]=f.listFiles();
		for(int i=0;i<f1.length;i++)
		{
			if(f1[i].isDirectory()==true)
			{
				String path=f1[i].getAbsolutePath();
				System.out.println(path);
				 
			}
		}
	}
	
}
