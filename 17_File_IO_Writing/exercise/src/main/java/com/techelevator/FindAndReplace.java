package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class FindAndReplace {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter word to search: ");
        String searchWord = userInput.nextLine();

        System.out.println("What word would you replace it with?: ");
        String replacementWord = userInput.nextLine();

        System.out.println("Enter file path: ");
        String filePath = userInput.nextLine();

        System.out.println("Enter bacon file: ");
        String baconFile = userInput.nextLine();


        File file = new File(filePath);
        if(!file.exists()){
            System.out.println("File does not exist!");
        }

        try (Scanner fileScan = new Scanner(file);
        PrintWriter writer = new PrintWriter(baconFile)){
            while (fileScan.hasNextLine())
            {
                String line = fileScan.nextLine();
                writer.println(line.replace(searchWord, replacementWord));
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }




        }

    }


