package com.gentech.io;

import java.io.File;

public class FileOperationDemo {

	public static void main(String[] args) {
		createFile();
		renameFile();
		deleteFile();

	}
	public static void createFile()
	{
		try
		{
			File f=new File("E:\\Demo\\FirstFile.txt");
			boolean v=f.createNewFile();
			System.out.println(v);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void renameFile()
	{
		try
		{
			File f=new File("E:\\Demo");
			File f1=new File("E:\\Demo1.txt");
			boolean v=f.renameTo(f1);
			System.out.println(v);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteFile()
	{
		File f1=new File("E:\\Demo1.txt");
		boolean v=f1.delete();
		System.out.println("File Deleted:"+v);
	}

}
