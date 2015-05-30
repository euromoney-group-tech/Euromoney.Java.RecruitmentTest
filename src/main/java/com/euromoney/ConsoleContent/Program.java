package com.euromoney.ConsoleContent;

import java.io.IOException;

public class Program {

	/**
	 * Initialises the application in the
	 * console.
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {


		// TODO Implement your solution...
		
		System.out.println("\nScanned the text sequence: " + content + "\n");
		System.out.println("\nTotal number of banned words: " + count + "\n");
		System.out.println("\nPress ENTER to exit!\n");
		System.in.read();
		System.out.println("\nExiting Application!\n");
	}

}
