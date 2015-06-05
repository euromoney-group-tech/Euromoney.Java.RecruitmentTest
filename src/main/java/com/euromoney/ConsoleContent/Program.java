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

 		String[] negativeWords = {"swine","bad","nasty","horrible"};<br>
 		String content = "The weather in Manchester in winter is bad. It rains all the time - it must be horrible for people visiting.";

		// TODO Implement your logic to analyze the text.
		//  As first approximation the content can be considered as a sequence
		//   of words where each word is a sequence of letters of the basic alphabet [a-z].
		//  If usefull, you are allowed to use any java external libraries.
		
		System.out.println("\nScanned the text sequence: " + content + "\n");
		System.out.println("\nTotal number of banned words: " + count + "\n");
		System.out.println("\nPress ENTER to exit!\n");
		System.in.read();
		System.out.println("\nExiting Application!\n");
	}

}
