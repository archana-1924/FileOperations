package com.deloitte.file.operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileOperations {
	public static void main(String[] args) {
		try 
		{
			File file = new File("C:/Users/Admin/Documents/Eclipse workspace/FileOperations/Hello.txt");
			// FileInputStream fin = new FileInputStream(file);
			FileReader fin = new FileReader(file); // reads one byte at a time
			BufferedReader br = new BufferedReader(fin); // reads one line at a time
			File file2= new File("file.txt");
			FileWriter fout = new FileWriter(file2);
			BufferedWriter bw= new BufferedWriter(fout);
			String line;
			while ((line = br.readLine()) != null)
			{
				if(line.length()>15)
				bw.append(line+"\n");
				//System.out.println(line);
			}
				br.close();
				bw.close();
		}
		/*
		 * USE this to print while using FileReader int c; while((c=fin.read())!=-1) {
		 * System.out.print((char)c); }
		 * 
		 * }
		 */
		catch (Exception ex)
		{
			System.out.println(ex);
		}

	}

}
