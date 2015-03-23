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
		String[] bannedWords = {"swine","bad","nasty","horrible"};
		String content =
				"The weather in Manchester in winter is bad. It rains all the time - it must be horrible for people visiting.";
		int count = 0;
		for (String word : bannedWords) {
			if (content.toLowerCase().contains(word)) {
				count++;
			}
		}
		System.out.println("\nScanned the text sequence: " + content + "\n");
		System.out.println("\nTotal number of banned words: " + count + "\n");
		System.out.println("\nPress ENTER to exit!\n");
		System.in.read();
		System.out.println("\nExiting Application!\n");
	}

}
