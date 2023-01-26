package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class WordSearch {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter file path: ");
		String fileToFind = userInput.nextLine();
		System.out.println("Enter the word to search: ");
		String wordToSearch = userInput.nextLine();
		System.out.println("Is this case sensitive Y/N?: ");
		String caseSensitive = userInput.nextLine();
		int lineCount =0;



		File bookFile = new File(fileToFind);
		boolean isCaseSen = caseSensitive.equalsIgnoreCase("y");


		try (Scanner fileInput = new Scanner(bookFile)) {
			while (fileInput.hasNextLine()) {
				String linesOfText = fileInput.nextLine();
				lineCount++;

				if(isCaseSen && linesOfText.contains(wordToSearch)){
					System.out.println(lineCount + " : " + linesOfText);
				}


				else if (!isCaseSen && linesOfText.toLowerCase().contains(wordToSearch.toLowerCase())) {
					System.out.println(lineCount + " : " + linesOfText);
				}



			}


		} catch (FileNotFoundException e) {
			System.out.println("Your file doesn't exist " + bookFile.getAbsolutePath());


		}

	}
}



