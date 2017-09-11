package com.chaitu.prac;
//editing
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExceptionHandling {

		public static void main(String[] args) {
			try {
				testExceptions();
			} catch (FileNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		public static void testExceptions() throws IOException, FileNotFoundException{
			
		}
	}

