package com.filehandling.bll;
/*
 * 1.	Write a Java program to store text file content line by line into an array.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadLine {
	public static void main(String args[])throws Exception{
		
		try {//try block
			
			BufferedReader br = new BufferedReader(new FileReader("D://ReadLine.txt"));//Existing file
	        
			String str;
	        List<String> list = new ArrayList<String>();
	       
	        while((str =br.readLine()) != null ){
	            list.add(str);
	        }
	        
	        String[] stringArr = list.toArray(new String[0]);//text is count from line 1
	        System.out.println(" "+Arrays.toString(stringArr));  
	        br.close();
	    }
		
		catch (FileNotFoundException e) {
         System.err.println("File not found");//If file is not exist
		} 
		
	}
}




