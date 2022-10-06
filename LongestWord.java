package com.filehandling.bll;
/*
 * 2.	Write a Java program to find the longest word in a text file.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {
	  
	public static void main(String [ ] args) throws FileNotFoundException {//throw exception
          
		new LongestWord().findLongestWords();
     }

	public String findLongestWords() throws FileNotFoundException {

		String longest_word = "";
		String current;
		Scanner sc = new Scanner(new File("D://ReadLine.txt"));//existing file


		while (sc.hasNext()) {
			current = sc.next();
			if (current.length() > longest_word.length()) {//compare length of each word
				longest_word = current;//Longest word
			}

		}
		
		System.out.println("\nLongest word in Text :"+longest_word+"\n");//Display Longest word 
			return longest_word;
		
		}
	}


