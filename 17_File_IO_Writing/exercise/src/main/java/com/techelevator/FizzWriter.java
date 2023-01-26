package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter file path: ");
		String filePath = input.nextLine();
		File fizzBuzz = new File(filePath);





		try (PrintWriter fiBu = new PrintWriter(fizzBuzz)) {
			for (int i = 1; i < 301; i++) {
				if (i % 15 == 0) {
					fiBu.println("FizzBuzz");
				} else if (i % 5 == 0) {
					fiBu.println("Buzz");
				} else if (i % 3 == 0) {
					fiBu.println("Fizz");
				}
				else {
					fiBu.println(i);
				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("File is not there.");
		}
	}
}